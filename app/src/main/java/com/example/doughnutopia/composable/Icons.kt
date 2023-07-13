/*
 * Created by Mohamed Naser on 7/12/23, 12:55 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.composable

import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource

@Composable
fun CustomIcon(
    modifier: Modifier = Modifier,
    drawableResId: Int,
    contentDescription: String? = null,
    tint: Color = Color.Unspecified
) {
    val painter = painterResource(drawableResId)
    Icon(
        modifier = modifier,
        painter = painter,
        contentDescription = contentDescription,
        tint = tint
    )
}