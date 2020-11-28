package com.skillbox.kotlin.oop

import com.skillbox.kotlin.PrintAreaOnChangeDelegate
import com.skillbox.kotlin.R

class Rectangle(
    x: Int,
    y: Int,
    width: Int,
    height: Int
): AbstractShape(x, y), Comparable<Rectangle> {

    var width: Int by PrintAreaOnChangeDelegate(width)
    var height: Int by PrintAreaOnChangeDelegate(height)


    override val name: String = "Rectangle"

    override fun calculateArea(): Double = width * height.toDouble()

    override fun compareTo(other: Rectangle): Int {
        return (width + height) - (other.width + other.height)
    }

    override fun toString(): String {
        return "Rectangle(width=$width, height=$height, name='$name')"
    }

    operator fun plus(other: Rectangle): Rectangle {
        return Rectangle(0, 0, width + other.width, height + other.height)
    }

    operator fun unaryMinus(): Rectangle {
        return Rectangle(0, 0, -width, -height)
    }
}