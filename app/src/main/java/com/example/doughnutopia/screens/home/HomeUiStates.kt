/*
 * Created by Mohamed Naser on 7/18/23, 12:37 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.home

data class HomeUiStates(
    val donutsDetailsList: List<Donuts> = emptyList(),
    val donutItemsList: List<DonutItem> = emptyList(),
    val isSearchButtonClicked: Boolean = false
)

data class Donuts(
    val id: Int,
    val name: String,
    val description: String,
    val price: String,
    val discount: String,
    val imageResource: Int,
    val isFavorite: Boolean
)

data class DonutItem(
    val id: Int,
    val name: String,
    val price: String,
    val imageResource: Int
)

