package com.skillbox.kotlin

import com.skillbox.kotlin.oop.*

fun main() {
    val tesla = Car(wheelCount = 4, doorCount = 2, maxSpeed = 120)

    with(tesla) {
        refuel(100)
        openDoor()
        accelerate(100)
        accelerate(100,true)
    }

    val vehicle: Vehicle = tesla

    println("vehicle is car = ${vehicle is Car}")
    println("tesla is vehicle = ${tesla is Vehicle}")
    println("vehicle is car = ${Vehicle(23) is Car}")

    val newCar: Car = vehicle as Car
    newCar.closeDoor()

    listOf<Vehicle>(
        Vehicle(200),
        Car(wheelCount = 4, doorCount = 2, maxSpeed = 120),
        Airplane(300)
    ).forEach {
        println(it.getTitle())
    }
}