package org.example.ch02_kotlin_basics

fun qtn() {
    val question: String =
        "The Ultimate Question of Life. the Universe, and Everything"
    val answer: Int = 42

    println("$question : $answer")
}

fun qtn2() {
    val question = "The Ultimate Question of Life, the Universe, and Everything."
    val answer = 42
    val yearsToCompute = 7.5e6
    println("$question : $answer, year to compute: $yearsToCompute")
}

fun main() {
    qtn()
    qtn2()
}