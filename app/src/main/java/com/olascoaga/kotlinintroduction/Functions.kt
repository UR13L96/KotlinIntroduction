package com.olascoaga.kotlinintroduction

import kotlin.math.abs

fun main() {
    sayHello()

    createNewTopic("Arguments")
    val a = 13
    val b = 2
    println("$a + $b = ${ add(a, b) }")
    println("$a - $b = ${ sub(a, b) }")

    createNewTopic("Class extensions")
    val c = -3
    println(c.enableAbs(false))
    println("$b + $c = ${add(b, c)}")
    println("$b + $c = ${add(b, c.enableAbs(true))}")

    createNewTopic("Parameter overloading")
    showProduct("Soda", "13%")
    showProduct(name = "Bread")
    showProduct("Candy", "15%", "March 15")
}

private fun sayHello() {
    println("Hello Kotlin!")
}

private fun add(a: Int, b: Int): Int {
    return a + b
}

private fun sub(a: Int, b: Int) = a - b

fun Int.enableAbs(enable: Boolean) = if (enable) abs(this) else this

fun showProduct(name: String, promo: String, validity: String = "while supplies last") {
    println("$name = $promo $validity")
}

fun showProduct(name: String) {
    println("$name = There's no promotion")
}