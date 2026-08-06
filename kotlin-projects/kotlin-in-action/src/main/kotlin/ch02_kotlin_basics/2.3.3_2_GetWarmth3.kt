package ch02_kotlin_basics

import ch02_kotlin_basics.colors.Color.*

fun measureColor3() = ORANGE

fun getWarmthFromSensor3(): String =
    when (val color = measureColor3()) {
        RED, ORANGE, YELLOW -> "warm (red = ${color.r})"
        GREEN -> "neutral (green = ${color.g})"
        BLUE, INDIGO, VIOLET -> "cold (blue = ${color.b})"
    }

fun main() {
    println(getWarmthFromSensor3())
}