package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Car
import com.skillbox.kotlin.oop.Circle
import com.skillbox.kotlin.oop.Rectangle
import com.skillbox.kotlin.oop.Shape
import kotlin.properties.ReadWriteProperty
import kotlin.reflect.KProperty

fun main() {

    val rectangle = Rectangle(0,0, 10,20)
    rectangle.width = 15
    rectangle.height = 50

    val circle = Circle(10)
    circle.radius = 20

    val car = Car(4,4,300)
    car.openDoor()
    car.closeDoor()
    car.accelerate(100)

}

class PrintAreaOnChangeDelegate <T> (
    private var value: T
): ReadWriteProperty<Shape, T> {
    override fun getValue(thisRef: Shape, property: KProperty<*>): T = value

    override fun setValue(thisRef: Shape, property: KProperty<*>, value: T) {
        println("before change property ${property.name} = ${thisRef.calculateArea()}")
        this.value = value
        println("after change property ${property.name} = ${thisRef.calculateArea()}")
    }

}