package com.olascoaga.kotlinintroduction.classes

class Smartphone(number: String, val isPrivate: Boolean): Phone(number) {
    override fun showNumber() {
        if (isPrivate) {
            println("Unknown")
        } else {
            super.showNumber()
        }
    }
}