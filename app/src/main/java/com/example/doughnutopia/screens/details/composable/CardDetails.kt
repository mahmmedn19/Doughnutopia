/*
 * Created by Mohamed Naser on 7/13/23, 5:23 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.details.composable

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.doughnutopia.R
import com.example.doughnutopia.composable.CustomButton
import com.example.doughnutopia.composable.CustomIconButton
import com.example.doughnutopia.composable.CustomText
import com.example.doughnutopia.ui.theme.Black
import com.example.doughnutopia.ui.theme.Pink
import com.example.doughnutopia.ui.theme.Typography
import com.example.doughnutopia.ui.theme.White

@Composable
fun ProductDetailsScreen(modifier: Modifier = Modifier) {
    Card(
        modifier = modifier.fillMaxSize(),
        shape = RoundedCornerShape(topEnd = 40.dp, topStart = 40.dp),
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
                text = stringResource(R.string.strawberry_wheel),
                modifier = Modifier.constrainAs(title) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                },
                style = Typography.titleLarge
            )
            CustomText(
                text = stringResource(R.string.about_gonut),
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
                text = stringResource(R.string.quantity),
                modifier = Modifier.constrainAs(quantity) {
                    top.linkTo(description.bottom, 16.dp)
                    start.linkTo(parent.start)
                },
                style = Typography.titleSmall
            )

            Row(
                modifier = Modifier
                    .wrapContentSize()
                    .constrainAs(rowsButton) {
                        top.linkTo(quantity.bottom, 16.dp)
                        start.linkTo(parent.start)
                    },
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                CustomIconButton(
                    modifier = Modifier.padding(end = 16.dp),
                    onClick = { quantityValue-- },
                    icon = Icons.Default.Remove,
                    tint = Black,
                    background = White
                )
                CustomText(
                    modifier = Modifier.width(32.dp),
                    text = quantityValue.toString(),
                    style = Typography.titleMedium,
                    color = Black,
                    textAlign = TextAlign.Center
                )
                CustomIconButton(
                    modifier = Modifier.padding(start = 16.dp),
                    onClick = { quantityValue++ },
                    icon = Icons.Default.Add,
                    tint = White,
                    background = Black
                )
            }
            Row(
                modifier = Modifier.constrainAs(rowButtonAddToCart) {
                    top.linkTo(rowsButton.bottom, 36.dp)
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
                        .height(56.dp),
                    onClick = { /* Add to cart logic */ },
                    text = stringResource(R.string.add_to_cart),
                    buttonColor = Pink,
                    textStyle = Typography.labelLarge,
                    textColor = White
                )
            }

        }
    }
}