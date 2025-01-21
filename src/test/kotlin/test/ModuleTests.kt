package test

import io.github.gallvp.converter.TestConverter
import org.junit.jupiter.api.Assertions.assertEquals
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.security.MessageDigest
import kotlin.test.Test

class ModuleTests {

    @Test
    fun testCADD() {
        val mainPath: Path = Paths.get("test/cadd/main.nf")
        val pyTestMainPath: Path = Paths.get("test/cadd/tests/main.nf")

        val outputPath: Path = Paths.get("test/cadd/tests/main.nf.test")

        val expectedMD5 = "c1bbabe2cd0c1634f479cd09a0ad0d21"

        val args = arrayOf("--main", "$mainPath", "--test", "$pyTestMainPath")
        TestConverter.main(args)

        val actualMD5 = computeMD5Checksum(outputPath)

        assertEquals(expectedMD5, actualMD5) { "Failed to convert 'CADD': $actualMD5 != $expectedMD5" }
    }

    private fun computeMD5Checksum(path: Path): String = Files.readAllBytes(path)
        .let { MessageDigest.getInstance("MD5").digest(it) }
        .joinToString("") { "%02x".format(it) }
}