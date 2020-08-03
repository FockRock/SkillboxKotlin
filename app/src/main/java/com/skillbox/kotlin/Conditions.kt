package com.skillbox.kotlin

fun main() {
    println(maxInt(7, 9))
    println(calculatePrice(true))
    println(getCarType(100))
    println(getDevdloperPosition(0))
}

fun maxInt(a: Int, b: Int): Int = if (a > b) a else b

fun calculatePrice(booleanParam: Boolean): Int {
    return if(booleanParam) {
        val intResult = 663
        intResult + 3
    } else {
        val intResult = 663
        intResult + 2
    }
}

fun getCarType(maxSpeed: Int): String {
    return when {
        maxSpeed < 20 -> "Трактор"
        maxSpeed < 60 -> "Медленная машина"
        maxSpeed < 150 -> "Обычная машина"
        else -> "Быстрая машина"
    }
}

fun getDevdloperPosition(experience: Int): String {
    return if(experience < 0) {
        "Неверный опыт"
    } else {
        when(experience) {
            0 -> "Intern"
            in 1..2 -> "Junior"
            in 3..4 -> "Middle"
            else -> "Senior"
        }
    }
}