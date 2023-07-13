/*
 * Created by Mohamed Naser on 7/12/23, 1:07 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.home.composable

import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.doughnutopia.composable.CustomText
import com.example.doughnutopia.ui.theme.Typography
@Composable
fun TodayOffers(){
    CustomText(
        modifier = Modifier.padding(start = 16.dp,top = 56.dp, bottom = 32.dp),
        text = "Today Offers",
        style = Typography.titleMedium
    )
}