/*
 * Created by Mohamed Naser on 7/14/23, 3:23 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.doughnutopia.screens.CartScreen
import com.example.doughnutopia.screens.FavoriteScreen
import com.example.doughnutopia.screens.NotificationScreen
import com.example.doughnutopia.screens.ProfileScreen
import com.example.doughnutopia.screens.details.detailsRoute
import com.example.doughnutopia.screens.home.homeRoute
import com.example.doughnutopia.screens.onboarding.onBoardingRoute

@Composable
fun DonutsNavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = Screen.OnBoardingScreen.route) {
        onBoardingRoute()
        homeRoute()
        composable(route = Screen.FavoriteScreen.route) { FavoriteScreen() }
        composable(route = Screen.NotificationScreen.route) { NotificationScreen() }
        composable(route = Screen.CartScreen.route) { CartScreen() }
        composable(route = Screen.ProfileScreen.route) { ProfileScreen() }
        detailsRoute()
    }
}