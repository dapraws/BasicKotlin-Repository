package com.dicoding.kotlin

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}

fun main() {
    var number = sumNumbers(10, 20, 30, 40)
    print(number) // 100

    number = getNumberSize(10, 20, 30, 40, 50)
    println(number) // 5
}

/*
    Aturan vararg
    1. Tidak diizinkan untuk memiliki 2 (dua) parameter bertanda vararg.
    2. Pada parameter, vararg sebaiknya berada pada posisi terakhir.
*/