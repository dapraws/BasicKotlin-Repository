package com.dicoding.kotlin

class LongList : List<Long>{
    override fun get(index: Int): Long {
        return this[index]
    }
}
class ArrayList<T> : List<T>{
    override fun get(index: Int): T {
        return this[index]
    }
}
interface List<P> {
    operator fun get(index: Int): P
}
fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}