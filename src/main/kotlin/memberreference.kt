package com.dicoding.kotlin

// Function References
//fun main() {
//    val numbers = 1.rangeTo(10)
//    val evenNumbers = numbers.filter(Int::isEvenNumber)
//
//    println(evenNumbers)
//}
//fun Int.isEvenNumber() = this % 2 == 0
///*
//   output = [2, 4, 6, 8, 10]
//*/

// Property References
val message2 = "Kotlin"

fun main() {
    println(::message2.name)
    println(::message2.get())

    // ::message.set("Kotlin Academy") <- Error : Unresolved reference.

    println(::message2.get())
}