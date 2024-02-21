package com.dicoding.kotlin

fun main(args: Array<String>) {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )

    val mutableCapital = capital.toMutableMap()

    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")

    println(mutableCapital)
}