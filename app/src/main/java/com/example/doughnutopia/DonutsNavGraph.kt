/*
 * Created by Mohamed Naser on 7/14/23, 3:23 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import com.example.doughnutopia.screens.details.detailsRoute
import com.example.doughnutopia.screens.home.homeRoute
import com.example.doughnutopia.screens.onboarding.onBoardingRoute

@Composable
fun DonutsNavGraph() {
    val navController = LocalNavigationProvider.current

    NavHost(navController = navController, startDestination = Screen.OnBoardingScreen.rout) {
        onBoardingRoute()
        homeRoute()
        detailsRoute()
    }
}