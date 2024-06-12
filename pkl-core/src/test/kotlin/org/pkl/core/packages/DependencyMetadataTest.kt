package org.pkl.core.packages;

import org.pkl.core.Version
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import java.io.ByteArrayOutputStream
import java.net.URI
import java.nio.charset.StandardCharsets

class DependencyMetadataTest {
  private val dependencyMetadata = DependencyMetadata(
    "my-proj-name",
    PackageUri("package://example.com/my-proj-name@0.10.0"),
    Version.parse("0.10.0"),
    URI("https://example.com/foo/bar@0.5.3.zip"),
    Checksums("abc123"),
    mapOf(
      "foo" to Dependency.RemoteDependency(PackageUri("package://example.com/foo@0.5.3"), Checksums("abc123")),
    ),
    "https://example.com/my/source/0.5.3/blob%{path}#L%{line}-L%{endLine}",
    URI("https://example.com/my/source"),
    URI("https://example.com/my/docs"),
    "MIT",
    "The MIT License, you know it",
    listOf("birdy@bird.com"),
    URI("https://example.com/issues"),
    "Some package description"
  )

  private val dependencyMetadataStr = """
     {
       "name": "my-proj-name",
       "packageUri": "package://example.com/my-proj-name@0.10.0",
       "version": "0.10.0",
       "packageZipUrl": "https://example.com/foo/bar@0.5.3.zip",
       "packageZipChecksums": {
         "sha256": "abc123"
       },
       "dependencies": {
         "foo": {
           "uri": "package://example.com/foo@0.5.3",
           "checksums": {
             "sha256": "abc123"
           }
         }
       },
       "sourceCodeUrlScheme": "https://example.com/my/source/0.5.3/blob%{path}#L%{line}-L%{endLine}",
       "sourceCode": "https://example.com/my/source",
       "documentation": "https://example.com/my/docs",
       "license": "MIT",
       "licenseText": "The MIT License, you know it",
       "authors": [
         "birdy@bird.com"
       ],
       "issueTracker": "https://example.com/issues",
       "description": "Some package description"
     }
    """.trimIndent()

  @Test
  fun parse() {
    val parsed = DependencyMetadata.parse(dependencyMetadataStr)
    assertThat(parsed).isEqualTo(dependencyMetadata)
  }

  @Test
  fun writeTo(){
    val str = ByteArrayOutputStream()
      .apply { dependencyMetadata.writeTo(this) }
      .toString(StandardCharsets.UTF_8)
    assertThat(str).isEqualTo(dependencyMetadataStr)
  }
}
