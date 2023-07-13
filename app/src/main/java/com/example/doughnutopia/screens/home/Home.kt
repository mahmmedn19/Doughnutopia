/*
 * Created by Mohamed Naser on 7/12/23, 9:00 AM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.home

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.doughnutopia.R
import com.example.doughnutopia.screens.home.composable.DonutsList
import com.example.doughnutopia.screens.home.composable.DonutsText
import com.example.doughnutopia.screens.home.composable.GonutsWithSearch
import com.example.doughnutopia.screens.home.composable.TodayList
import com.example.doughnutopia.screens.home.composable.TodayOffers

@Composable
fun HomeScreen() {
    val listImage = listOf(
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
    )

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            GonutsWithSearch()
        }
        item {
            TodayOffers()
        }
        item {
            TodayList(listImage)
        }
        item {
            DonutsText()
        }
        item {
            DonutsList(listImage)
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen() {
    HomeScreen()
}