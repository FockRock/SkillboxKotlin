package com.skillbox.kotlin

fun main() {
    println(getDeveloperPosition(-1))
    println(getDeveloperPosition(0))
    println(getDeveloperPosition(1))
    println(getDeveloperPosition(3))
    println(getDeveloperPosition(7))
}

fun maxInt(a: Int, b: Int): Int = if (a < b) b else a

fun calculatePrice(booleanParam: Boolean): Int {
    return if (booleanParam) {
        val intermediateResult = 678 + 432
        intermediateResult + 3
    } else {
        val intermediateResult = 88 + 82
        intermediateResult + 9
    }
}

fun getCarType(maxSpeed: Int, hasSportMode: Boolean): String {
    return when {
        maxSpeed < 20 -> "Трактор"
        maxSpeed < 60 -> "Медленная машина"
        hasSportMode && maxSpeed < 200 -> "Обычная машина"
        else -> "Быстрая машина"
    }
}

fun getDeveloperPosition(experience: Int): String {
    return if (experience < 0) {
        "Не может быть отрицательным"
    } else {
        when (experience) {
            0 -> "Стажер"
            in 1..2 -> "Junior"
            in 3..4 -> "Middle"
            else -> "Senior"
        }
    }
}