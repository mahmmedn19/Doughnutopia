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
fun DonutsText(){
    CustomText(
        modifier = Modifier.padding(top = 46.dp, bottom = 64.dp),
        text = "Donuts",
        style = Typography.titleMedium
    )
}