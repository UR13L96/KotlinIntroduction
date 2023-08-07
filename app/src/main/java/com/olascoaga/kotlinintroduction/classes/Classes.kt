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

    createNewTopic("Data Classes")
    val user = User(0, "Drake", "Parker", Group.FAMILY.ordinal)
    println(user.component3())
    println(user)

    val brother = user.copy(1, "Josh", "Nichols")
    println(brother)

    val friend = brother.copy(id = 2, group = Group.FRIENDS.ordinal)
    println(friend)
}