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
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Properties;
import org.pkl.core.PklBugException;



public final class SshUtils {
  private SshUtils() {}

  public static boolean isSshUrl(URL url) {
    var protocol = url.getProtocol();
    return "ssh".equalsIgnoreCase(protocol);
  }


  public static boolean isSshUrl(URI uri) {
    var protocol = uri.getScheme();
    return "ssh".equalsIgnoreCase(protocol);
  }

  public static boolean validateUri(URI uri) {
    if (!isSshUrl(uri)) {
      return false;
    }
    String userInfo = uri.getUserInfo();
    if (userInfo == null) {
      return false;
    }
    String[] userParts = userInfo.split("@");
    if (userParts.length != 2) {
      return false;
    }
    String username = userParts[0];
    String host = uri.getHost();
    if (host == null) {
      return false;
    }
    int port = uri.getPort();
    if (port < 0 || port > 65535) {
      return false;
    }
    return true;
  }



  public static URI setPort(URI uri, int port) {
    if (port < 0 || port > 65535) {
      throw new IllegalArgumentException(String.valueOf(port));
    }
    try {
      return new URI(
          uri.getScheme(),
          uri.getUserInfo(),
          uri.getHost(),
          port,
          uri.getPath(),
          uri.getQuery(),
          uri.getFragment());
    } catch (URISyntaxException e) {
      throw PklBugException.unreachableCode(); // only port changed
    }
  }
}
