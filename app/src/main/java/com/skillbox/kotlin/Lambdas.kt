package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car
import com.skillbox.kotlin.oop.User
import javax.security.auth.callback.Callback

fun main() {
    val lambda = { println("Text from lambda") }
    lambda()

    val lambdaWithParam = { x: Int -> println("X from lambda is $x") }
    lambdaWithParam(34)

    val sumLambda = { x: Int, y: Int -> x + y }
    println("Sum x and y = ${sumLambda(4, 24)}")

    val users = listOf(
        User("Nick", "Smirnov", 31),
        User("Nick", "Petrov", 34),
        User("Nick", "Ivanov", 40),
        User("Nick", "Sidorov", 50)
    )

    var oldestUser: User? = null

    for (user in users) {
        val currentAge = user.age
        val maxAge = oldestUser?.age ?: Int.MIN_VALUE
        if (currentAge > maxAge) {
            oldestUser = user
        }
    }

    val oldestUsers = users.maxBy { user -> user.age }
    val maxNameUser = users.maxBy { it.getFullNameLength() }                                        //Можно заменить User::getFullNameLength
    println(maxNameUser)

    val car = Car.default
    car.openDoor()
    car.closeDoor { println("Close door custom") }

    makeCalculations ({
        println("Result: $it")
    }, {  })
}

inline fun makeCalculations(callback: (Int) -> Unit, noinline callback2: (Int) -> Unit) {
    val value = 1 + 1
    callback(value)
}