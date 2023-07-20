/*
 * Created by Mohamed Naser on 7/18/23, 1:17 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.navigation

import com.example.doughnutopia.R

sealed class Screen(
    val route: String,
    val title: String,
    val icon: Int,
    val iconSelected:Int
) {
    object HomeScreen : Screen("HomeScreen", "Home", R.drawable.ic_home, R.drawable.home1)
    object FavoriteScreen : Screen("FavoriteScreen", "Favorite",
        R.drawable.ic_fav,
        R.drawable.heart1
    )
    object NotificationScreen :
        Screen("NotificationScreen", "Notification",
            R.drawable.ic_notification,
            R.drawable.notification1
        )

    object CartScreen : Screen("CartScreen", "Cart", R.drawable.ic_buy, R.drawable.buy1)
    object ProfileScreen : Screen("ProfileScreen", "Profile",
        R.drawable.ic_user,
        R.drawable.ic_user
    )
    object OnBoardingScreen : Screen("OnBoardingScreen", "", 0,0)
    object DetailsScreen : Screen("DetailsScreen", "", 0,0)

}