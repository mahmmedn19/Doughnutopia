/*
 * Created by Mohamed Naser on 7/12/23, 9:01 AM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.doughnutopia.R
import com.example.doughnutopia.composable.CustomIcon
import com.example.doughnutopia.screens.details.composable.ProductDetailsScreen
import com.example.doughnutopia.screens.details.composable.RotatingDonutsImage
import com.example.doughnutopia.ui.theme.Pink_20

@Composable
fun DetailsScreen() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .background(Pink_20)
    ) {
        val iconRef = createRef()
        val donutsRef = createRef()
        val card = createRef()
        val guideline = createGuidelineFromTop(300.dp)

        CustomIcon(
            modifier = Modifier.constrainAs(iconRef) {
                start.linkTo(parent.start, 16.dp)
                top.linkTo(parent.top, 16.dp)
            },
            drawableResId = R.drawable.ic_back,
        )
        RotatingDonutsImage(
            modifier = Modifier.constrainAs(donutsRef) {
                top.linkTo(iconRef.bottom, 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
        ProductDetailsScreen(modifier = Modifier.constrainAs(card) {
            top.linkTo(guideline, 16.dp)
            start.linkTo(parent.start)
            end.linkTo(parent.end)
        })

    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen() {
    DetailsScreen()
}