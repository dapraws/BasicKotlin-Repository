package com.dicoding.kotlin

fun main() {
    val ranges1 = 1.rangeTo(10) step 3
    for ((index, value) in ranges1.withIndex()) {
        println("value $value with index $index")
    }
    /*
       output :
           value 1 with index 0
           value 4 with index 1
           value 7 with index 2
           value 10 with index 3
    */



    val ranges2 = 1.rangeTo(10) step 3
    ranges2.forEach { value ->
        println("value is $value!")
    }
    /*
       output :
           value is 1!
           value is 4!
           value is 7!
           value is 10!
    */
}
