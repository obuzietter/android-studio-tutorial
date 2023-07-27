package com.example.myapplication

data class Model(var hobby: String)

object Supplier {
    val hobbies = listOf<Model>(
        Model("Programming"),
        Model("Programming"),
        Model("Photography"),
        Model("Reading Fiction"),
        Model("Gardening"),
        Model("Cooking"),
        Model("Playing a Musical Instrument"),
        Model("Hiking"),
        Model("Painting"),
        Model("Yoga"),
        Model("Collecting Stamps"),
        Model("Woodworking"),
        Model("Dancing")
    )
}
