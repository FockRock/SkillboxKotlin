package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Rectangle
import com.skillbox.kotlin.oop.Shape

fun main() {
    val shape = Rectangle (3,5, 3,3)
    shape.printPosition()

    println("shape area = ${shape.calculateArea()}")
    println("shape name = ${shape.name}")

    val largeRectangle = Rectangle(1,2,30, 20)

    println("shape <= Large Rectangle (${shape <= largeRectangle})")

    val set: MutableSet<Rectangle> = sortedSetOf(
        largeRectangle,
        shape
    )

    println(set)

    val shape1 = object : Shape {

        val additionalField = 123

        fun additionalFunction() = 234

        override val name: String = "anonymous shape"

        override fun calculateArea(): Double = 0.0
    }

    shape1.additionalField
    shape1.additionalFunction()
}