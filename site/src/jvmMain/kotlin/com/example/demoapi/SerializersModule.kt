package com.example.demoapi

import com.example.demoapi.models.Food
import com.example.demoapi.models.Menus
import com.example.demoapi.models.Person
import com.example.demoapi.models.Reviews
import com.example.demoapi.models.School
import kotlinx.serialization.json.Json
import kotlinx.serialization.modules.SerializersModule
import kotlinx.serialization.modules.contextual


val mySerializersModule = SerializersModule {
    contextual(Menus.serializer())
    contextual(Reviews.serializer())
    contextual(Person.serializer())
    contextual(School.serializer())
    contextual(Food.serializer())
}

val json = Json {
    serializersModule = mySerializersModule
    encodeDefaults = true
    ignoreUnknownKeys = true
}