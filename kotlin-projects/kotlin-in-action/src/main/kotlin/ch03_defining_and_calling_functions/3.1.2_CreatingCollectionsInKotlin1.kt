package org.example.ch03_defining_and_calling_functions

fun main() {
    val strings = listOf("first", "second", "fourteenth")
    println(strings) // [first, second, fourteenth]
    println(strings.last()) // fourteenth
    println(strings.shuffled()) // [second, first, fourteenth]

    val numbers = setOf(1, 14, 2, 14)
    println(numbers.max()) // 14
    println(numbers.min()) // 1
    println(numbers.count()) // 3
    println(numbers.sum()) // 17
}