package com.olascoaga.kotlinintroduction.classes

data class User (
    val id: Long,
    var name: String,
    var lastName: String,
    var group: Int
) {
}