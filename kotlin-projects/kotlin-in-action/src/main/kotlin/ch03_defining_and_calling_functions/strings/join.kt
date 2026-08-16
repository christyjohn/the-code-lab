@file:JvmName("StringFunctions")

package org.example.ch03_defining_and_calling_functions.strings

fun <T> joinToString (
    collection: Collection<T>,
    separator: String = ", ",
    prefix: String = "",
    postfix: String = ""
) {

    val result = StringBuilder(prefix)

    for ((index, element) in collection.withIndex()) {
        // don't append a separator before the first element
        if (index > 0) result.append(separator)
        result.append(element)
    }

    result.append(postfix)
    println(result.toString())
}