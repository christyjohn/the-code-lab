package org.example.ch03_defining_and_calling_functions

val set = setOf(1, 7, 53)
val list = listOf(1, 7, 53)
val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

fun main() {
    println(set.javaClass) // class java.util.LinkedHashSet
    println(list.javaClass) // class java.util.Arrays$ArrayList
    println(map.javaClass) // class java.util.LinkedHashMap
}