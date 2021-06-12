package com.lizdepskyi.yura_kotlin

import java.util.*

fun main() {

    var myArray = arrayOf(1, 2, 7)
    var myList = listOf(1, 2, 7)

    var mutableList = mutableListOf(1, 5, 3.5, "hey there")
    var mutableList1 = mutableListOf<Double>(1.0, 5.0, 3.5)

    mutableList.add("hello")
    println(mutableList)

    var rainbowColors: Array<String> =
        arrayOf("red", "orange", "yellow", "green", "blue", "indigo", "violet")

    var colors = mutableListOf("Deep purple", "light orange", "dark blue")

    colors.add("red")
    colors.addAll(arrayOf("blue", "green"))

    println()

    println(rainbowColors.contentToString())
    println(colors)

}