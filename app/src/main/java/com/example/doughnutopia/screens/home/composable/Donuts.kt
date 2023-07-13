/*
 * Created by Mohamed Naser on 7/13/23, 12:22 PM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.doughnutopia.R
import com.example.doughnutopia.composable.CustomText
import com.example.doughnutopia.composable.ResizableImage
import com.example.doughnutopia.ui.theme.Pink
import com.example.doughnutopia.ui.theme.Typography

@Composable
fun DonutsList(imageList: List<Int>) {
    LazyRow(
        horizontalArrangement = Arrangement.spacedBy(32.dp),
        contentPadding = PaddingValues(start = 16.dp, end = 16.dp, top = 32.dp)
    ) {
        items(10) { index ->
            Box(
                modifier = Modifier
                    .width(138.dp)
                    .height(111.dp)
                    .background(
                        color = Color(0xFFFFFFFF),
                        shape = RoundedCornerShape(
                            topStart = 20.dp,
                            topEnd = 20.dp,
                            bottomEnd = 10.dp,
                            bottomStart = 10.dp
                        )
                    ),
                contentAlignment = Alignment.BottomCenter
            ) {
                ResizableImage(
                    modifier = Modifier.offset(x = 0.dp, y = (-48).dp),
                    painter = painterResource(id = R.drawable.image2),
                    size = 100
                )
                CustomText(
                    modifier = Modifier.offset(x = 0.dp, y = (-32).dp),
                    text = "Strawberry Wheel",
                    style = Typography.labelMedium
                )
                CustomText(
                    modifier = Modifier.offset(x = 0.dp, y = (-8).dp),
                    text = "$22",
                    style = Typography.labelMedium,
                    color = Pink
                )

            }
        }
    }


}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreenList() {
    val listImage = listOf(
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
        R.drawable.image,
    )
    DonutsList(listImage)
}