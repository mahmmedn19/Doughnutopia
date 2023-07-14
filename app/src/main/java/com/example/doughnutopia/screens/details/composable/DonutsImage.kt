/*
 * Created by Mohamed Naser on 7/13/23, 2:43 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.details.composable

import androidx.compose.animation.core.LinearEasing
import androidx.compose.animation.core.animateFloat
import androidx.compose.animation.core.infiniteRepeatable
import androidx.compose.animation.core.rememberInfiniteTransition
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.doughnutopia.R

@Composable
fun RotatingDonutsImage(modifier: Modifier = Modifier) {
    val rotationAngle = rememberInfiniteTransition().animateFloat(
        initialValue = 0f,
        targetValue = 360f,
        animationSpec = infiniteRepeatable(
            animation = tween(
                durationMillis = 2000,
                easing = LinearEasing
            )
        )
    ).value

    val donutsImage: Painter = painterResource(id = R.drawable.donuts)

    ConstraintLayout(
        modifier = modifier
    ) {
        val (image) = createRefs()

        Image(
            painter = donutsImage,
            contentDescription = "Donuts",
            modifier = Modifier
                .offset(y = (-16).dp)
                .size(300.dp)
                .rotate(rotationAngle)
                .constrainAs(image) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                },
            contentScale = ContentScale.Crop
        )
    }
}