package com.lizdepskyi.yura_kotlin

import java.util.*

fun main() {

    /*val names = arrayOf("Anne", "Peter", "Jeff")
    for (name in names)
        println(name)

    for (x in 0..10) println(x)

    for (x in 0 until 10) println(x)

    for (x in 0 until 10 step 2) println(x)

    for (x in 0 downTo 10) println(x)

    for (x in 0 downTo 10 step 2) println(x)

    val numbers = 10 downTo 0 step 2

    val numberList = numbers.toList()
    println(numberList)
    println(numbers)

    for (x in numbers step 2) println(x)*/

    var x = 0
    while (x < 10) {
        if (x % 2 == 0) {
            println(x)
        }
        x++
    }
}