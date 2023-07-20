/*
 * Created by Mohamed Naser on 7/18/23, 12:36 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.home


import androidx.lifecycle.ViewModel
import com.example.doughnutopia.Utils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor() : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiStates())

    val uiState = _uiState.asStateFlow()

    init {
        getDonutsDetails()
        getDonutsItemS()
    }

    private fun getDonutsDetails() {
        _uiState.update {
            it.copy(donutsDetailsList = Utils.getFakeDonutsList())
        }
    }

    private fun getDonutsItemS() {
        _uiState.update {
            it.copy(donutItemsList = Utils.getFakeDonutItemsList())
        }
    }


}