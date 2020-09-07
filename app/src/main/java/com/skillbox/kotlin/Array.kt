package com.skillbox.kotlin

fun main() {
    val array = arrayOf("Ник", "Григор", "Диман") + arrayOf("Стас")

    for (user in array) {
        println(user)
    }

    array.forEach { println(it) }
    array.forEachIndexed{ index, user -> println("Index = $index, element = $user") }

    val firstElement = array[0]
    var lastElement = array[array.lastIndex]

    array[0] = "Новый Ник"
    array.forEach { println(it) }

    val emptyArray = emptyArray<String>()

    val largeArray = Array(100) { index -> "User #$index"}
    largeArray.forEach { println(it) }
}