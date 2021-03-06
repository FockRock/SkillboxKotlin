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

    fun openDoor(openCallback: () -> Unit = { println("Cpen door")}) {
        if (isDoorOpen) {
            println("Door already opened!")
        } else {
            openCallback()
            isDoorOpen = true
        }
    }

    fun closeDoor(closeCallback: () -> Unit = { println("Close door") }) {
        if (isDoorOpen) {
            isDoorOpen = false
            closeCallback()
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

    companion object {
        val default = Car(4,4,200)

        fun createWithDefaultWheelCount(doorCount: Int, maxSpeed: Int) : Car {
            return Car (4,doorCount,maxSpeed)
        }
    }
}