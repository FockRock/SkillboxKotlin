package com.skillbox.kotlin.oop

class Car(
    val wheelCount: Int,
    val doorCount: Int,
    maxSpeed: Int
): Vehicle(maxSpeed) {

    var isDoorOpen: Boolean = false
        private set

    fun openDoor() {
        if (isDoorOpen) {
            println("Door already opened!")
        } else {
            isDoorOpen = true
        }
    }

    fun closeDoor() {
        if (isDoorOpen) {
            isDoorOpen = false
        } else {
            println("Door already closed!")
        }
    }

    override fun accelerate(speed: Int) {
        if (isDoorOpen) {
            println("You can't accelerate with opened door.")
        } else {
            super.accelerate(speed)
        }
    }

    fun accelerate(speed: Int, force: Boolean) {
        if(force) {
            if (isDoorOpen) println("Warning: You accelerate, while door is opened!")
            super.accelerate(speed)
        } else {
            accelerate(speed)
        }
    }

    override fun getTitle(): String = "Car"
}