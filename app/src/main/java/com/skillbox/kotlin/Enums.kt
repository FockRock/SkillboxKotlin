package com.skillbox.kotlin

import com.skillbox.kotlin.oop.Color
import com.skillbox.kotlin.oop.SealedColor

fun main() {

    val color = Color.BLACK.hex

    Color.values().forEach {
        println(it.name)
        println(it.ordinal)
    }

    Color.values()[Color.RED.ordinal]

    SealedColor.Black
    SealedColor.CustomColor("#0f0")
}

fun invertColor(color: Color): Color {
    return when (color) {
        Color.WHITE -> Color.BLACK
        Color.BLACK -> Color.WHITE
        Color.RED -> Color.BLUE
        Color.BLUE -> Color.RED
    }
}

fun invertSealedColor(color: SealedColor): SealedColor {
    return when (color) {
        SealedColor.Black -> SealedColor.White
        SealedColor.White -> SealedColor.Black
        SealedColor.Blue -> SealedColor.Red
        SealedColor.Red -> SealedColor.Blue
        is SealedColor.CustomColor -> {
            SealedColor.White
        }
    }
}