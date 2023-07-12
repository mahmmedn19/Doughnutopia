/*
 * Created by Mohamed Naser on 7/12/23, 9:02 AM, 2023.
 *
 * Copyright (c) 2023 All rights reserved.
 */

package com.example.doughnutopia.screens.onboarding

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import com.example.doughnutopia.R
import com.example.doughnutopia.composable.CustomButton
import com.example.doughnutopia.composable.CustomText
import com.example.doughnutopia.ui.theme.Typography

@Composable
fun OnBoardingScreen() {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.background),
                contentScale = ContentScale.Crop
            )
    ) {
        val titleRef = createRef()
        val bodyRef = createRef()
        val buttonRef = createRef()
        CustomText(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(titleRef) {
                    bottom.linkTo(bodyRef.top, 18.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .padding(horizontal = 40.dp),
            text = "Gonuts\n" +
                    "with\n" +
                    "Donuts",
            style = Typography.displayLarge
        )

        CustomText(
            modifier = Modifier
                .fillMaxWidth()
                .constrainAs(bodyRef) {
                    bottom.linkTo(buttonRef.top, 60.dp)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .padding(horizontal = 40.dp),
            text = stringResource(R.string.dounts_body),
            style = Typography.bodyLarge
        )

        CustomButton(
            modifier = Modifier
                .constrainAs(buttonRef) {
                    start.linkTo(parent.start)
                    bottom.linkTo(parent.bottom, 46.dp)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth()
                .height(68.dp)
                .padding(horizontal = 40.dp),
            text = "Get Started",
            onClick = { /*TODO*/ },
            textStyle = Typography.labelLarge
        )
    }
}

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun PreviewScreen() {
    OnBoardingScreen()
}