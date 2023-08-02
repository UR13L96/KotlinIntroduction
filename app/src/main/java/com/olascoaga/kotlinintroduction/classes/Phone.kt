package com.olascoaga.kotlinintroduction.classes

open class Phone (protected val number: String) {

    fun call() {
        println("Calling...")
    }

    open fun showNumber() {
        println("My number is: $number")
    }
}