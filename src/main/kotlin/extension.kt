package com.dicoding.kotlin
fun main() {
    println(10.plusThree()) // 13
    println(10.slice) // 5
    val result = 5 sum 3 // Menggunakan Infix Function
}

// Extension Functions
fun Int.plusThree(): Int {
    return this + 3
}

// Extension Properties
val Int.slice: Int
    get() = this / 2

// Infix Function
infix fun Int.sum(value: Int): Int {
    return this + value
}

class MyHero {
    infix fun addHero(s: String) { /*...*/ }
    fun build() {
        this addHero "Superman"   // Correct
        addHero("Spidermen")       // Correct
        //  addHero "Ironman"        // Incorrect: the receiver must be specified
    }
}