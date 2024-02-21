package com.dicoding.kotlin


// Hanya dengan satu baris kode di atas, kompiler akan secara otomatis menghasilkan constructor, toString(), equals(), hashCode(), copy() dan juga fungsi componentN().

class User(val name : String, val age : Int){
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }
}

data class DataUser(val name : String, val age : Int){
    fun intro(){
        println("My name is $name, I am $age years old")
    }
}
fun main(){
    val dataUser = DataUser("nrohmen", 17)
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)
    val dataUser4 = dataUser.copy() // Menyalin data class
    val dataUser5 = dataUser.copy(age = 18) // Menyalin dan memodifikasi data class

    // Destructuring Declaration
//    val name = dataUser.component1()
//    val age = dataUser.component2()
    val (name, age) = dataUser // atau bisa juga seperti ini

    println(dataUser.equals(dataUser2)) // true
    println(dataUser.equals(dataUser3)) // false

    println(dataUser4) // DataUser(name=nrohmen, age=17)

    println("My name is $name, I am $age years old") // My name is nrohmen, I am 17 years old

    dataUser.intro() // My name is nrohmen, I am 17 years old

}