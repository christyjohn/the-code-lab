package ch02_kotlin_basics.geometry.shape

class Rectangle(val height: Int, val width: Int) {
    val isSquare: Boolean
        get() = height == width
}

fun createUnitSQuare(): Rectangle {
    return Rectangle(1, 1)
}
