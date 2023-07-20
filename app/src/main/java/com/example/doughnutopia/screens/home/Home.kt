/*
 * Created by Mohamed Naser on 7/12/23, 9:00 AM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.home

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.doughnutopia.navigation.LocalNavigationProvider
import com.example.doughnutopia.R
import com.example.doughnutopia.screens.home.composable.DonutsList
import com.example.doughnutopia.screens.home.composable.DonutsText
import com.example.doughnutopia.screens.home.composable.GonutsWithSearch
import com.example.doughnutopia.screens.home.composable.TodayList
import com.example.doughnutopia.screens.home.composable.TodayOffers

@Composable
fun HomeScreen(){
    val  viewModel: HomeViewModel = hiltViewModel()
    val state by viewModel.uiState.collectAsState()

    val navController = LocalNavigationProvider.current

    HomeContent(state =state)
}


@Composable
fun HomeContent(state: HomeUiStates) {
    val navController = LocalNavigationProvider.current


    LazyColumn(modifier = Modifier.fillMaxSize()) {
        item {
            GonutsWithSearch()
        }
        item {
            TodayOffers()
        }
        item {
            TodayList(state,navController)
        }
        item {
            DonutsText()
        }
        item {
            DonutsList(state)
        }
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen() {
    HomeScreen()
}