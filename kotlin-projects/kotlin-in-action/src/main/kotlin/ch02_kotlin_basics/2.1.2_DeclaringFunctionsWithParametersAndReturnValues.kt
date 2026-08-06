package org.example.ch02_kotlin_basics

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun max2(a: Int, b:Int): Int = if (a > b) a else b

fun max3(a: Int, b: Int) = if (a > b) a else b

fun main() {
    println(max(1, 2))
    println(max2(13, 6))
    println(max3(23, 11))
}