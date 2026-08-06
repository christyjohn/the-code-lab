package ch02_kotlin_basics

import ch02_kotlin_basics.colors.Color
import ch02_kotlin_basics.colors.Color.*

fun mixOptimized(c1: Color, c2: Color) =
    when {
        (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
        (c1 == BLUE && c2 == YELLOW) || (c1 == YELLOW && c2 == BLUE) -> GREEN
        (c1 == BLUE && c2 == VIOLET) || (c1 == VIOLET && c2 == BLUE) -> INDIGO
        else -> "Dirty color"
    }

fun main() {
    println(mixOptimized(BLUE, YELLOW))
}