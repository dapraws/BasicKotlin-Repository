package com.dicoding.kotlin

fun main() {
    val rangeInt = 1..10 step 2
    rangeInt.forEach {
        print("$it ")
    }
    println(rangeInt.step)
    /*
        output: 1 3 5 7 9 2 karena step 2
    */

    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
    /*
       output: Value 7 available
    */

    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }
    /*
       output: No value 11 in Range
    */

    val rangeChar = 'A'.rangeTo('F') // A, B, C, D, E, F

}