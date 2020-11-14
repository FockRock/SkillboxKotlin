package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car
import com.skillbox.kotlin.oop.User

fun main() {
    val user1 = User("name1", "lastName1")
    user1.innerState = "state1"
    val user2 = User("name2", "lastName2")
    user2.innerState = "state2"

    println(user1 == user2)

    val user3 = user1.copy(lastName = "lastName3")

    println(user1)

    val user4 = User("name4", "lastName4")
    val name = user4.component1()
    val lastName = user4.component2()
    println("name = ${name}")
    println("Last Name = ${lastName}")

    val users = listOf(
        user1,
        user2,
        user3
    )

    users.forEach { (name, lastName) -> println("$name $lastName")}

    val (wheelCount, doorCount) = Car (4, 4,200)

    val map = mapOf(
        1 to "1",
        2 to "2"
    )

    for ((key, value) in map) {
        key
        value
    }
}