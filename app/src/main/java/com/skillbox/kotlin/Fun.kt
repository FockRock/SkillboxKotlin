package com.skillbox.kotlin

import kotlin.random.Random

fun main() {
    println(multiply(38))
    println(hasChildAccessToRollerCoaster(181, 94, 31))
    println(functionReturnAny())
}

fun multiply(a: Int, b: Int = 10) = a * b

fun hasChildAccessToRollerCoaster(height: Int, weight: Int, age: Int): Boolean {
    return height > 150 && weight > 30 && age > 10
}

fun functionReturnAny(): Any {
    return if(Random.nextBoolean()) {
        666
    } else {
        "Fuck"
    }
}