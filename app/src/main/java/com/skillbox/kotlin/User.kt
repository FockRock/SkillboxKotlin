package com.skillbox.kotlin

data class User (
    val name: String,
    val lastName: String
) {
    var innerState: String = ""
}