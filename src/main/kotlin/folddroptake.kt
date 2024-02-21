package com.dicoding.kotlin

fun main() {
    // Fold
    val numbers = listOf(1, 2, 3)
    val fold = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold result: $fold")

    /*
          output:
             current 10
             item 3

             current 13
             item 2

             current 15
             item 1

             Fold result: 16
    */

    /*-------------------------------------------------------------*/
//    Drop
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.dropLast(3)

    println(drop)

    /*
          output: [1, 2, 3]
    */

    /*-------------------------------------------------------------*/
//    Take
    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.takeLast(3)

    println(take)

    /*
          output: [4, 5, 6]
    */

}