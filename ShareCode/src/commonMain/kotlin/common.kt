package com.example.boothkotlinsample

expect fun platformName(): String

fun createApplicationScreenMessage(): String{
    return "Hello Kotlin on ${platformName()}"
}