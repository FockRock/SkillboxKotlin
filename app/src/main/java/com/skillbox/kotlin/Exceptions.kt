package com.skillbox.kotlin

import java.lang.Exception
import java.lang.NullPointerException

fun main() {
//    try {
//        println("before")
//        functionWithException()
//        println("after")
//    } catch (t: NullPointerException) {
//        println("catch null exception with info: ${t.message}")
//    } catch (t: Exception) {
//        println("catch exception with info: ${t.message}")
//    } catch (t: Throwable) {
//        println("catch throwable with info: ${t.message}")
//    } finally {
//        println("finally")                                                                          //Выполняется в любом случае
//    }
    functionOuter()
}

fun functionOuter() {
    println("functionOuter before")
    functionWithExceptionHandling()
    println("functionOuter after")
}

fun functionWithExceptionHandling() {
    println("functionWithExceptionHandling before")
    try {
        functionInner()
    } catch (t: Throwable) {
        println("catch throwable with info: ${t.message}")
    }
    println("functionWithExceptionHandling after")
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