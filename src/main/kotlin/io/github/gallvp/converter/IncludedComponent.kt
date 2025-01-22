package io.github.gallvp.converter

data class IncludedComponent(val name: String, val alias: String?, val absolutePath: String)

fun List<IncludedComponent>.getRealName(fromAlias: String): String =
    this.firstOrNull { it.alias == fromAlias }?.name ?: fromAlias