package io.github.gallvp.converter

data class ConfigAssignment(val targetName: String, val assignments: List<String>)

val List<ConfigAssignment>.configText: String
    get() {
        val selectorBlocks = this.map {
            """
            |withName: "${it.targetName}" {
            |    ${it.assignments.joinToString("\n") { "ext.args = " + "params.module_args" }}
            |}
        """.trimMargin()
        }

        return """
            |process {
            |${selectorBlocks.joinToString("\n\n").split("\n").joinToString("\n") { "    $it" }}
            |}
            |""".trimMargin()
    }