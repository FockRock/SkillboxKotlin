package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car

fun main() {
    val tesla = Car(
        wheelCount = 4, doorCount = 2, bodyLength = 500, bodyWidth = 200, bodyHeight = 150
    )

    tesla.refuel(400)
    tesla.accelerate(34)
    tesla.decelerate(2)
}