package com.dicoding.kotlin


//class Animal3(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true)
//fun main(){
//    val dicodingCat = Animal3("Dicoding Miaw", 4.2)
//    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )
//}
///*
//output:
//    Nama: Dicoding Miaw, Berat: 4.2, Umur: 2, mamalia: true
//*/



// Init block
class Animal3(name: String, weight: Double, age: Int, isMammal: Boolean) {
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        this.weight = if(weight < 0) 0.1 else weight
        this.age = if(age < 0) 0  else age
        this.name = name
        this.isMammal = isMammal
    }
}

fun main() {
    val dicodingCat = Animal3("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}

/*
 output:
    Nama: Dicoding Miaw, Berat: 4.2, Umur: 0, mamalia: true
*/