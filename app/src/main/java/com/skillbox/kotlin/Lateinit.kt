package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car
import com.skillbox.kotlin.oop.User

fun main() {
    var car = Car(4,4,200)
    car.openDoor()
    car.setDriver(User("driver", "lastName"))
    car.closeDoor()
}