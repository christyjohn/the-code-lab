package org.example.ch02_kotlin_basics

fun main() {
    val name = readln()
    if (name.isNotBlank()) {
        println("Hello, ${name.length}-letter person!")
    }
}