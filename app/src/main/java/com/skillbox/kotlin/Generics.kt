package com.skillbox.kotlin

fun main() {
    val genericObject = GenericClass<Double>(1.2)
    genericObject.updateItem(2.2)

    val genericObject2 = GenericClass<Double>(1.2)
    genericObject.updateItem(2.2)

    sumGeneric(genericObject, genericObject2)

    printGenericObject(33)
}

class GenericClass<T: Number>(defaultValue: T) {
    var item: T = defaultValue
        private set

    fun updateItem(newItem: T) {
        item = newItem
        item?.toFloat()
        item?.toInt()
    }
}

fun sumGeneric(a: GenericClass<Number>, b: GenericClass<Number>): Int {
    return a.item.toInt() + b.item.toInt()
}

fun <T> printGenericObject(item: T) {
    println(item.toString())
}