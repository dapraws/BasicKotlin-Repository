package com.dicoding.kotlin

typealias Arithmetic = ((Int, Int) -> Int)?

fun main() {
    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    val sumResult = sum?.invoke(10, 10)

    println(sumResult)
}