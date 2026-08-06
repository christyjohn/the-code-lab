package ch02_kotlin_basics.geometry.example

import ch02_kotlin_basics.geometry.shape.Rectangle
import ch02_kotlin_basics.geometry.shape.createUnitSQuare

fun main() {
    println(Rectangle(3, 4).isSquare)
    println(createUnitSQuare().isSquare)
}