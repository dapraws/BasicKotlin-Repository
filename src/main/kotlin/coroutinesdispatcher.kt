package com.dicoding.kotlin

import kotlinx.coroutines.*

// Dispatchers
//fun main() = runBlocking<Unit> {
//    launch(Dispatchers.Default){
//        // TODO: Implement suspending lambda here
//    }
//    launch(Dispatchers.IO){
//        // TODO: Implement algorithm here
//    }
//    launch(Dispatchers.Unconfined) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}

// Single Thread Context
//fun main() = runBlocking<Unit> {
//    val dispatcher = newSingleThreadContext("myThread")
//    launch(dispatcher) {
//        println("Starting in ${Thread.currentThread().name}")
//        delay(1000)
//        println("Resuming in ${Thread.currentThread().name}")
//    }.start()
//}

// Thread Pool
fun main() = runBlocking<Unit> {
    val dispatcher = newFixedThreadPoolContext(3, "myPool")

    launch(dispatcher) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}