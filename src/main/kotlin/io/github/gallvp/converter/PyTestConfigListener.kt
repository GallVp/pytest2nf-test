package io.github.gallvp.converter

import nextflow.script.parser.ConfigParser.ConfigSelectorContext
import nextflow.script.parser.ConfigParserBaseListener
import org.slf4j.LoggerFactory

class PyTestConfigListener internal constructor() : ConfigParserBaseListener() {

    val configAssignments: MutableList<ConfigAssignment> = ArrayList()

    override fun enterConfigSelector(ctx: ConfigSelectorContext?) {

        val configSelectorTarget = ctx?.target

        if (configSelectorTarget == null) {
            logger.debug("Config selector has missing target, skipping!")
            return
        }

        val configAssignments = ctx.configAssignment()

        if (configAssignments == null) {
            logger.debug("Config selector for ${configSelectorTarget.text} has no assignments, skipping!")
        }

        logger.debug("Picked config selector for: {}", configSelectorTarget.text)

        val cAClass = ConfigAssignment(configSelectorTarget.text, configAssignments.map { it.text })

        logger.debug("Picked config assignment: {}", cAClass)

        this.configAssignments.add(cAClass)
    }

    companion object {
        private val logger = LoggerFactory.getLogger(PyTestConfigListener::class.java)
    }
}