package com.skillbox.kotlin.oop

class Car(
    val wheelCount: Int,
    val doorCount: Int,
    maxSpeed: Int
): Vehicle(maxSpeed) {

    var isDoorOpen: Boolean = false
        private set


    operator fun component1(): Int = wheelCount
    operator fun component2(): Int = doorCount

    private lateinit var driver: User

    private val engine by lazy {
        Engine()
    }

    fun setDriver(driver: User) {
        this.driver = driver
    }

    fun openDoor() {
        if (isDoorOpen) {
            println("Door already opened!")
        } else {
            isDoorOpen = true
            println("Door opened!")
        }
    }

    fun closeDoor() {
        if (isDoorOpen) {
            isDoorOpen = false
            println("Door closed!")
            if (::driver.isInitialized) {
                println("driver = $driver")
            }
        } else {
            println("Door already closed!")
        }
    }

    override fun accelerate(speed: Int) {
        engine.use()
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

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Car

        if (wheelCount != other.wheelCount) return false
        if (doorCount != other.doorCount) return false
        if (isDoorOpen != other.isDoorOpen) return false

        return true
    }

    override fun hashCode(): Int {
        var result = wheelCount
        result = 31 * result + doorCount
        result = 31 * result + isDoorOpen.hashCode()
        return result
    }
}