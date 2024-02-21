package com.dicoding.kotlin

// With
//fun main() {
//    val message = "Hello Kotlin!"
//    val result = with(message) {
//        "First character is ${this[0]}" +
//                " and last character is ${this[this.length - 1]}"
//    }
//
//    println(result)
//}
//
///*
//   output : First character is H and last character is !
//*/


// Apply
fun main() {
    val message = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message.toString())
}

/*
   output : Hello Kotlin
*/