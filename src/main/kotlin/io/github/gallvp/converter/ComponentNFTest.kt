package io.github.gallvp.converter

data class ComponentNFTest(
    val name: String,
    val type: String,
    val relativeScriptPath: String,
    val tests: List<NFTest>
) {

    private val nameInUpper = name.uppercase()
    private val tags: List<String>
        get() {
            val default = listOf("modules")

            return if (this.name.split("/").size == 1) {
                default + listOf(this.name)
            } else {
                default + listOf(this.name.split("/").first(), this.name)
            }
        }

    val fileText: String
        get() = """
        |nextflow_$type {
        |
        |    name "Test Process $nameInUpper"
        |    script "$relativeScriptPath"
        |    process "$nameInUpper"
        |   
        |${tags.joinToString("\n") { "    tag \"$it\"" }}
        |   
        |${tests.joinToString("\n") { "$it" }.split("\n").joinToString("\n") { "    $it"}}
        |}
        """.trimMargin()
}