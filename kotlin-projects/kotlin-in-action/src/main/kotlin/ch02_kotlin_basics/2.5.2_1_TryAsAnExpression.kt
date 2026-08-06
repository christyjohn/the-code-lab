package org.example.ch02_kotlin_basics

import java.io.BufferedReader
import java.io.StringReader

fun readNumber2(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        return
    }

    println(number)
}

fun main() {
    val reader = BufferedReader(StringReader("239 is not a number"))
    readNumber2(reader)
}