package com.skillbox.kotlin

fun main() {
    val immutableSet = setOf(1, 2, 2, 3, 4, 2, 5, 5, 5, 6, 7)
    println(immutableSet)

    val unionSet = setOf(1, 2, 3).union(setOf(1, 4, 5))             //Сложить
    println(unionSet)

    val substractSet = setOf(1, 2, 3).subtract(setOf(1, 2, 4))      //Отнять
    println(substractSet)

    val intersectSet = setOf(1, 2, 4).intersect(setOf(4, 5, 5))     //Пересечение
    println(intersectSet)

    val naturalOrderSet = sortedSetOf(1, 4, 9, 2, -3)               //Сортировка по порядку
    println(naturalOrderSet)
    println(naturalOrderSet.descendingSet())                        //Сортировка в обратном порядке

    mutableSetOf(1, 2, 3).add(4)

    val hashSet = hashSetOf(1, 2, 3)
    hashSet.add(1)
    hashSet.remove(1)

    hashSet.contains(1)
    println(1 in hashSet)
}