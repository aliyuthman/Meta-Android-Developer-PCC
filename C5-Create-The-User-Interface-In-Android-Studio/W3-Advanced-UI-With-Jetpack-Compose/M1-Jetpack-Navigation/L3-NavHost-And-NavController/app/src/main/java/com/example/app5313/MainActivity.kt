package com.example.app5313

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyNavigation()
        }
    }
}


@Composable
fun MyNavigation() {

    //complete navigation is created here

    val navController = rememberNavController()//creating nav controller through remember nav controller
    /*Note: the nav controller must created at the top hierarchy of composable function and
    a reference of the controller must be passed to the functions that perform navigation
     and finally navController must be pass to navHost as parameter*/


    NavHost(navController = navController, startDestination = Dashboard.route ){

        //Composable functions is used to define the roots in NavHost

        composable(Dashboard.route){

            DashboardScreen(navController)

        }


        composable(Detail.route){

            DetailScreen(navController)
        }

    }

}