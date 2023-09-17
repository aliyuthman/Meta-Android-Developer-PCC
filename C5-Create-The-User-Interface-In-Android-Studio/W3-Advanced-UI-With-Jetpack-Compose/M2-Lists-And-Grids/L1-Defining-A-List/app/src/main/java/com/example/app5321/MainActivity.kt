package com.example.app5321

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.app5321.ui.theme.App5321Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Column(
//                modifier = Modifier.fillMaxWidth(), //use for row
                modifier = Modifier.fillMaxHeight(), //use for row
//                horizontalArrangement = Arrangement.SpaceEvenly,
                verticalArrangement = Arrangement.Center,
            ) {

                Categories.forEach {
                    MenuCategory(category = it)
                }

            }
        }
    }


    @Composable
    fun MenuCategory(category: String) {
        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
            modifier = Modifier.padding(5.dp)
        ) {

            Text(
                text = category,
                color = Color.DarkGray,
                fontWeight = FontWeight.Bold
            )
        }

    }

    @Preview(showBackground = true)
    @Composable
    fun MenuCategoryPreview() {
        MenuCategory(category = "Category")
    }
}

val Categories = listOf<String>(
    "Lunch",
    "Dessert",
    "Mains"
)
