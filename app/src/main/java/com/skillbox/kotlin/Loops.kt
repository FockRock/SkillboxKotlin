package com.skillbox.kotlin

fun main() {

    print("Введите число: ")
    val n: Int = readLine()?.toIntOrNull() ?: return

    println("Вы ввели число: $n")

    println("Сумма с помощью while = ${calculateSumByWhile(n)}")
    println("Сумма с помощью while и return = ${calculateSumByWhileInfinityReturn(n)}")
    println("Сумма с помощью while и break = ${calculateSumByWhileInfinityBreak(n)}")

    printEvenNumbers(n)

    println("Сумма с помощью do while = ${calclulateSumDoWhile(n)}")
    println("Сумма с помощью for = ${calculateSumFor(n)}")

    printChars()
    printEvenNumberFor(n)
}

fun calculateSumByWhile(n: Int): Long {
    var sum: Long = 0
    var currentNumber: Int = 0
    while (currentNumber <= n) {
        println("Iteration $currentNumber")
        sum += currentNumber
        currentNumber++
    }
    return sum
}

fun calculateSumByWhileInfinityReturn(n: Int): Long {
    var sum: Long = 0
    var currentNumber: Int = 0
    while (true) {
        if(currentNumber > n) return sum
        sum += currentNumber
        currentNumber++
    }
}

fun calculateSumByWhileInfinityBreak(n: Int): Long {
    var sum: Long = 0
    var currentNumber: Int = 0
    while (true) {
        if(currentNumber > n) break
        sum += currentNumber
        currentNumber++
    }
    return sum
}

fun printEvenNumbers(n: Int) {
    var currentNumber = 0
    while (currentNumber <= n) {
        val numberBefore: Int = currentNumber
        currentNumber++
        if(numberBefore % 2 == 1) continue
        println(numberBefore)
    }
}

fun calclulateSumDoWhile(n: Int): Long {
    var sum: Long = 0
    var currentNumber: Int = 0

    do {
        println("Iteration $currentNumber")
        sum += currentNumber
        currentNumber++
    } while (currentNumber <= n)
    return sum
}

fun calculateSumFor(n: Int): Long {
    var sum: Long = 0
    val range: IntRange = 0..n

    for (currentNumer: Int in range) {
        sum += currentNumer
    }

    return sum
}

fun printChars() {
    for (currentCh: Char in "fuck") {
        println(currentCh)
    }
}

fun printEvenNumberFor(n: Int) {
    val range: IntProgression = 0..n step 2
    for (currentNumber in range) {
        println(currentNumber)
    }
}