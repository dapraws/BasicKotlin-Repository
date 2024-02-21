package com.dicoding.kotlin

lateinit var name: String
fun main() {
    name = "Dicoding Miaw"
    if (::name.isInitialized)
        print(name.length)
    else
        print("Not Initialized")
}