package com.example.app5324

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.app5324.ui.theme.App5324Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App5324Theme {

                AppScreen()

            }
        }
    }
}

@Composable
fun AppScreen() {

    ScrollableGalleryScreen()

}

