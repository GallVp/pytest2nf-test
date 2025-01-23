package io.github.gallvp.converter

data class ComponentNFTest(
    val name: String,
    val type: String,
    val mainFileRelativeToTestFilePath: String,
    val tests: List<NFTest>,
    val hasConfig: Boolean,
    val tags: List<String>
) {

    private val nameInUpper = name.uppercase()
    private val tagsText = tags.joinToString("\n") { "tag \"$it\"" }

    val fileText: String
        get() = """
        |nextflow_$type {
        |
        |    name "Test Process $nameInUpper"
        |    ${if (hasConfig) "config \"./nextflow.test.config\"" else ""}
        |    script "$mainFileRelativeToTestFilePath"
        |    process "$nameInUpper"
        |   
        |${tagsText.split("\n").joinToString("\n") { "    $it" }}
        |   
        |${tests.joinToString("\n") { "$it" }.split("\n").joinToString("\n") { "    $it" }}
        |}
        """.trimMargin()
}