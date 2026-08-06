package org.example.ch02_kotlin_basics

import java.util.TreeMap

fun main() {
    //var binaryReps = TreeMap<Char, String>()
    var binaryReps = mutableMapOf<Char, String>()
    for (c in 'A'..'F') {
        val binary = c.code.toString(radix = 2)
        binaryReps[c] = binary
    }

    for ((letter, binary) in binaryReps) {
        println("$letter = $binary")
    }
}