package com.lizdepskyi.yura_kotlin

fun main() {

    /*fun happyBirthday(name: String, age: Int): String {
        return "Happy ${age}th birthday, $name!"
    }*/

    fun happyBirthday(name: String, age: Int): String =
        "Happy ${age}th birthday, $name!"

        println(happyBirthday("Bob", 23))

    fun happyBirthdayWithoutParams() {
        println("Happy birthday!")
    }

    happyBirthdayWithoutParams()
}