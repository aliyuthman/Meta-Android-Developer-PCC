package com.example.app5322

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//            ScrollableRow()

            ScrollableColumn()


        }
    }


    @Composable
    fun MyCard(number:Int) {
        Card(
            elevation = CardDefaults.cardElevation(16.dp),
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = number.toString(),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth()
            )
        }
    }

    @Composable
    fun ScrollableRow() {
        Row(
            modifier = Modifier.horizontalScroll(rememberScrollState())
        ) {
            repeat(20) {
                MyCard(number = it)
            }
        }
    }

    @Composable
    fun ScrollableColumn() {
        Column(
            modifier = Modifier.verticalScroll(rememberScrollState())
        ) {
            ScrollableRow()
            repeat(20) {
                MyCard(number = it)
            }
        }
    }

}


