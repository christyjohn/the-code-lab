package org.example.ch02_kotlin_basics

fun eval2(e: Expr): Int =
    if (e is Num)  e.value
    else if (e is Sum) eval(e.right) + eval(e.left)
    else throw IllegalArgumentException("Unknown expression")

fun main() {
    println(eval2(Sum(Num(1), Num(2))))
}