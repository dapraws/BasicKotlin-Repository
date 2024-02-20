package com.dicoding.kotlin

fun main() {
    val value = 7
    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }
    /*
        output: value is 7
    */

    /*-----------------------------------------------------------------------*/
//    When expression
    val stringOfValue = when (value) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }
    println(stringOfValue)
    /*
        output : value is 7
    */

    /*-----------------------------------------------------------------------*/
    val stringOfValue1 = when (value) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }
    println(stringOfValue1)
    /*
        output :
            Seven
            value is 7
    */

    /*-----------------------------------------------------------------------*/
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }
    /*
        output : the value has a Long type
    */

    /*-----------------------------------------------------------------------*/
    val nilai =  27
    val ranges = 10..50
    when(nilai){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
    }
    /*
        output : value is in the range
    */


}
