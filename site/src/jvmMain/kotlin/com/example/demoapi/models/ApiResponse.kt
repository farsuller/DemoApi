package com.example.demoapi.models

import kotlinx.serialization.Contextual
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class ApiResponse<T> {

    @Serializable
    @SerialName("success")
    data class Success<T> (@Contextual val data: T) : ApiResponse<T>()

    @Serializable
    @SerialName("error")
    data class Error<T> (val errorMessage: String) : ApiResponse<T>()

}