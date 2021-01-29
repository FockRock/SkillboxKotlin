package com.skillbox.kotlin.oop

data class User (
    val name: String,
    val lastName: String,
    val age: Int = 0
) {
    var innerState: String = ""

    fun getFullNameLength() = "$name$lastName".length
}