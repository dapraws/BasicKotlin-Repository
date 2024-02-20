package com.dicoding.kotlin

fun main() {
//    Karena pada dasarnya setiap Characters merupakan representasi dari Unicode.
//    Contoh Unicode A adalah 0041.
//    Ketika kita melakukan increment maka hasilnya adalah 0042 yang mana merupakan Unicode dari B.
    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
}

/*
   output:
       Vocal A
       Vocal B
       Vocal C
       Vocal D
       Vocal C
       Vocal B
       Vocal A
*/