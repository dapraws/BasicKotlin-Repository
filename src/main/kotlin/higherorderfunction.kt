package com.dicoding.kotlin

// Sebelum
//fun main(){
//    printMessage("Dicoding", message1)
//}
//val message1 = { name: String ->
//    "Hello $name"
//}
//fun printMessage(name: String, message: (String) -> String) {
//    print(message(name))
//}

// Sesudah
fun main(){
    printMessage("Dicoding", message1)
}
val message1 = { name: String ->
    "Hello $name"
}
fun printMessage(name: String, message: (String) -> String) {
    print(message(name))
}
