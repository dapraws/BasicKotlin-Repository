package com.dicoding.kotlin

fun setUser(name: String, age: Int): String {
    return "Your name is $name, and you $age years old"
}

fun printUser(name: String) {
    print("Your name is $name")
}

fun getFullName1(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

fun getFullName2(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}

fun main() {
    val user = setUser("Alfian", 19)
    println(user)

    printUser("Alfian")

//    Named Argument
    val fullName1 = getFullName1(first = "Kotlin" , middle = " is ", last = "Fantastic")
    print(fullName1) // // Kotlin is Fantastic

//    Default Argument
    val fullName2 = getFullName2()
    print(fullName2) // Kotlin is Awesome

}

/*
    output :
    Your name is Alfian, and you 19 years old
    Your name is Alfian
*/

