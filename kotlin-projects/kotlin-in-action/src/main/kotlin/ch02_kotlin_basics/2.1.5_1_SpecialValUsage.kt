package org.example.ch02_kotlin_basics

fun canPerformOperation(): Boolean {
    return true
}

// since compiler is smart enough to understand only one of the
// assignments will be executed, we can specify result as
// read-only reference using val keyword.
fun main() {
    val result: String = if (canPerformOperation()) {
        "Success!"
    } else {
        "Can't perform operation"
    }
    println(result)
}