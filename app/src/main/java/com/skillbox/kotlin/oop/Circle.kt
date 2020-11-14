package com.skillbox.kotlin.oop

import com.skillbox.kotlin.PrintAreaOnChangeDelegate

class Circle(
    radius: Int
): Shape {

    override val name: String = "Circle"
    override fun calculateArea(): Double {
        return Math.PI * radius * radius
    }

    var radius: Int by PrintAreaOnChangeDelegate(radius)
}