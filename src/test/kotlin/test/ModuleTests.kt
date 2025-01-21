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
        val nfTestMainPath: Path = Paths.get("test/cadd/tests/main.nf.test")

        val outputPath: Path = Paths.get("test/cadd/tests/main.nf.test")

        val expectedMD5 = "c1bbabe2cd0c1634f479cd09a0ad0d21"

        val args = arrayOf("--main", "$mainPath", "--test", "$pyTestMainPath", "--output", "$nfTestMainPath")
        TestConverter.main(args)

        val actualMD5 = computeMD5Checksum(outputPath)

        assertEquals(expectedMD5, actualMD5) { "Failed to convert 'CADD': $actualMD5 != $expectedMD5" }
    }

    @Test
    fun testAMPS() {
        val mainPath: Path = Paths.get("test/amps/main.nf")
        val pyTestMainPath: Path = Paths.get("test/amps/tests/main.nf")
        val nfTestMainPath: Path = Paths.get("test/amps/tests/main.nf.test")

        val outputPath: Path = Paths.get("test/amps/tests/main.nf.test")

        val expectedMD5 = "e51ec3861640af35d669350bed9dbe69"

        val args = arrayOf("--main", "$mainPath", "--test", "$pyTestMainPath", "--output", "$nfTestMainPath")
        TestConverter.main(args)

        val actualMD5 = computeMD5Checksum(outputPath)

        assertEquals(expectedMD5, actualMD5) { "Failed to convert 'AMPS': $actualMD5 != $expectedMD5" }
    }

    private fun computeMD5Checksum(path: Path): String = Files.readAllBytes(path)
        .let { MessageDigest.getInstance("MD5").digest(it) }
        .joinToString("") { "%02x".format(it) }
}