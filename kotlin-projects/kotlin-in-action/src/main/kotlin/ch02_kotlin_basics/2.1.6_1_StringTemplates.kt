package org.example.ch02_kotlin_basics

fun main() {
    val input = readln()
    val name = if (input.isNotBlank()) input else "Kotlin"
    println("Hello $name!")
}