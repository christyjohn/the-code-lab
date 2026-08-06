package ch02_kotlin_basics

import ch02_kotlin_basics.colors.Color.*

fun measureColor2() = BLUE

fun getWarmthFromSensor2(): String {
    val color = measureColor2()
    return when (color) {
        RED, ORANGE, YELLOW -> "warm (red = ${color.r})"
        GREEN -> "neutral (green = ${color.g})"
        BLUE, INDIGO, VIOLET -> "cold (blue = ${color.b})"
    }
}

fun main() {
    println(getWarmthFromSensor2())
}