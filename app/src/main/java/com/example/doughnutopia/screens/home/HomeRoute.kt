/*
 * Created by Mohamed Naser on 7/14/23, 3:24 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.home

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.example.doughnutopia.navigation.Screen


fun NavGraphBuilder.homeRoute() {
    composable(route = Screen.HomeScreen.route) {
        HomeScreen()
    }
}