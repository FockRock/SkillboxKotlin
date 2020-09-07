package com.skillbox.kotlin

fun main() {
    val mutableList = mutableListOf("1", "2", "3")
    println(mutableList)

    mutableList.forEach { println(it)}

    val emptyList = emptyList<String>()

    mutableList[0] = "1.5"
    println(mutableList)

    mutableList.removeAt(0)
    mutableList.add("4")
    mutableList.add(1, "new 1")
    println(mutableList)

    mutableList.addAll(listOf("10", "20"))
    println(mutableList)
}