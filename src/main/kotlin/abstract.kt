package com.dicoding.kotlin

abstract class Animal10(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){
    fun eat(){
        println("$name sedang makan !")
    }
    fun sleep(){
        println("$name sedang tidur !")
    }
}

fun main(){
    val animal = Animal10("dicoding animal", 2.6, 1, true)
}

// Output: cannot create an instance of an abstract class