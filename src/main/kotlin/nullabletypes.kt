package com.dicoding.kotlin

fun main() {
    val text: String? = null

//    Safe calls
    text?.length

//    Elvis Operator (condition ? then : else)
    val textLength = text?.length ?: 7 // sama seperti val textLength = if (text != null) text.length else 7

}