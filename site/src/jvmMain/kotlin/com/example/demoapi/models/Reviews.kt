package com.example.demoapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Reviews(
    val id : Int,

    val name : String? = null,

    @SerialName("profile_image")
    val profileImage : String? = null,

    @SerialName("review_text")
    val reviewText : String? = null,

    @SerialName("review_star")
    val reviewStar : Int = 0,
)

val reviews = listOf(
    Reviews(
        id = 1,
        name = "Ethan McTavish",
        profileImage = "https://images.pexels.com/photos/91227/pexels-photo-91227.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
        reviewText = "Buffalo wings delivery was a spicy delight, perfectly crispy with a tangy kick.",
        reviewStar = 5
    ),
    Reviews(
        id = 2,
        name = "Olivia Martinez",
        profileImage = "https://images.pexels.com/photos/1181690/pexels-photo-1181690.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
        reviewText = "T-bone steak delivery was a carnivore's dream, perfectly grilled and oozing with savory goodness.",
        reviewStar = 5
    ),
    Reviews(
        id = 3,
        name = "Mia Rodriguez",
        profileImage = "https://images.pexels.com/photos/713312/pexels-photo-713312.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
        reviewText = "The spicy bacon fusion fiesta burger delivery was a flavor explosion that left my taste buds craving more.",
        reviewStar = 4
    ),
    Reviews(
        id = 4,
        name = "Elijah Patel",
        profileImage = "https://images.pexels.com/photos/3692876/pexels-photo-3692876.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
        reviewText = "Four-cheese fiesta pizza delivery was a cheesy masterpiece, combining a medley of flavors in every slice.",
        reviewStar = 4
    ),
    Reviews(
        id = 5,
        name = "Isabella Johnson",
        profileImage = "https://images.pexels.com/photos/2323183/pexels-photo-2323183.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1",
        reviewText = "Filipino spaghetti delivery brought home the sweet and savory taste of traditional Filipino cuisine.",
        reviewStar = 5
    ),
)
