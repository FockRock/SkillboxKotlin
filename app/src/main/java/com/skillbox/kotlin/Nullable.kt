package com.skillbox.kotlin

fun main() {

    readLine()?.toIntOrNull()
        ?.let { number ->
            println("Вы ввели число $number")
        }
        ?: println("Вы ввели не число")

    printLength("fuck you")
}

fun nullable() {
    val string: String = "string"
    val nullableString: String? = null

    val length: Int = string.length
    val nullableLength: Int? = nullableString?.length

    nullableString?.reversed()
        ?.find { it == '4'}
        ?.isDigit()

    if(nullableString != null) {
        println("String length is ${nullableString.length}")
    } else {
        println("String is null")
    }

    //Тоже самое
    println("String length is ${nullableString?.length ?: "String is null"}")
}

fun printLength(string: String?) {
    string ?: return
    print("Длина строки = ${string.length}")
}