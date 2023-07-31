package com.olascoaga.kotlinintroduction

fun main() {
    createNewTopic("Bucles")
    showUsers("Uriel", "Nadia", "Josue")
    showUsers("Uriel", "Nadia", "Sergio", "Alex")
}

fun showUsers(user1: String, user2: String, user3: String) {
    println(user1)
    println(user2)
    println(user3)
}

fun showUsers(vararg users: String) {
    createNewTopic("For")
    for (user in users) {
        println(user)
    }

    createNewTopic("While")
    var i = 0
    while (i < users.size) {
        println(users[i])
        i++
    }
}