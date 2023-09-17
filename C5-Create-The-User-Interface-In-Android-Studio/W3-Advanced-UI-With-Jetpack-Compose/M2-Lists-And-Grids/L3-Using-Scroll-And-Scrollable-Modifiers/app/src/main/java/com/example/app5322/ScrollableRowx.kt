package com.example.app5322

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Preview(showBackground = true)
@Composable
fun ScrollableRowx() {

    Row(
        modifier = Modifier.horizontalScroll(rememberScrollState())
    ) {
        repeat(20) {
            Card(
                elevation = CardDefaults.cardElevation(16.dp),
                modifier = Modifier.padding(16.dp),
                shape = RoundedCornerShape(100.dp),
            ) {

                Text(
                    text = it.toString(),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                )

            }
        }


    }

    Column(
        modifier = Modifier.verticalScroll(rememberScrollState()).padding(top = 100.dp)
    ) {
        repeat(20) {
            Card(
                elevation = CardDefaults.cardElevation(16.dp),
                modifier = Modifier.padding(16.dp),
//                border = BorderStroke(4.dp, Color.Gray),
                shape = RoundedCornerShape(30.dp)
            ) {

                Text(
                    text = it.toString(),
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxWidth()
                )

            }
        }
    }

}
