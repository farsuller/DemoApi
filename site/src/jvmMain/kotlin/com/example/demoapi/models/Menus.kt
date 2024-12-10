package com.example.demoapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Menus (
    val id : Int,

    @SerialName("menu_name")
    val menuName : String? = null,

    @SerialName("menu_image")
    val menuImage : String? = null,

    @SerialName("is_available")
    val isAvailable : Boolean? = null
)


val menus = listOf(
    Menus(id = 1, menuName = "Burgers", menuImage = "https://images.pexels.com/photos/1199957/pexels-photo-1199957.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", isAvailable = true),
    Menus(id = 2, menuName = "Pizza", menuImage = "https://images.pexels.com/photos/5903162/pexels-photo-5903162.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", isAvailable = true),
    Menus(id = 3, menuName = "Pasta", menuImage = "https://images.pexels.com/photos/4518844/pexels-photo-4518844.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", isAvailable = true),
    Menus(id = 4, menuName = "Salad", menuImage = "https://images.pexels.com/photos/2097090/pexels-photo-2097090.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", isAvailable = true),
    Menus(id = 5, menuName = "Wings", menuImage = "https://images.pexels.com/photos/14661493/pexels-photo-14661493.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", isAvailable = true),
    Menus(id = 6, menuName = "Steaks", menuImage = "https://images.pexels.com/photos/11267137/pexels-photo-11267137.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", isAvailable = true),
    Menus(id = 7, menuName = "Fries", menuImage = "https://images.pexels.com/photos/1893555/pexels-photo-1893555.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", isAvailable = true),
    Menus(id = 8, menuName = "Desserts", menuImage = "https://images.pexels.com/photos/2067396/pexels-photo-2067396.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", isAvailable = true),
    Menus(id = 9, menuName = "Drinks", menuImage = "https://images.pexels.com/photos/3727250/pexels-photo-3727250.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", isAvailable = true),
    Menus(id = 10, menuName = "Coffee", menuImage = "https://images.pexels.com/photos/5865232/pexels-photo-5865232.jpeg?auto=compress&cs=tinysrgb&w=1260&h=750&dpr=1", isAvailable = true),
)