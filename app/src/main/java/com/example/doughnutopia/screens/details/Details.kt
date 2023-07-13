/*
 * Created by Mohamed Naser on 7/12/23, 9:01 AM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.details

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.doughnutopia.R
import com.example.doughnutopia.composable.CustomButton
import com.example.doughnutopia.composable.CustomIcon
import com.example.doughnutopia.composable.CustomText
import com.example.doughnutopia.screens.details.composable.RotatingDonutsImage
import com.example.doughnutopia.ui.theme.Black
import com.example.doughnutopia.ui.theme.Pink
import com.example.doughnutopia.ui.theme.Pink_20
import com.example.doughnutopia.ui.theme.Typography
import com.example.doughnutopia.ui.theme.White

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


@Composable
fun ProductDetailsScreen(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxSize(),
        shape = RoundedCornerShape(topEnd = 32.dp, topStart = 32.dp),
        colors = CardDefaults.cardColors(
            containerColor = White
        )
    ) {
        ConstraintLayout(
            modifier = Modifier
                .fillMaxSize()
                .padding(40.dp)
        ) {
            val (title, about, description, quantity, rowsButton, rowButtonAddToCart) = createRefs()
            var quantityValue by remember { mutableStateOf(1) }

            CustomText(
                text = "Strawberry Wheel",
                modifier = Modifier.constrainAs(title) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                },
                style = Typography.titleLarge
            )
            CustomText(
                text = "About Gonut",
                modifier = Modifier.constrainAs(about) {
                    top.linkTo(title.bottom, 32.dp)
                    start.linkTo(parent.start)
                },
                style = Typography.titleSmall
            )

            CustomText(
                text = "These soft, cake-like Strawberry Frosted Donuts feature fresh strawberries and a delicious fresh strawberry glaze frosting. Pretty enough for company and the perfect treat to satisfy your sweet tooth.",
                modifier = Modifier.constrainAs(description) {
                    top.linkTo(about.bottom, 16.dp)
                    start.linkTo(parent.start)
                },
                style = Typography.bodySmall
            )

            CustomText(
                text = "Quantity",
                modifier = Modifier.constrainAs(quantity) {
                    top.linkTo(description.bottom, 16.dp)
                    start.linkTo(parent.start)
                },
                style = Typography.titleSmall
            )

            Row(
                modifier = Modifier.constrainAs(rowsButton) {
                    top.linkTo(quantity.bottom, 32.dp)
                    start.linkTo(parent.start)
                },
                verticalAlignment = Alignment.CenterVertically
            ) {
                CustomText(
                    modifier = Modifier
                        .clickable { quantityValue-- }
                        .padding(end = 24.dp)
                        .size(45.dp)
                        .background(White, RoundedCornerShape(15.dp))
                        .padding(start = 12.dp, end = 12.dp),
                    text = "-",
                    style = TextStyle(
                        fontSize = 32.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                    ),
                    color = Black
                )
                CustomText(
                    text = quantityValue.toString(),
                    style = Typography.titleMedium,
                    color = Black
                )

                CustomText(
                    modifier = Modifier
                        .clickable { quantityValue++ }
                        .padding(start = 24.dp)
                        .size(45.dp)
                        .background(Black, RoundedCornerShape(15.dp))
                        .padding(start = 12.dp, end = 12.dp),
                    text = "+",
                    style = TextStyle(
                        fontSize = 32.sp,
                        fontFamily = FontFamily(Font(R.font.inter)),
                        fontWeight = FontWeight(500),
                    ),
                    color = White
                )

            }
            Row(
                modifier = Modifier.constrainAs(rowButtonAddToCart) {
                    top.linkTo(rowsButton.bottom, 16.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
                verticalAlignment = Alignment.CenterVertically
            ) {
                CustomText(
                    modifier = Modifier
                        .padding(end = 24.dp),
                    text = "$16",
                    style = Typography.titleLarge,
                    color = Black
                )
                CustomButton(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(67.dp),
                    onClick = { /* Add to cart logic */ },
                    text = "Add to Cart",
                    buttonColor = Pink,
                    textStyle = Typography.labelLarge,
                    textColor = White
                )
            }

        }
    }
}