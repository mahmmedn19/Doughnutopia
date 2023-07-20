/*
 * Created by Mohamed Naser on 7/18/23, 1:18 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia

import com.example.doughnutopia.screens.home.DonutItem
import com.example.doughnutopia.screens.home.Donuts

object Utils {
        fun getFakeDonutsList(): List<Donuts> {
            return listOf(
                Donuts(
                    id = 1,
                    name = "Strawberry Donut",
                    description = "Delicious donut with fresh strawberries",
                    price = "$16",
                    discount = "$10",
                    imageResource = R.drawable.image,
                    isFavorite = false
                ),
                Donuts(
                    id = 2,
                    name = "Chocolate Donut",
                    description = "Rich and decadent chocolate donut",
                    price = "$34",
                    discount = "$15",
                    imageResource = R.drawable.image,
                    isFavorite = true
                ),
                Donuts(
                    id = 3,
                    name = "Vanilla Donut",
                    description = "Classic vanilla-flavored donut",
                    price = "$29",
                    discount = "$5",
                    imageResource = R.drawable.image,
                    isFavorite = false
                ),
                Donuts(
                    id = 3,
                    name = "Chocolate Donut",
                    description = "Classic vanilla-flavored donut",
                    price = "$19",
                    discount = "$5",
                    imageResource = R.drawable.image,
                    isFavorite = false
                ),
            )
        }
        fun getFakeDonutItemsList(): List<DonutItem> {
            return listOf(
                DonutItem(
                    id = 1,
                    name = "Chocolate Sprinkles",
                    price = "$1.99",
                    imageResource = R.drawable.image2
                ),
                DonutItem(
                    id = 2,
                    name = "Glazed Donut",
                    price = "$1.49",
                    imageResource = R.drawable.image2
                ),
                DonutItem(
                    id = 3,
                    name = "Strawberry Frosted",
                    price = "$2.49",
                    imageResource = R.drawable.image2
                ),
            )
        }


}