package com.example.demoapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Coupons(
    val id: Int,

    @SerialName("image_path")
    val imagePath: String? = null,

    val title: String? = null,

    val description: String? = null
)


val coupons = listOf(
    Coupons(id = 1, title = "100% Free", description = "Free Delivery"),
    Coupons(
        id = 2,
        title = "40% Burger Spree",
        description = "Discounted Burger Prices",
        imagePath = "file:///android_asset/images/burger/CheesyHavenDeluxe.png"
    ),
    Coupons(
        id = 3,
        title = "Choco Cookie Freebie",
        description = "Enjoy 1 Free Drink",
        imagePath = "file:///android_asset/images/drinks/ChocoCookieCream.png"
    ),
    Coupons(
        id = 4,
        title = "Pizza Mania",
        description = "50% Off on All Pizzas",
        imagePath = "file:///android_asset/images/pizza/TropicalHawaiianPizza.png"
    ),

    Coupons(id = 5, title = "Combo Bonanza", description = "Save Big with Our Combo Deals"),
)