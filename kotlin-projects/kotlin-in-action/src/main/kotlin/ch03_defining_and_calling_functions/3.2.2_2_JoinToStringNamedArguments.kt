package org.example.ch03_defining_and_calling_functions

fun <T> joinToStringNamedParameters(
    collection: Collection<T>,
    separator: String,
    prefix: String,
    postfix: String
): String {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        // don't append a separator before the first element
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    return result.toString()
}

fun main() {
    val list = listOf(1, 2, 3)
    println(joinToStringNamedParameters(postfix = ".",
                         separator = " ",
                         collection = list,
                         prefix = " ")) //  1 2 3.
}