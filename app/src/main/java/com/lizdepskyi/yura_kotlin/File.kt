package com.lizdepskyi.yura_kotlin

fun main() {
    var greeting = "Hello"

    greeting = "Hi!"
    var number: Int = 1

    println("$greeting My favorite number is $number")

    val name = "Liubomyr"
    var age = 30

    age += 4
    age -= 4
    age /= 4
    age *= 4
    age++

    var radius = 7
    val pi = 3.14
    var circleArea = pi * radius * radius
    println(circleArea)

    println("My name is $name and I'm $age years old")
}