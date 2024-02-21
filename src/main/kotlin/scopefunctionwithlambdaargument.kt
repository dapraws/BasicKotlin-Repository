package com.dicoding.kotlin

// Let
//fun main() {
//    val message: String? = null
//    message?.let {
//        val length = it.length * 2
//        val text = "text length $length"
//        println(text)
//    } ?: run {
//        val text = "message is null"
//        println(text)
//    }
//}

// Also
fun main() {
    val text = "Hello Kotlin"
    val result = text.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
}

/*
   output :
           value length -> 12
           text -> Hello Kotlin
*/