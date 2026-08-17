package org.example

class Rectangle(val height: Double, val width: Double) : Shape("Rectangle") {
    
    override fun calculateArea(): Double {
        return height * width
    }

    override fun calculatePerimeter() = 2 * (height + width)
    
}