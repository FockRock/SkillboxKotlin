package com.skillbox.kotlin.oop

enum class Color (
    val hex: String
    ): Drawable {
    WHITE("#fff"),
    BLACK("#000"),
    RED("#f00") {
        override fun draw() {
            println("draw red")
        }
                },
    BLUE("#00f");

    fun someMethod() {

    }

    override fun draw() {
        println("Draw color")
    }

    companion object {
        fun fromName(name: String): Color? {
            return values().find { it.name == name.toUpperCase() }
        }
    }
}