/**
 * Copyright © 2024 Apple Inc. and the Pkl project authors. All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.pkl.core.util;

import com.jcraft.jsch.ChannelSftp;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;
import com.jcraft.jsch.SftpException;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.BufferedReader;
import java.io.FileReader;
import java.net.URI;
import java.util.Properties;

import static org.pkl.core.util.SshUtils.isSshUrl;

public final class SshIoUtils {

    private SshIoUtils() {}

    private static final String DEFAULT_KEY_PATH = System.getProperty("user.home") + "/.ssh/id_rsa";


    public static String getPrivateKeyPath() {
        return DEFAULT_KEY_PATH;
    }

    public static String readPrivateKey(String privateKeyPath) throws IOException {
        StringBuilder privateKeyContent = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(privateKeyPath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                privateKeyContent.append(line).append("\n");
            }
        }
        return privateKeyContent.toString();
    }


    

    public static byte[] readBytes(URI uri) throws IOException {
        if (!SshUtils.isSshUrl(uri)) {
            throw new IllegalArgumentException("URI scheme is not ssh: " + uri);
        }

        String userInfo = uri.getUserInfo();
        if (userInfo == null) {
            throw new IllegalArgumentException("URI must contain user info");
        }

        String[] userParts = userInfo.split("@");
        String username = userParts[0];
        String host = uri.getHost();
        int port = uri.getPort() == -1 ? 22 : uri.getPort();
        String path = uri.getPath();

        JSch jsch = new JSch();
        Session session = null;
        ChannelSftp channelSftp = null;
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        try {
            String privateKeyPath = getPrivateKeyPath();

            jsch.addIdentity(readPrivateKey(privateKeyPath));

            session = jsch.getSession(username, host, port);

            Properties config = new Properties();
            config.put("PreferredAuthentications", "publickey");
            config.put("StrictHostKeyChecking", "no");
            session.setConfig(config);

            session.connect();

            channelSftp = (ChannelSftp) session.openChannel("sftp");
            channelSftp.connect();

            try (InputStream inputStream = channelSftp.get(path)) {
                byte[] buffer = new byte[1024];
                int bytesRead;

                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                }
            }

            return outputStream.toByteArray();
        } catch (JSchException | SftpException e) {
            throw new IOException("Error reading file over SSH: " + uri, e);
        } finally {
            if (channelSftp != null && channelSftp.isConnected()) {
                channelSftp.disconnect();
            }
            if (session != null && session.isConnected()) {
                session.disconnect();
            }
        }
    }
}
