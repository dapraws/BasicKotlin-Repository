package com.dicoding.kotlin

val message = { println("Hello From Lambda") }
val printMessage = { message: String -> println(message) }
val messageLength = { message: String -> message.length }

public inline fun IntArray.forEach(action: (Int) -> Unit): Unit {
    for (element in this) action(element)
}
fun main () {
//    Regular Function
//    fun getMessage(name: String): String {
//        return "Hello $name"
//    }

//    Function dengan Lambda
    val message :(String) -> String = { name: String ->
        "Hello $name"
    }

//    Lambda Expression
    message()
    /*
       output : Hello From Lambda
    */

    printMessage("Hello From Lambda")
    /*
       output : Hello From Lambda
    */

    val length = messageLength("Hello From lambda")
    println("Message length $length")
    /*
       output : Message length 17
    */

//    Lambda Loop
    val ranges = 1.rangeTo(10) step 3
    ranges.forEachIndexed { index, _ ->
        println("index $index")
    }
    /*
       output :
           index 0
           index 1
           index 2
           index 3
    */
}