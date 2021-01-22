package com.skillbox.kotlin

fun main() {
    val genericObject = GenericClass<Double>(1.2)

    val genericObject2 = GenericClass<Float>(1.2f)

    println(sumGeneric(genericObject, genericObject2))

    updateContrVariant(ContrvariantClass<Any>(2))
}

class GenericClass<out T: Number>(defaultValue: T) {
    private var item: T = defaultValue

    fun getItem(): T {
        return item
    }
}

class ContrvariantClass<in T>(defaultValue: T) {
    private var item: T = defaultValue

    fun setItem(newItem: T) {
        item = newItem
    }
}

fun updateContrVariant(input: ContrvariantClass<Number>) {
    input.setItem(2.2)
}

fun sumGeneric(a: GenericClass<Number>, b: GenericClass<Number>): Double {
    return a.getItem().toDouble() + b.getItem().toDouble()
}

fun <T> printGenericObject(item: T) {
    println(item.toString())
}