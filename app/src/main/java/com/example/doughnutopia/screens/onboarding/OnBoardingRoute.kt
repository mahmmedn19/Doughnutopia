/*
 * Created by Mohamed Naser on 7/14/23, 3:24 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.onboarding

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.doughnutopia.Screen

fun NavGraphBuilder.onBoardingRoute() {
    composable(route = Screen.OnBoardingScreen.route) {
        OnBoardingScreen()
    }
}