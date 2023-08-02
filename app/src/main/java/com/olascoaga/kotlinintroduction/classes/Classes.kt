package com.olascoaga.kotlinintroduction.classes

import com.olascoaga.kotlinintroduction.createNewTopic

fun main() {
    createNewTopic("Classes")
    val phone = Phone("1234567890")
    phone.call()
    phone.showNumber()

    createNewTopic("Inheritance")
    val smartphone = Smartphone("9876543210", true)
    smartphone.call()
    smartphone.showNumber()
}