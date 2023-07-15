/*
 * Created by Mohamed Naser on 7/12/23, 9:35 AM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign

@Composable
fun CustomText(
    text: String,
    modifier: Modifier = Modifier,
    style: TextStyle = TextStyle.Default,
    color: Color = Color.Unspecified,
    textAlign: TextAlign = TextAlign.Start
) {
    Text(
        text = text,
        modifier = modifier,
        style = style,
        color = color,
        textAlign = textAlign
    )
}


