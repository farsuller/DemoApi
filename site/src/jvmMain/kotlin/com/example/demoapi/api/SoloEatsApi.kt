package com.example.demoapi.api

import com.example.demoapi.dto.ApiResponse
import com.example.demoapi.json
import com.example.demoapi.models.*
import com.varabyte.kobweb.api.Api
import com.varabyte.kobweb.api.ApiContext
import com.varabyte.kobweb.api.http.setBodyText
import kotlinx.serialization.encodeToString

@Api
suspend fun getPeople(context: ApiContext) {
    try {
        val number = context.req.params.getValue("count").toInt()
        val menusResponse = ApiResponse.Success(data = people.take(number))
        context.res.setBodyText(json.encodeToString(menusResponse))
    }
    catch (e: Exception){
        val errorResponse = ApiResponse.Error<Nothing>(errorMessage = e.message ?: "Unknown error")
        context.res.setBodyText(json.encodeToString(errorResponse))
    }
}

@Api(routeOverride = "menus")
fun getMenus(context: ApiContext) {
    try {
        val menusResponse = ApiResponse.Success(data = menus)
        context.res.headers["Content-Type"] = "application/json"

        context.res.setBodyText(json.encodeToString(menusResponse))
    } catch (e: Exception) {
        val errorResponse = ApiResponse.Error<Nothing>(errorMessage = e.message ?: "Unknown error")
        context.res.headers["Content-Type"] = "application/json"
        context.res.setBodyText(json.encodeToString(errorResponse))
    }
}

@Api(routeOverride = "reviews")
fun getReviews(context: ApiContext) {
    try {
        val reviewsResponse = ApiResponse.Success(data = reviews)

        context.res.headers["Content-Type"] = "application/json"
        context.res.setBodyText(json.encodeToString(reviewsResponse))
    } catch (e: Exception) {
        val errorResponse = ApiResponse.Error<Nothing>(errorMessage = e.message ?: "Unknown error")
        context.res.headers["Content-Type"] = "application/json"
        context.res.setBodyText(json.encodeToString(errorResponse))
    }
}

@Api(routeOverride = "coupons")
fun getCoupons(context: ApiContext) {
    try {
        val couponsResponse = ApiResponse.Success(data = coupons)

        context.res.headers["Content-Type"] = "application/json"
        context.res.setBodyText(json.encodeToString(couponsResponse))
    } catch (e: Exception) {
        val errorResponse = ApiResponse.Error<Nothing>(errorMessage = e.message ?: "Unknown error")
        context.res.headers["Content-Type"] = "application/json"
        context.res.setBodyText(json.encodeToString(errorResponse))
    }
}

@Api(routeOverride = "products")
fun getProducts(context: ApiContext) {
    try {
        val productsResponse = ApiResponse.Success(data = products)

        context.res.headers["Content-Type"] = "application/json"
        context.res.setBodyText(json.encodeToString(productsResponse))
    } catch (e: Exception) {
        val errorResponse = ApiResponse.Error<Nothing>(errorMessage = e.message ?: "Unknown error")
        context.res.headers["Content-Type"] = "application/json"
        context.res.setBodyText(json.encodeToString(errorResponse))
    }
}