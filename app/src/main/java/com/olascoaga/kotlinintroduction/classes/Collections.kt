package com.olascoaga.kotlinintroduction.classes

import com.olascoaga.kotlinintroduction.createNewTopic

fun main() {
    createNewTopic("Collections (Read only)")
    val fruits = listOf("Apple", "Banana", "Grape", "Lima")
    println(fruits[(fruits.indices).random()])
    println("Grape index is: ${fruits.indexOf("Grape")}")

    createNewTopic("Collections (Mutable)")

    val user = User(0, "Drake", "Parker", Group.FAMILY.ordinal)
    val brother = user.copy(1, "Josh", "Nichols")
    val friend = brother.copy(id = 2, group = Group.FRIENDS.ordinal)
    val users = mutableListOf<User>(user, brother)
    println(users)

    users.add(friend)
    println(users)

    users.removeAt(1)
    println(users)

    users.remove(user)
    println(users)

    val usersSelectedList = mutableListOf<User>()
    println(usersSelectedList)

    usersSelectedList.add(user)
    println(usersSelectedList)

    usersSelectedList[0] = brother
    println(usersSelectedList)

    usersSelectedList.add(user)
    usersSelectedList.add(user)
    println(usersSelectedList)
}