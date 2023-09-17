package com.example.app5314

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyNavigation()
        }
    }
}
/*
*
* Implementing basic navigation with compose to simulate home-screen and name_screen.
* This require informing the gradle to use navigation in this compose project
* Gradle that is a build system installed in Android studio, responsible for building the app so as to run
* it on emulator or on real device.
*
* All we need to do is to go to "build.gradle" at the module level and add navigation dependency inside
* dependencies block
*
*
* After screen and destination interface definition, next is nav controller and Nav Host - for nav controller
* this is define at the top of composable hierarchy
*
* */

@Composable
fun MyNavigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = MenuList.route) {
        composable(Home.route) {
            HomeScreen(navController)
        }
        //specify the arg in the NavHost where it will be utilized
        composable(
            MenuList.route + "/{${MenuList.argOrderNo}}",
            arguments = listOf(navArgument(MenuList.argOrderNo) {
                type = NavType.IntType
            })
        ) {


            MenuListScreen(navController, it.arguments?.getInt(MenuList.argOrderNo))

        }
    }

}
