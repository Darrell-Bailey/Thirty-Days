package com.example.thirtydays.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.thirtydays.R

data class DailyTip(
    @StringRes val stringResID : Int,
    @DrawableRes val imageResID : Int
    )

val DailyTips = listOf(
    DailyTip(
        stringResID = R.string.tip_one,
        imageResID = R.drawable.drinking_water
    ),
    DailyTip(
        stringResID = R.string.tip_two,
        imageResID = R.drawable.spendtimeoutdoors
    ),
    DailyTip(
        stringResID = R.string.tip_three,
        imageResID = R.drawable.reading
    ),
    DailyTip(
        stringResID = R.string.tip_four,
        imageResID = R.drawable.nutrtitiousmeal
    ),
    DailyTip(
        stringResID = R.string.tip_five,
        imageResID = R.drawable.friends
    ),
    DailyTip(
        stringResID = R.string.tip_six,
        imageResID = R.drawable.creative
    ),
    DailyTip(
        stringResID = R.string.tip_seven,
        imageResID = R.drawable.caring
    ),
    DailyTip(
        stringResID = R.string.tip_eight,
        imageResID = R.drawable.nice
    ),
    DailyTip(
        stringResID = R.string.tip_nine,
        imageResID = R.drawable.stretch
    ),
    DailyTip(
        stringResID = R.string.tip_ten,
        imageResID = R.drawable.positivity
    ),
    DailyTip(
        stringResID = R.string.tip_eleven,
        imageResID = R.drawable.breathing
    )
)