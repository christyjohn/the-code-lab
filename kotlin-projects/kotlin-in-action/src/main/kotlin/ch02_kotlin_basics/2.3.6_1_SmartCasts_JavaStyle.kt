package ch02_kotlin_basics

import org.example.ch02_kotlin_basics.Expr
import org.example.ch02_kotlin_basics.Num
import org.example.ch02_kotlin_basics.Sum

fun eval(e: Expr): Int {
    if (e is Num) {
        val n = e as Num
        return n.value
    }
    if (e is Sum) {
        return eval(e.right) + eval(e.left)
    }
    throw IllegalArgumentException("Unknown expression")
}

fun main() {
    println(eval(Sum(Sum(Num(1), Num(2)), Num(4))))
}