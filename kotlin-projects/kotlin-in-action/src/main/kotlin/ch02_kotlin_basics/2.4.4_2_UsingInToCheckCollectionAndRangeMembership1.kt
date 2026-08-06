package org.example.ch02_kotlin_basics

fun recognize(c: Char) = when(c) {
    in '0' .. '9' -> "It's a digit!"
    in 'a' .. 'z', in 'A' .. 'Z' -> "It's a letter!"
    else -> "I don't know..."
}

fun main() {
    print(recognize('8'))
}