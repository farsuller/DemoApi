package com.example.demoapi.models

import kotlinx.serialization.Serializable

@Serializable
data class Person(
    val name: String,
    val age: Int
)

val people = listOf(
    Person(name = "Florence", age = 31),
    Person(name = "Ellen", age = 25),
    Person(name = "Renz", age = 30),
    Person(name = "Goldy", age = 23),
    Person(name = "Grace", age = 24)
)