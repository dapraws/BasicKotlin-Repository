package com.dicoding.kotlin

enum class Color(val value: Int) {
    RED(0xFF0000){
        override fun printValue() {
            println("value of RED is $value")
        }
    },
    GREEN(0x00FF00){
        override fun printValue() {
            println("value of GREEN is $value")
        }
    },
    BLUE(0x0000FF){
        override fun printValue() {
            println("value of BLUE is $value")
        }
    };

    abstract fun printValue()
}

fun main() {
    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color ")
    }

    /*
        output : RED GREEN BLUE
    */
}