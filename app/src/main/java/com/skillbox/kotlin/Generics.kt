package com.skillbox.kotlin

fun main() {
    val genericObject = GenericClass<Double>(0.05)
    val genericObject2 = GenericClass<Double>(0.089)
    val genericObject3 = GenericClass<Float>(0f)
    val genericObject4 = GenericClass<Float>(0f)

    println(sumGeneric(genericObject, genericObject2))
    println(sumGeneric(genericObject3, genericObject4))

    updateContraVariant(ContravariantClass<Any>("ddd"))
}

class GenericClass<out T: Number> (defaultValue: T) {
    private var item: T = defaultValue

    fun getItem(): T {
        return item
    }
}

fun sumGeneric(a: GenericClass<Number>, b: GenericClass<Number>): Int {
    return a.getItem().toInt() + b.getItem().toInt()
}


class ContravariantClass<in T>(defaultValue: T) {
    private var item: T = defaultValue

    fun setItem(newItem: T) {
        item = newItem
    }
}

fun updateContraVariant(input: ContravariantClass<Number>) {
    input.setItem(2.2)
}

fun <T> printGenericObject(item: T) {
    println(item.toString())
}
