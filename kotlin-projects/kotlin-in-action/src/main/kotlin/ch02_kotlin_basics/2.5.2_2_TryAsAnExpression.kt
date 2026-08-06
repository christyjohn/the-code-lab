package org.example.ch02_kotlin_basics

import java.io.BufferedReader
import java.io.StringReader

fun readNumber3(reader: BufferedReader) {
    val number = try {
        Integer.parseInt(reader.readLine())
    } catch (e: NumberFormatException) {
        null
    }

    println(number)
}

fun main(args: Array<String>) {
    val reader = BufferedReader(StringReader("239 is not a number"))
    readNumber3(reader)
}