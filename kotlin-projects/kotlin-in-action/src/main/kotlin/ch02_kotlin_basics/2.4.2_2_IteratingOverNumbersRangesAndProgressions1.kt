package org.example.ch02_kotlin_basics

fun fizzbuzz2(i : Int) = when {
    i % 15 == 0 -> "FizzBuzz "
    i % 3 == 0 -> "Fizz "
    i % 5 == 0 -> "Buzz "
    else -> "$i "
}

fun main() {
    for (i in 100 downTo 1 step 2) {
        print(fizzbuzz2(i))
    }
}