package com.skillbox.kotlin
import com.skillbox.kotlin.oop.Car

fun main() {
    val tesla = Car (
        4, 2, 500, 200, 150
    )
    println("Car speed = ${tesla.currentSpeed}")
    tesla.accelerate(100)
    println("Car speed = ${tesla.currentSpeed}")
}