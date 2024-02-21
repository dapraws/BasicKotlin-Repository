package com.dicoding.kotlin

/*
Public: Hak akses yang cakupannya paling luas. Anggota yang diberi modifier ini dapat diakses dari manapun.

Private: Hak akses yang cakupannya paling terbatas. Anggota yang menerapkannya hanya dapat diakses pada scope yang sama.

Protected: Hak akses yang cakupannya terbatas pada hirarki kelas. Anggota hanya dapat diakses pada kelas turunannya atau kelas itu sendiri.

Internal: Hak akses yang cakupannya terbatas pada satu modul. Anggota yang menggunakannya tidak dapat diakses diluar dari modulnya tersebut.
*/


// Private
class Animal6(
    private val name: String,
    private val weight: Double,
    private val age: Int,
    private val isMammal: Boolean
)

// Protected
open class Animal7(val name: String, protected val weight: Double)
class Cat(pName: String, pWeight: Double) : Animal7(pName, pWeight)

// Internal
internal class Animal8(val name: String)