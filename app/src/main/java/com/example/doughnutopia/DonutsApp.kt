/*
 * Created by Mohamed Naser on 7/14/23, 3:22 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia

import android.annotation.SuppressLint
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController

val LocalNavigationProvider = staticCompositionLocalOf<NavHostController> {
    error("No navigation host controller provided.")
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DonutsApp() {
    CompositionLocalProvider(LocalNavigationProvider provides rememberNavController()) {
        DonutsNavGraph()
    }
}