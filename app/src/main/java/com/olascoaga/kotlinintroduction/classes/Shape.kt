package com.olascoaga.kotlinintroduction.classes

// There's not a best practice to add inheritance to Data Class
open class Shape (
    val name: String,
    var backgroundColor: String,
    var borderColor: String
) {
}