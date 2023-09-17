package com.example.app5315

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app5315.ui.theme.App5315Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            App5315Theme {

                AppScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun AppScreen() {
    Scaffold(topBar = {
        TopAppBar()
    }) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .padding(it)
        ) {

            MyNavigation()

        }
    }
}


@Composable
fun MyNavigation() {

    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Home.route ){

        composable(Home.route){

            HomeScreen(navController = navController)
        }


        composable(Menu.route){

            MenuListScreen(navController = navController)
        }
    }

}