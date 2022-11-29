package com.example.plantapp.model

import java.text.NumberFormat


data class PlantItem(
    val name: String,
    val price: Double,
    val type: Int
) {

    data class PlantItem(
        val name: String,
        val price: Double,
        val type: Int
    )

        fun getFormattedPrice(): String = NumberFormat.getCurrencyInstance().format(price)
    }
