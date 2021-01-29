package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car
import com.skillbox.kotlin.oop.User
import javax.security.auth.callback.Callback

fun main() {
    val lambda = { println("Text") }
    lambda()

    val lambdaWithParams = { x: Int -> println("X from lambda is $x") }
    lambdaWithParams(8)

    val sumLambda = { x: Int, y: Int -> x + y }
    println("Sum x and y is ${sumLambda(43,78)}")

    val users = listOf(
        User ("Nick", "Smirnov", 31),
        User ("Nick", "Petrov", 32),
        User ("Nick", "Ivanov", 45),
        User ("Nick", "Sidorov", 53)
    )
    val user1 = users[0]
    val oldestUser = users.maxBy { user -> user.age }
    val maxNameUser = users.maxBy ( User::getFullNameLength )
    println("$maxNameUser")

    val car = Car.default
    car.openDoor()
    car.closeDoor { println("close door custom")}

    makeCalculations ({
        println("result = $it")
    }, { })
}

inline fun makeCalculations(callback: (Int) -> Unit, noinline callback2: (Int) -> Unit) {
    val value = 1 + 1
    callback(value)
}