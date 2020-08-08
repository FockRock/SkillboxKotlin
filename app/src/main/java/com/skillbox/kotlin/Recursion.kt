package com.skillbox.kotlin

fun main() {
    print("Введите число: ")
    val n: Int = readLine()?.toIntOrNull() ?: return

    println("Вы ввели число: $n")

    println(calculateSumRecursive(n))
}

tailrec fun calculateSumRecursive(n: Int, accum: Int = 0): Int {
    return if (n == 0) {
        accum
    } else {
        calculateSumRecursive(n - 1, accum + n)
    }
}