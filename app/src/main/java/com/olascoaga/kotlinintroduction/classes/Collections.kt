package com.olascoaga.kotlinintroduction.classes

import com.olascoaga.kotlinintroduction.createNewTopic

fun main() {
    createNewTopic("Collections (Read only)")
    val fruits = listOf("Apple", "Banana", "Grape", "Lima")
    println(fruits[(fruits.indices).random()])
    println("Grape index is: ${fruits.indexOf("Grape")}")
}