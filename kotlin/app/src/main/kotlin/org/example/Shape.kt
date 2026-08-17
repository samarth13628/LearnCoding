package org.example

open class Shape(val name: String) {
    // Open methods that derived classes can override
     open fun calculateArea(): Double {
        return 0.0
    }
    
    open fun calculatePerimeter(): Double {
        return 0.0
    }

    fun displayInfo() {
        println("Shape: $name")
        println("Area: ${calculateArea()}")
        println("Perimeter: ${calculatePerimeter()}")
        println("-------------------")
    }
}

