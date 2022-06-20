package com.example.menu

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}