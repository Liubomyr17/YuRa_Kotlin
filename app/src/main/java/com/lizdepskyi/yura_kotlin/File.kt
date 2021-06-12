package com.lizdepskyi.yura_kotlin

fun main() {

    class Person() {
        var firstName: String = "John"
        var lastName: String = "Doe"

        var age: Int = 1
        var isMarried: Boolean = false

    }
    val jack = Person()
    jack.age = 0
    println(jack.age)
    println(jack.firstName)
    println(jack.lastName)

}