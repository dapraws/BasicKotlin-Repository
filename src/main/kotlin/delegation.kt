package com.dicoding.kotlin

import kotlin.reflect.KProperty

class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}
fun main(){
    val animal = Animal()
    animal.name = "Dicoding cat"
    animal.weight = 6.2
    animal.age = 1

    println("Nama: ${animal.name}")
    println("Berat: ${animal.weight}")
    println("Umur: ${animal.age} Tahun")
}

/*
output:
    Nilai name dari: Default akan berubah menjadi Dicoding cat
    Nilai weight dari: Default akan berubah menjadi 6.2
    Nilai age dari: Default akan berubah menjadi 1
    Fungsi ini sama seperti getter untuk properti name pada class Animal@17f052a3
    Nama: Dicoding cat
    Fungsi ini sama seperti getter untuk properti weight pada class Animal@17f052a3
    Berat: 6.2
    Fungsi ini sama seperti getter untuk properti age pada class Animal@17f052a3
    Umur: 1 Tahun
*/