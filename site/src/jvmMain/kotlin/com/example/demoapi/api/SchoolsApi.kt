package com.example.demoapi.api

import com.example.demoapi.dto.ApiResponse
import com.example.demoapi.json
import com.example.demoapi.models.schools
import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.serialization.encodeToString



@Api(routeOverride = "schools")
fun getSchools(context: ApiContext) {

    try {
        val schoolsResponse = ApiResponse.Success(data = schools)
        context.res.headers["Content-Type"] = "application/json"
        context.res.setBodyText(json.encodeToString(schoolsResponse))
    }

    catch (e: Exception){
        val errorResponse = ApiResponse.Error<Nothing>(errorMessage = e.message ?: "Unknown error")
        context.res.headers["Content-Type"] = "application/json"
        context.res.setBodyText(json.encodeToString(errorResponse))
    }
}
