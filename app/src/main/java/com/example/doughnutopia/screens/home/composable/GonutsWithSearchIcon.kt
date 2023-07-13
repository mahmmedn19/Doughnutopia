/*
 * Created by Mohamed Naser on 7/12/23, 1:06 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.doughnutopia.R
import com.example.doughnutopia.composable.CustomIcon
import com.example.doughnutopia.composable.CustomText
import com.example.doughnutopia.ui.theme.Pink_20
import com.example.doughnutopia.ui.theme.Typography

@Composable
fun GonutsWithSearch() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, top = 32.dp, bottom = 16.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Column {
            CustomText(
                text = "Let’s Gonuts!",
                style = Typography.titleLarge
            )
            CustomText(
                text = "Order your favourite donuts from here",
                style = Typography.labelMedium
            )
        }
        CustomIcon(
            modifier = Modifier
                .background(
                    Pink_20, RoundedCornerShape(8.dp)
                )
                .padding(4.dp),
            drawableResId = R.drawable.ic_search,
        )
    }
}