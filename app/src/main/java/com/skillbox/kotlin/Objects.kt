package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car
import com.skillbox.kotlin.oop.Vehicle

fun main() {

    Cars.nissan
    Cars.someMethod()
    Cars.accelerate(50)

    Car.default
    Car.createWithDefaultWheelCount(4,200)

    val a = Car
    val b = Cars
}

object Cars: Vehicle(200) {
    val toyota = Car(4, 4, 200)
    val nissan = Car(4, 4, 200)

    fun someMethod() {

    }
}