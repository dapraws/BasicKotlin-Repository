package com.dicoding.kotlin

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

fun printUser(name: String) {
    print("Your name is $name")
}

fun main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")
}

/*
    output :
    Your name is Alfian, and you 19 years old
    Your name is Alfian
*/

