/*
 * Created by Mohamed Naser on 7/15/23, 4:51 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.composable


import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.height
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.example.doughnutopia.Screen
import com.example.doughnutopia.ui.theme.Pink
import com.example.doughnutopia.ui.theme.White


@Composable
fun BottomBar(navController: NavHostController) {
    val screens = listOf(
        Screen.HomeScreen,
        Screen.FavoriteScreen,
        Screen.NotificationScreen,
        Screen.CartScreen,
        Screen.ProfileScreen,
    )
    val bottomBarScreens = listOf(
        Screen.OnBoardingScreen.route,
        Screen.DetailsScreen.route,
    )

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentDestination = navBackStackEntry?.destination

    val showBottomBar = currentDestination?.route !in bottomBarScreens

    if (showBottomBar) {
        BottomNavigation(backgroundColor = White, modifier = Modifier.height(68.dp)) {
            screens.forEach { screen ->
                AddItem(
                    screen = screen,
                    currentDestination = currentDestination,
                    navController = navController
                )
            }
        }
    }
}


@Composable
fun RowScope.AddItem(
    screen: Screen,
    currentDestination: NavDestination?,
    navController: NavHostController
) {
    BottomNavigationItem(
        // label = { Text(text = screen.title) },
        icon = {
            val selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true
            Icon(
                painter = painterResource(id = if (selected) screen.iconSelected else screen.icon),
                contentDescription = null,
                tint = Pink
            )
        },
        selected = currentDestination?.hierarchy?.any {
            it.route == screen.route
        } == true,
        onClick = {
            navController.navigate(screen.route) {
                popUpTo(navController.graph.findStartDestination().id) {
                    saveState = true
                }
                launchSingleTop = true
                restoreState = true
            }
        }
    )
}


