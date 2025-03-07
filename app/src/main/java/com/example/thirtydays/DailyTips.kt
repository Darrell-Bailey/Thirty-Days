package com.example.thirtydays

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.thirtydays.data.DailyTip
import com.example.thirtydays.data.DailyTips
import com.example.thirtydays.ui.theme.AppTheme

@Composable
fun DailyApp(){
    LazyColumn {
        items(DailyTips){ it ->
            DailyItem(it)
        }
    }
}

@Composable
fun DailyItem(dailyTip: DailyTip, modifier: Modifier = Modifier){
    var hidden by remember { mutableStateOf(true) }

    Card(
        modifier = modifier
            .padding(8.dp)
    ) {
        Row (
            modifier = modifier
                .padding(16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            DailyIconButton(dailyTip.imageResID, {hidden = !hidden})
            if(hidden){
                Spacer(Modifier.width(16.dp))
                DailyTipInfo(dailyTip.stringResID)
            }
        }
    }
}

@Composable
fun DailyIconButton(dailyIcon: Int, onclick: () -> Unit, modifier: Modifier = Modifier){
    ElevatedButton(
        onClick = onclick,
        modifier = modifier
    ) {
        Image(
            painter = painterResource(dailyIcon),
            modifier = Modifier
                .size(128.dp)
                .clip(MaterialTheme.shapes.medium),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun DailyTipInfo(dailyTipInfo: Int, modifier: Modifier = Modifier){
    Text(
        text = stringResource(dailyTipInfo),
        modifier = modifier
    )
}

@Preview (showBackground = true)
@Composable
fun DailyAppPreview(){
    AppTheme {
        DailyApp()
    }
}