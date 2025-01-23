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

        val expectedMD5 = "3e9c80f922e4a4e0e5dee58e005fcfb1"

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
        val outputConfigPath = Paths.get("test/amps/tests/nextflow.test.config")

        val expectedMD5 = "dea70d1e0a1d9aafe645f4960985462d"
        val expectedConfigMD5 = "51ffd764fcb8d79f68be4b1afd4b6437"

        val args = arrayOf("--main", "$mainPath", "--test", "$pyTestMainPath", "--output", "$nfTestMainPath")
        TestConverter.main(args)

        val actualMD5 = computeMD5Checksum(outputPath)
        val actualConfigMD5 = computeMD5Checksum(outputConfigPath)

        assertEquals(expectedMD5, actualMD5) { "Failed to convert 'AMPS': $actualMD5 != $expectedMD5" }
        assertEquals(expectedConfigMD5, actualConfigMD5) { "Failed to convert 'AMPS' config: $actualConfigMD5 != $expectedConfigMD5" }
    }

    private fun computeMD5Checksum(path: Path): String = Files.readAllBytes(path)
        .let { MessageDigest.getInstance("MD5").digest(it) }
        .joinToString("") { "%02x".format(it) }
}