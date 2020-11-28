package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Rectangle

fun main() {

    listOf(1, 2, 3) + listOf(4, 5, 6)

    val rectangleSum = Rectangle(0, 0, 10, 20) +
            Rectangle(0, 0, 30, 20)

    val rectangleMin = -Rectangle(0,0,50, 30)
    println(rectangleSum)
}