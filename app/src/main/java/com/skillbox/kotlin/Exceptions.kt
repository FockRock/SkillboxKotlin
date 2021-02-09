package com.skillbox.kotlin

import java.lang.Exception
import java.lang.NullPointerException

fun main() {
    functionOuter()
}

fun functionOuter() {
    println("functionOuter before")
    functionWithExceptionHandling()
    println("functionOuter after")
}

fun functionWithExceptionHandling() {
    println("functionWithException before")
    try {
        functionInner()
    } catch (t: Throwable) {
        println("catch throwable with info: ${t.message}")
    }
    println("functionWithException after")
}

fun functionInner() {
    println("functionInner before")
    functionWithException()
    println("functionInner after")
}

fun functionWithException() {
    println("function with exception before")
    throw Exception("exception with additional info")
    println("function with exception after")
}