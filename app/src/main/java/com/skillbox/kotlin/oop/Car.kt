package com.skillbox.kotlin.oop

class Car constructor(
    val wheelsCount: Int = 4,
    val doorsCount: Int = 4,
    val bodyLength: Int,
    val bodyWidth: Int,
    val bodyHeight: Int
){
    var currentSpeed: Int = 0
        get() {
            println("Current speed get")
            return field
        }
        private set(value) {
            println("Current speed set")
            field = value
        }
    var fuelCount: Int = 0
        private set

    fun accelerate (speed: Int) {
        val needFuel = speed/10

        if (fuelCount >= needFuel) {
            currentSpeed += speed
            useFuel(needFuel)
        } else {
            println("Car has no fuel!")
        }
    }

    fun decelerate (speed: Int) {
        currentSpeed = maxOf(0, currentSpeed - speed)
    }

    private fun useFuel (fuelCount: Int) {
        this.fuelCount -= fuelCount
    }

    fun refuel (fuelCount: Int) {
        if (currentSpeed == 0) {
            this.fuelCount += fuelCount
        } else {
            println("Stop!")
        }
    }
}