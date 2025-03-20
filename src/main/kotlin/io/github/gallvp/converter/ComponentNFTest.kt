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
        get() {

            val typeName = if (type == "process") "Process" else "Workflow"

            return """
            |nextflow_$type {
            |
            |    name "Test $typeName $nameInUpper"
            |    ${if (hasConfig) "config \"./nextflow.config\"" else ""}
            |    script "$mainFileRelativeToTestFilePath"
            |    $type "$nameInUpper"
            |   
            |${tagsText.split("\n").joinToString("\n") { "    $it" }}
            |   
            |${tests.joinToString("\n") { "$it" }.split("\n").joinToString("\n") { "    $it" }}
            |}""".trimMargin()
        }
}