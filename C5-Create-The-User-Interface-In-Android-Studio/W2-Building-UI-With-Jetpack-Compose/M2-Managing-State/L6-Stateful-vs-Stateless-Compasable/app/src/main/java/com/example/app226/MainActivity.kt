package com.example.app226

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Button
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            AppScreen()
        }
    }
}

@Composable
fun AppScreen() {

    var count by remember {//
        mutableStateOf(0)
    }

    ItemOrder(count, {count++}, {count--})
}

@Composable
fun ItemOrder(count: Int, onIncrement: () -> Unit, onDecrement: () -> Unit) {

//    var count by remember { \
//
//
// uplifting the state high above the heirrarchy so that the composable up higher can manage the state of the variable outside the itemOrder, thereby making it stateless since, this state is manage outside it.

//        mutableStateOf(0)
//    }
    Column(
        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        ElevatedCard(
            elevation = CardDefaults.cardElevation(defaultElevation = 32.dp)
        ) {
            Column(modifier = Modifier.padding(20.dp)) {

                Text(
                    text = "Greek Salad",
                    fontWeight = FontWeight.W700,
                    fontSize = 30.sp
                )

                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    TextButton(onClick = { onDecrement() }) {

                        Icon(
                            imageVector = Icons.Default.KeyboardArrowLeft,
                            contentDescription = "decrease"
                        )

                    }
                    Text(
                        text = count.toString(),
                        Modifier.size(42.dp),
                        fontSize = 32.sp,
                        textAlign = TextAlign.Center
                    )

                    TextButton(onClick = { onIncrement() }) {

                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight,
                            contentDescription = "Increase"
                        )

                    }
                }

                Button(onClick = { /*TODO*/ }, Modifier.fillMaxWidth()) {
                    Text(text = "Add")

                }

            }

        }
    }

}

//@Preview(showBackground = true)
//@Composable
//fun ItemOrderPreview() {
//    ItemOrder()
//}