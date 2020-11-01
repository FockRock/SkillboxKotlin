package com.skillbox.kotlin.oop

open class Vehicle (
    val maxSpeed: Int
){
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
        protected set

    open fun getTitle(): String = "Vehicle"

    private fun useFuel (fuelCount: Int) {
        fuelTank -= fuelCount
    }

    open fun accelerate(speed: Int) {
        val needFuel = speed/2

        if (fuelTank >= needFuel) {
            currentSpeed += speed
            useFuel(speed/2)
        } else {
            println("Car has no fuel. Please refuel the tank!")
        }
    }

    fun decelerate(speed: Int) {
        currentSpeed = maxOf(0, currentSpeed - speed)
    }

    fun refuel(fuelCount: Int) {
        if (currentSpeed == 0) {
            fuelTank += fuelCount
        } else {
            println("Stop the car!")
        }
    }
}