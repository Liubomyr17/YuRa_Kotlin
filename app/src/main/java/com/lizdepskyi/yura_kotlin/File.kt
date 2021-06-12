package com.lizdepskyi.yura_kotlin

fun main() {

    val isAdult: Boolean
    val age = 19
    val isMan = true

    isAdult = if (age > 18) {
        println("You're adult, man")
        true
    } else {
        println("You are not adult")
        false
    }

    if (isAdult && isMan) {
        println("You can go to the party")
    } else if (isAdult && !isMan) {
        println("You can go to the party")
    } else {
        println("You cannot go to the party")
    }

    var isStudent = true
    var hasTicket = false

    if (!isStudent || hasTicket) {
        println("You can go to the party")
    } else {
        println("You can't go to the party")
    }
}