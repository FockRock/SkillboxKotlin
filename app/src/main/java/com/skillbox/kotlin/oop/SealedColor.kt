package com.skillbox.kotlin.oop

sealed class SealedColor (
    val hex: String
    ): Drawable {

    object White: SealedColor("#fff")
    object Black: SealedColor("#000") {
        override fun draw() {
            println("draw black")
        }
    }
    object Red: SealedColor("#f00")
    object Blue: SealedColor("#00f")

    class CustomColor(hex: String) : SealedColor(hex)

    override fun draw() {
        println("draw sealed")
    }
}
