package io.github.gallvp.converter

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import java.io.File

data class NFTest(
    val name: String,
    val whenBlock: String,
    val thenBlock: String,
    val setupBlock: String?,
    val shareSetup: Boolean,
    val addStubOption: Boolean
) {
    override fun toString(): String {

        val setupBlockComplete = if (shareSetup && addStubOption) "" else setupBlock?.let { setup ->
            """
                |setup {
                |${setup.split("\n").joinToString("\n") { "    $it" }}
                |}
            """.trimMargin()
        } ?: ""

        val stubOptionText = if (addStubOption) "options '-stub'" else ""
        val stubNamePostfix = if (addStubOption) " -- stub" else ""

        return if (shareSetup) """
                |${setupBlockComplete.split("\n").joinToString("\n")}
                |
                |test("$name$stubNamePostfix") {
                |    $stubOptionText
                |${whenBlock.split("\n").joinToString("\n") { "    $it" }}
                |${thenBlock.split("\n").joinToString("\n") { "    $it" }}
                |}
            """.trimMargin() else """
                |test("$name$stubNamePostfix") {
                |    $stubOptionText
                |${setupBlockComplete.split("\n").joinToString("\n") { "    $it" }}
                |${whenBlock.split("\n").joinToString("\n") { "    $it" }}
                |${thenBlock.split("\n").joinToString("\n") { "    $it" }}
                |}
            """.trimMargin()
    }

    companion object {
        fun from(
            pyTest: PyTest,
            includedComponents: List<IncludedComponent>,
            componentName: String,
            componentType: String,
            nfTestFile: File,
            configAssignments: List<ConfigAssignment>?,
            dataDictMap: Map<String, Any>,
            shareSetup: Boolean,
            addStubOption: Boolean
        ): NFTest {
            val targetComponentExpression = pyTest.expressions.last()
            val targetComponentName = includedComponents.getRealName(targetComponentExpression.component)

            require(targetComponentName.lowercase() == componentName) {
                "This pytest ${pyTest.name} can not be converted as the final component call $targetComponentName" +
                        " is not the target test component $componentName"
            }

            logger.debug(
                "Building inputs block for {} with arguments: {}",
                pyTest.name,
                targetComponentExpression.arguments
            )

            val inputs = pyTestArgumentsToNFTestInputs(pyTest, targetComponentExpression.arguments, dataDictMap)

            val inputsBlock = """
                |$componentType {
                |    ${"\"\"\""}
                |${inputs.split("\n").joinToString("\n") { "    $it" }}
                |    ${"\"\"\""}
                |}
            """.trimMargin()

            val testProcessConfigAssignments = configAssignments?.filter {
                it.targetName == targetComponentExpression.component
            }

            logger.debug("Picked target test process config assignments: {}", testProcessConfigAssignments)

            val testProcessConfigAssignmentsBlock = if (componentType != "process") {
                ""
            } else if (testProcessConfigAssignments.isNullOrEmpty()) {
                """
                    |params {
                    |    module_args = ''
                    |}
                """.trimMargin()
            } else {
                testProcessConfigAssignments.map {
                    it.isForTargetComponent = true
                }
                """
                    |params {
                    |    module_args = ${testProcessConfigAssignments.first().assignments.first().split("=").last()}
                    |}
                """.trimMargin()
            }

            val whenBlock = """
                |when {
                |${testProcessConfigAssignmentsBlock.split("\n").joinToString("\n") { "    $it" }}
                |${inputsBlock.split("\n").joinToString("\n") { "    $it" }}
                |}
            """.trimMargin()

            val setupComponents = pyTest.expressions.take(pyTest.expressions.size - 1)

            logger.debug("Setup components: {}", setupComponents.map { it.component })

            val setupBlock = if (setupComponents.isEmpty()) {
                null
            } else {
                setupComponents.joinToString("\n\n") { expression ->
                    val invokedComponentName = expression.component
                    val componentArguments = expression.arguments

                    logger.debug("Setup component: {} with arguments: {}", invokedComponentName, componentArguments)

                    val invokedComponentRealName = includedComponents.getRealName(invokedComponentName)
                    val invokedComponentAlias =
                        if (invokedComponentRealName != invokedComponentName) invokedComponentName else null
                    val aliasStatement = invokedComponentAlias?.let { ", alias: \"$invokedComponentAlias\"" } ?: ""

                    val invokedComponentPath =
                        includedComponents.find { it.name == invokedComponentRealName }?.absolutePath ?: ""

                    logger.debug(
                        "Making path: {} relative to nf-test file: {}",
                        invokedComponentPath,
                        nfTestFile.absolutePath
                    )

                    val invokedComponentRelativePath =
                        File(invokedComponentPath).relativeTo(nfTestFile.parentFile.absoluteFile).path

                    val formattedInputs = pyTestArgumentsToNFTestInputs(pyTest, componentArguments, dataDictMap).split("\n")
                        .joinToString("\n") { "        $it" }

                    val setupProcessConfigAssignment = configAssignments?.firstOrNull() {
                        it.targetName == invokedComponentName
                    }

                    logger.debug("Picked setup process config assignment: {}", setupProcessConfigAssignment)

                    val configArgsAssignment =
                        setupProcessConfigAssignment?.assignments?.firstOrNull { it.contains("ext.args") } ?: ""

                    logger.debug("Picked setup process config args assignment: {}", configArgsAssignment)

                    val setupProcessConfigAssignmentsBlock = if (configArgsAssignment == "") {
                        ""
                    } else {
                        val assignmentValue = configArgsAssignment.split("=").drop(1).joinToString("=")
                        val moduleArgsAssignment = "module_args = $assignmentValue"
                        """
                        |params {
                        |${moduleArgsAssignment.split("\n").joinToString("\n") { "    $it"}}
                        |}
                        |""".trimMargin()
                    }

                    """
                    |run("$invokedComponentRealName"$aliasStatement) {
                    |    script "$invokedComponentRelativePath"
                    |${setupProcessConfigAssignmentsBlock.split("\n").joinToString("\n") { "    $it" }}
                    |    process {
                    |        ${"\"\"\""}
                    |$formattedInputs
                    |        ${"\"\"\""}
                    |    }
                    |}
                """.trimMargin()
                }
            }


            val thenBlock = """
                |then {
                |    assertAll(
                |        { assert $componentType.success },
                |        { assert snapshot($componentType.out).match() }
                |    )
                |}
                """.trimMargin()

            return NFTest(pyTest.name, whenBlock, thenBlock, setupBlock, shareSetup, addStubOption)
        }

        private fun pyTestArgumentsToNFTestInputs(pyTest: PyTest, arguments: List<String>, dataDictMap: Map<String, Any>?): String {
            return arguments.map { arg ->
                val argValue = if (pyTest.variableHasAssignedValue(arg)) {
                    val assignedValue = pyTest.variableAssignedValue(arg)
                    logger.debug("Picked assigned value for $arg: $assignedValue")
                    assignedValue
                } else {
                    arg
                }

                if (argValue == null) return@map "FAILED TO GET VALUE FOR $arg"
                val resolvedValue = if (dataDictMap != null) {
                    resolveTestDataReferences(argValue, dataDictMap)
                } else {
                    argValue
                }

                logger.debug("Value resolved for $arg: $resolvedValue")

                resolvedValue
            }.mapIndexed { i, argValue ->
                if (argValue.contains("\n")) {
                    """
                        |input[${i}] = ${argValue.replace("\n", "\n    ")}
                    """.trimMargin()
                } else {
                    "input[${i}] = $argValue"
                }
            }.joinToString("\n")
        }
        
        private fun resolveTestDataReferences(argValue: String, dataDictMap: Map<String, Any>): String {
            // If dataDictMap is empty, return the original value
            if (dataDictMap.isEmpty()) return argValue
            val regex = Regex("""params\.test_data((\['[^']+'\]+)*)""")

            return regex.replace(argValue) { match ->

                val matchedValue = match.value
                // This is the matched part (e.g., "params.test_data['homo_sapiens']['illumina']['test_genome_vcf']")

                logger.debug("Found match in $argValue: $matchedValue")

                val keys = matchedValue
                    .removePrefix("params.test_data")
                    .trim('[', ']')
                    .split("']['")
                    .map { it.trim('\'') }

                logger.debug("Looking for keys in data map: {}", keys)

                var value: Any? = dataDictMap
                for (key in keys) {
                    value = (value as? Map<*, *>)?.get(key)
                }

                if (value == null) {
                    logger.warn("$matchedValue not found in data dictionary provided")
                }

                value?.toString() ?: matchedValue
            }
        }

        private val logger: Logger = LoggerFactory.getLogger(NFTest::class.java)
    }
}

