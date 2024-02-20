package com.dicoding.kotlin

fun main() {
    val openOffice = 7
    val now = 20
    val office: String

//    Statement
    // kode di bawah ini adalah statement karena ia tidak mengembalikan nilai apapun
    if (now > openOffice) {
        print("Office already open")
    } else {
        print("Office close")
    }

//    Expression
    //  expression adalah statement yang dapat mengembalikan nilai dan bisa kita simpan ke dalam sebuah variabel
    office = if (now > openOffice) "Office already open" else "Office close"
    print(office)

//    Statement
    //
}