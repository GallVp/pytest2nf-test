package test

import io.github.gallvp.converter.TestConverter
import org.junit.jupiter.api.Assertions.assertEquals
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.security.MessageDigest
import kotlin.test.Test

class WorkflowTests {
    @Test
    fun testVCFPhaseShapeIt5() {
        val mainPath: Path = Paths.get("test/vcf_phase_shapeit5/main.nf")
        val pyTestMainPath: Path = Paths.get("test/vcf_phase_shapeit5/tests/pytest/main.nf")
        val nfTestMainPath: Path = Paths.get("test/vcf_phase_shapeit5/tests/main.nf.test")

        val outputPath: Path = Paths.get("test/vcf_phase_shapeit5/tests/main.nf.test")
        val outputConfigPath = Paths.get("test/vcf_phase_shapeit5/tests/nextflow.config")

        val expectedMD5 = "3c85c73a7f9565343d0c2f9d1a83c0d9"
        val expectedConfigMD5 = "f5301dfad1d48e33f531ff116a26f461"

        val args = arrayOf("--main", "$mainPath", "--test", "$pyTestMainPath", "--output", "$nfTestMainPath")
        TestConverter.main(args)

        val actualMD5 = computeMD5Checksum(outputPath)
        val actualConfigMD5 = computeMD5Checksum(outputConfigPath)

        assertEquals(expectedMD5, actualMD5) { "Failed to convert 'VCF_PHASE_SHAPEIT5': $actualMD5 != $expectedMD5" }
        assertEquals(
            expectedConfigMD5,
            actualConfigMD5
        ) { "Failed to convert 'VCF_PHASE_SHAPEIT5' config: $actualConfigMD5 != $expectedConfigMD5" }
    }

    private fun computeMD5Checksum(path: Path): String = Files.readAllBytes(path)
        .let { MessageDigest.getInstance("MD5").digest(it) }
        .joinToString("") { "%02x".format(it) }
}