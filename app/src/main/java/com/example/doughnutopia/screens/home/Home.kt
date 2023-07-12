/*
 * Created by Mohamed Naser on 7/12/23, 9:00 AM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.doughnutopia.screens.home.composable.DonutsText
import com.example.doughnutopia.screens.home.composable.GonutsWithSearch
import com.example.doughnutopia.screens.home.composable.TodayOffers

@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
    ) {
        GonutsWithSearch()
        TodayOffers()
        DonutsText()
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen() {
    HomeScreen()
}