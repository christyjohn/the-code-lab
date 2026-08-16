package org.example.ch03_defining_and_calling_functions

fun <T> joinToStringDefaultParameters(
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

fun main() {
    joinToStringDefaultParameters(list, ", ", "", "") // 1, 7, 53
    joinToStringDefaultParameters(list) // 1, 7, 5
    joinToStringDefaultParameters(list, "; ") // 1; 7; 53
    joinToStringDefaultParameters(list, postfix = ";", prefix = "#") // #1, 7, 53;
}