package com.dicoding.kotlin

abstract class Vehicle(wheel: Int)
class Car(speed: Int) : Vehicle(4)
class MotorCycle(speed: Int) : Vehicle(2)

fun main() {
    val carList = listOf(Car(100) , Car(120))
    val vehicleList = carList
}

// Covariant
//interface List<out E> : Collection<E> {
//    operator fun get(index: Int): E
//}

// Contravariant
//interface Comparable<in T> {
//    operator fun compareTo(other: T): Int
//}

