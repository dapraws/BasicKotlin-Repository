package com.dicoding.kotlin

fun main() {
    val array = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

    val intArray = intArrayOf(1, 3, 5, 7)
    /*
        intArrayOf() : IntArray
        booleanArrayOf() : BooleanArray
        charArrayOf() : CharArray
        longArrayOf() : LongArray
        shortArrayOf() : ShortArray
        byteArrayOf() : ByteArray
    */

//    Indexing
    print(intArray[2]) // 5

    intArray[2] = 11
    print(intArray[2]) // 11
}