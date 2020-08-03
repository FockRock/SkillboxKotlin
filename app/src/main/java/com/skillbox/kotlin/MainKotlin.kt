package com.skillbox.kotlin

fun main() {
    val helloWorldString = "Hello World!"
    println(helloWorldString)

    val array = arrayListOf(1)
    array.add(2)
    array.add(3)
    println(array)

    val name = "Nick"
    val lastName = "Smirnov"
    val isMale = true

    val human = "${if(isMale) "His" else "Her"} name is $name and lastname is $lastName."
    println(human)
}
