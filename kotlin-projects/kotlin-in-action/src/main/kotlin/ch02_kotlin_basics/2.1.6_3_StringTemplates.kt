package org.example.ch02_kotlin_basics

fun main() {
    val name = readln()
    println("Hello ${if (name.isBlank()) "someone" else name}")
}