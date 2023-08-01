package com.olascoaga.kotlinintroduction

const val separator = "============="

fun main() {
    createNewTopic("Hello Kotlin!")

    createNewTopic("Variables and constants")
    val a = true
    println("a: $a")

    var b = 2
    b = 13
    println("b: $b")

    var objNull: Any?
    objNull = null
    objNull = "Hi"

    println(objNull)
}

fun createNewTopic(topic: String) {
    println("\n$separator $topic $separator\n")
}