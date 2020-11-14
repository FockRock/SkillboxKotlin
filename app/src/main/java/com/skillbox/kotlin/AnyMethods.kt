package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car

fun main() {

    val car1 = Car(4,2,200)
    val car2 = Car(4,2,150)
    val car3 = car1

    println("car1 equals to car2 by reference = ${car1 === car2}")
    println("car1 equals to car3 by reference = ${car1 === car3}")
    println("car1 equals to car2 by value = ${car1 == car2}")
    println("car1 equals to car3 by value = ${car1 == car3}")

    var cars = listOf<Car>(
        car1,
        Car(4,4, 150),
        Car(4,3,200)
    )

    println(cars.contains(Car(4,4, 150)))

    val map = hashMapOf(
        car1 to "1",
        car2 to "2",
        Car(4,4, 150) to "3"
    )

    println(map[Car(4,2,200)])
}