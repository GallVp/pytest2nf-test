package io.github.gallvp.converter

import org.slf4j.Logger
import org.slf4j.LoggerFactory

data class NFTest(val name: String, val whenBlock: String, val thenBlock: String, val setupBlock: String? = null) {
    override fun toString(): String {

        val setupBlockComplete = setupBlock?.let { setup ->
            """
                |
                |setup {
                |
                |${setup.split("\n").joinToString("\n") { "    $it" }}
                |
                |}
                |
            """.trimMargin()
        } ?: ""

        return """
                |test("$name") {
                |${setupBlockComplete.split("\n").joinToString("\n") { "    $it" }}
                |    when {
                |        process {
                |            ${"\"\"\""}
                |${whenBlock.split("\n").joinToString("\n") { "            $it" }}
                |            ${"\"\"\""}
                |        }    
                |    }
                |
                |    then {
                |${thenBlock.split("\n").joinToString("\n") { "        $it" }}
                |    }
                |
                |}
            """.trimMargin()
    }

    companion object {
        fun from(pyTest: PyTest, componentName: String): NFTest {
            val targetComponentExpression = pyTest.expressions.filter { it.component.lowercase() == componentName }

            require(targetComponentExpression.size == 1) {
                "None of the expressions in pytest ${pyTest.name} matches the component name $componentName"
            }

            logger.debug(
                "Building inputs block for {} with arguments: {}",
                pyTest.name,
                targetComponentExpression.first().arguments
            )

            val inputsBlock = targetComponentExpression.first().arguments.let { args ->
                pyTestArgumentsToNFTestInputs(pyTest, args)
            }

            val setupComponents = pyTest.expressions.filter { it.component.lowercase() != componentName }

            logger.debug("Setup components: {}", setupComponents.map { it.component })

            val setupBlock = if (setupComponents.isEmpty()) {
                null
            } else {
                setupComponents.joinToString("\n\n") { expression ->
                    val setupComponentName = expression.component
                    val componentArguments = expression.arguments
                    val componentPathName = setupComponentName.replace("_", "/").lowercase()

                    logger.debug("Setup component: {} with arguments: {}", setupComponentName, componentArguments)

                    val formattedInputs = pyTestArgumentsToNFTestInputs(pyTest, componentArguments).split("\n")
                        .joinToString("\n") { "        $it" }

                    """
                    |run("$setupComponentName") {
                    |    script "../../../$componentPathName/main.nf"
                    |    process {
                    |        ${"\"\"\""}
                    |$formattedInputs
                    |        ${"\"\"\""}
                    |    }
                    |}
                """.trimMargin()
                }
            }

            val whenBlock = inputsBlock

            val thenBlock = """
                |assertAll(
                |    { assert process.success },
                |    { assert snapshot(process.out).match() }
                |)
                """.trimMargin()

            return NFTest(pyTest.name, whenBlock, thenBlock, setupBlock)
        }

        private fun pyTestArgumentsToNFTestInputs(pyTest: PyTest, arguments: List<String>): String =
            arguments.map { arg ->
                val argValue = if (pyTest.variableHasAssignedValue(arg)) {
                    val assignedValue = pyTest.variableAssignedValue(arg)
                    logger.debug("Picked assigned value for $arg: $assignedValue")
                    assignedValue
                } else {
                    arg
                }
                argValue ?: "FAILED TO GET VALUE FOR $arg"
            }.mapIndexed { i, argValue ->
                if (argValue.contains("\n")) {
                    """
                        |input[${i}] = ${argValue.replace("\n", "\n    ")}
                    """.trimMargin()
                } else {
                    "input[${i}] = $argValue"
                }
            }.joinToString("\n")

        private val logger: Logger = LoggerFactory.getLogger(NFTest::class.java)
    }
}

