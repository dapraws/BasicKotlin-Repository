package com.dicoding.kotlin

fun main() {
//    Int (32 bit)
    val intNumber = 100

//    Long (64 bit)
    val longNumber: Long = 100  // atau val longNumber = 100L

//    Short (16 Bit)
    val shortNumber: Short = 10

//    Byte (8 bit)
    val byteNumber = 0b11010010

//    Double (64 bit)
    val doubleNumber: Double = 1.3

//    Float (32 bit)
    val floatNumber: Float = 0.123456789f    // yang terbaca hanya 0.1234567

//    Operator
    val numberOne = 1
    val numberTwo = 2
    print(numberOne + numberTwo) // 3
    print(numberOne - numberTwo) // -1
    print(numberOne / numberTwo) // 0
    print(numberOne * numberTwo) // 2

//    Konversi
    val byteNum: Byte = 10
    val intNum: Int = byteNumber.toInt()
    /*
        toByte(): Byte
        toShort(): Short
        toInt(): Int
        toLong(): Long
        toFloat(): Float
        toDouble(): Double
        toChar(): Char
    */

//    Readable Number
    val readableNumber = 1_000_000
    print(readableNumber) // 1000000
}