package com.skillbox.kotlin.oop

class Car constructor (
    val wheelCount: Int = 4,
    val doorCount: Int = 4,
    val bodyLength: Int,
    val bodyWidth: Int,
    val bodyHeight: Int
)   {
    var currentSpeed: Int = 0
        get() {
            println("Current speed get")
            return field
        }
        private set(value) {
            println("Current speed set $value")
            field = value
        }

    var fuelTank: Int = 0
        private set

    private fun useFuel (fuelCount: Int) {
        fuelTank -= fuelCount
    }

    fun accelerate (speed: Int) {
        val needFuel = speed/2

        if (fuelTank >= needFuel) {
            currentSpeed += speed
            useFuel(speed/2)
        } else {
            println("Car has no fuel. Please refuel the tank!")
        }
    }

    fun decelerate (speed: Int) {
        currentSpeed = maxOf(0, currentSpeed - speed)
    }

    fun refuel (fuelCount: Int) {
        if (currentSpeed == 0) {
            fuelTank += fuelCount
        } else {
            println("Stop the car!")
        }
    }
}