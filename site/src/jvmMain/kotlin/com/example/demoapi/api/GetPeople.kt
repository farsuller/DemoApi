package com.example.demoapi.api

import com.example.demoapi.models.ApiResponse
import com.example.demoapi.models.Person
import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json

private val people = listOf(
    Person(name = "Florence", age = 31),
    Person(name = "Ellen", age = 25),
    Person(name = "Renz", age = 30),
    Person(name = "Goldy", age = 23),
    Person(name = "Grace", age = 24)
)


@Api
suspend fun getPeople(context: ApiContext){
    try {
        val number = context.req.params.getValue("count").toInt()
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.Success(data = people.take(number))
            )
        )
    }
    catch (e: Exception){
        context.res.setBodyText(
            Json.encodeToString<ApiResponse>(
                ApiResponse.Error(errorMessage = e.message.toString())
            )
        )
    }
}