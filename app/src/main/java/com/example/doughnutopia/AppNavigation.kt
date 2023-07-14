/*
 * Created by Mohamed Naser on 7/14/23, 3:30 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia

sealed class Screen(val rout: String) {
    object OnBoardingScreen : Screen("OnBoardingScreen")
    object HomeScreen : Screen("HomeScreen")
    object DetailsScreen : Screen("DetailsScreen")
}