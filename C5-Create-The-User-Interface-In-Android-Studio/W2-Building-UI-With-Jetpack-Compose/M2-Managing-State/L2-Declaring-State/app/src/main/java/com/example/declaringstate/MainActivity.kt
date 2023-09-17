package com.example.declaringstate

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            ItemOrder()
        }
    }
}

/*
*
* Without the mutable state, every change on button click trigger recomposition which in turn calls the composable again and this also reset the value of count variable to zero
*
* */
@Composable
fun ItemOrder() {
//    var count = 0 //the count variable to keep track of the value - without mutable state

    var count by remember {
        mutableStateOf(0)
    }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Text(
            text = "Greek Salad",
            fontSize = 30.sp
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {

            IconButton(onClick = {
                if (count == 0) {

                    count = 0
                } else{

                    count--
                }


            }) {

                Icon(
                    imageVector = Icons.Default.ArrowBack,
                    contentDescription = "count down"
                )

            }

            Text(
                text = "$count",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(8.dp)
            )

            IconButton(onClick = { count++ }) {

                Icon(
                    imageVector = Icons.Default.ArrowForward,
                    contentDescription = "count up"
                )

            }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun ItemOrderPreview() {

    ItemOrder()

}