package com.dicoding.kotlin

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

//    Conjunction atau AND (&&)
    val isOpen = now >= officeOpen && now <= officeClosed
    print("Office is open : $isOpen")

//    Disjunction atau OR (||)
    val isClose = now < officeOpen || now > officeClosed
    print("Office is closed : $isClose")

//    Negation atau NOT (!)
    if (!isOpen) {
        print("Office is closed")
    } else {
        print("Office is open")
    }
}

/*
    Output : Office is open : false
    Output : Office is closed : true
    Output : Office is open
*/