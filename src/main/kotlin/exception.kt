package com.dicoding.kotlin


// Exception
//fun main() {
//    val someNullValue: String? = null
//    val someMustNotNullValue: String = someNullValue!!
//    println(someMustNotNullValue)
//}
//
///*
//output:
//    Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:3)
//*/

// Exception Handling
import kotlin.NumberFormatException

fun main() {
    val someStringValue: String? = null
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}

/*
	output:
    Catch block NullPointerException terpanggil!
*/