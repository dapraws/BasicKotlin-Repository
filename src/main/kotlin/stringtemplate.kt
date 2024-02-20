package com.dicoding.kotlin

fun main() {
    val name = "Kotlin"
    val old = 3
    print("My name is $name, im $old years old")

//    Menyisipkan expression
    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
}

/*
    output : My name is Kotlin, im 3 years old
    output : Office is open
*/