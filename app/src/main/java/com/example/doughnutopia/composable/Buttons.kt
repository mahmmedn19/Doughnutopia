/*
 * Created by Mohamed Naser on 7/12/23, 9:33 AM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.composable

import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import com.example.doughnutopia.ui.theme.Black
import com.example.doughnutopia.ui.theme.White

@Composable
fun CustomButton(
    modifier: Modifier = Modifier,
    text: String,
    onClick: () -> Unit,
    textStyle: TextStyle = TextStyle.Default,
    textColor: Color = Black,
    buttonColor: Color = White,
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        colors = ButtonDefaults.buttonColors(
            contentColor = Color.Transparent,
            containerColor = buttonColor
        ),
        shape = CircleShape
    ) {
        CustomText(
            text = text,
            style = textStyle,
            color = textColor
        )
    }
}