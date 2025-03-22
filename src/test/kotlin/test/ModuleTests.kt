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
        val pyTestMainPath: Path = Paths.get("test/cadd/tests/pytest/main.nf")
        val nfTestMainPath: Path = Paths.get("test/cadd/tests/main.nf.test")
        val testDataConfigPath: Path = Paths.get("test/test_data.config")

        val outputPath: Path = Paths.get("test/cadd/tests/main.nf.test")

        val expectedMD5 = "ea18faaf149074ef49bcc8102e63f768"

        val args = arrayOf(
            "--main",
            "$mainPath",
            "--test",
            "$pyTestMainPath",
            "--output",
            "$nfTestMainPath",
            "--data-dict",
            "$testDataConfigPath"
        )
        TestConverter.main(args)

        val actualMD5 = computeMD5Checksum(outputPath)

        assertEquals(expectedMD5, actualMD5) { "Failed to convert 'CADD': $actualMD5 != $expectedMD5" }
    }

    @Test
    fun testAMPS() {
        val mainPath: Path = Paths.get("test/amps/main.nf")
        val pyTestMainPath: Path = Paths.get("test/amps/tests/pytest/main.nf")
        val nfTestMainPath: Path = Paths.get("test/amps/tests/main.nf.test")
        val testDataConfigPath: Path = Paths.get("test/test_data.config")

        val outputPath: Path = Paths.get("test/amps/tests/main.nf.test")
        val outputConfigPath = Paths.get("test/amps/tests/nextflow.config")

        val expectedMD5 = "394db85c189c69a01d00c628a765cdae"
        val expectedConfigMD5 = "51ffd764fcb8d79f68be4b1afd4b6437"

        val args = arrayOf(
            "--main",
            "$mainPath",
            "--test",
            "$pyTestMainPath",
            "--output",
            "$nfTestMainPath",
            "--data-dict",
            "$testDataConfigPath"
        )
        TestConverter.main(args)

        val actualMD5 = computeMD5Checksum(outputPath)
        val actualConfigMD5 = computeMD5Checksum(outputConfigPath)

        assertEquals(expectedMD5, actualMD5) { "Failed to convert 'AMPS': $actualMD5 != $expectedMD5" }
        assertEquals(
            expectedConfigMD5,
            actualConfigMD5
        ) { "Failed to convert 'AMPS' config: $actualConfigMD5 != $expectedConfigMD5" }
    }

    private fun computeMD5Checksum(path: Path): String = Files.readAllBytes(path)
        .let { MessageDigest.getInstance("MD5").digest(it) }
        .joinToString("") { "%02x".format(it) }
}