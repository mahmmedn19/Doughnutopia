/*
 * Created by Mohamed Naser on 7/12/23, 9:00 AM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.home

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.doughnutopia.R
import com.example.doughnutopia.composable.CustomText
import com.example.doughnutopia.composable.ResizableImage
import com.example.doughnutopia.screens.home.composable.DonutsText
import com.example.doughnutopia.screens.home.composable.GonutsWithSearch
import com.example.doughnutopia.screens.home.composable.TodayOffers
import com.example.doughnutopia.ui.theme.Black
import com.example.doughnutopia.ui.theme.Black_60
import com.example.doughnutopia.ui.theme.Typography
import com.example.doughnutopia.ui.theme.White

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        GonutsWithSearch()
        TodayOffers()
        Box(
            modifier = Modifier
                .shadow(
                    elevation = 40.dp,
                    spotColor = Color(0x1A000000),
                    ambientColor = Color(0x1A000000)
                )
                .width(193.dp)
                .height(325.dp)
                .background(color = Color(0xFFD7E4F6), shape = RoundedCornerShape(size = 20.dp))
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 16.dp, top = 16.dp)
            ) {
                ResizableImage(
                    modifier = Modifier
                        .size(36.dp)
                        .background(White, CircleShape)
                        .padding(8.dp),
                    painter = painterResource(id = R.drawable.ic_fav)
                )
                Box(
                    modifier = Modifier.fillMaxWidth(),
                ) {
                    ResizableImage(
                        modifier = Modifier
                            .offset(120.dp, 0.dp)
                            .size(100.dp),
                        painter = painterResource(id = R.drawable.ic_launcher_background)
                    )
                }
                CustomText(
                    modifier = Modifier.padding(bottom = 8.dp, top = 16.dp),
                    text = "Strawberry Wheel",
                    style = Typography.titleSmall
                )
                CustomText(
                    modifier = Modifier.padding(bottom = 8.dp),
                    text = "These Baked Strawberry Donuts are filled with fresh strawberries...",
                    style = Typography.bodySmall
                )
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(end = 16.dp),
                    horizontalArrangement = Arrangement.End,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    CustomText(
                        modifier = Modifier.padding(end = 8.dp),
                        text = "$20",
                        style = Typography.labelLarge,
                        color = Black_60
                    )
                    CustomText(
                        modifier = Modifier.padding(bottom = 8.dp),
                        text = "$16",
                        style = Typography.titleLarge,
                        color = Black
                    )
                }
            }
        }
        DonutsText()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen() {
    HomeScreen()
}