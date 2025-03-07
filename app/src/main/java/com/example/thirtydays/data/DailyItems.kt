package com.example.thirtydays.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.thirtydays.R

data class DailyTip(
    @StringRes val stringResID : Int,
    @DrawableRes val imageResID : Int
    )

val DailyTips = listOf(
    DailyTip(
        stringResID = R.string.tip_one,
        imageResID = R.drawable.drinking_water
    )
)