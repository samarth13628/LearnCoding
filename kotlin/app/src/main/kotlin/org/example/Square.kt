package org.example

class Square(val side: Double) : Shape("Square") {
    override fun calculateArea() = side * side

    override fun calculatePerimeter(): Double {
        return 4 * side
    }
}