package org.example.ch02_kotlin_basics

fun eval3(e: Expr): Int =
    when (e) {
        is Num  -> e.value
        is Sum -> eval(e.right) + eval(e.left)
        else -> throw IllegalArgumentException("Unknown expression")
    }

fun main() {
    println(eval3(Sum(Num(1), Num(2))))
}