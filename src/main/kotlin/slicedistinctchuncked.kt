package com.dicoding.kotlin

fun main() {
//    Slice
    val index = listOf(2, 3, 5, 8)
    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(index)
    println(slice)
    /*
        output: [3, 4, 6, 9]
    */

    /*-------------------------------------------------------------*/
//    Distinct
    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct = text.distinctBy {
        it.length
    }

    println(distinct)

    /*
        output: [A, CC, EEE, GGGG]
    */

    /*-------------------------------------------------------------*/
//    Chuncked
    val word = "QWERTY"
    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)

    /*
        output: [qwe, rty]
    */
}