/*
 * Created by Mohamed Naser on 7/12/23, 9:01 AM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.doughnutopia.R
import com.example.doughnutopia.composable.CustomIcon
import com.example.doughnutopia.composable.ResizableImage
import com.example.doughnutopia.screens.details.composable.ProductDetailsScreen
import com.example.doughnutopia.screens.details.composable.RotatingDonutsImage
import com.example.doughnutopia.ui.theme.Pink_20
import com.example.doughnutopia.ui.theme.White

@Composable
fun DetailsScreen() {
    LazyColumn(
        modifier = Modifier.fillMaxSize(),
    ) {
        item {
            ConstraintLayout(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Pink_20)
            ) {
                val iconRef = createRef()
                val donutsRef = createRef()
                val card = createRef()
                val imageIcon = createRef()
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
                ResizableImage(
                    modifier = Modifier
                        .size(36.dp)
                        .constrainAs(imageIcon) {
                            top.linkTo(card.top, (-16).dp)
                            end.linkTo(parent.end, 32.dp)
                        }
                        .background(White, RoundedCornerShape(15.dp))
                        .padding(8.dp),
                    painter = painterResource(R.drawable.ic_fav)
                )
            }
        }
    }

}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen() {
    DetailsScreen()
}