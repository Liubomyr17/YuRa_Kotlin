package com.lizdepskyi.yura_kotlin

fun main() {

    /*val set = mutableSetOf("a", "b", "c")
    set.add("d")
    for (item in set) println(item) */

    val text = "Class Java"
    val letterSet = mutableSetOf<Char>()
    var letterCount = 0
    for (letter in text) {
        letterSet.add(letter)
}
    for (letter in letterSet) {
        letterCount++
        println(letter)
    }

    println(letterCount)
    println(letterSet.size)
}