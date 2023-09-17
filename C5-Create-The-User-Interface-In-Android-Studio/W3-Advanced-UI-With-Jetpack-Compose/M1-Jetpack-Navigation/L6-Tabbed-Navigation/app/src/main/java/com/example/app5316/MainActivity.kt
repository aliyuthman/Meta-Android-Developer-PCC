package com.example.app5316

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.app5316.ui.theme.App5316Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            MyApp()

        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyApp() {
    val navController = rememberNavController()
    Scaffold(bottomBar = { MyBottomNavigation(navController = navController) }) {

        Box(Modifier.padding(it)) {
            NavHost(navController = navController, startDestination = Home.route) {
                composable(Home.route){
                    HomeScreen()
                }


                composable(Settings.route){
                    SettingsScreen()
                }


                composable(Profile.route){
                    ProfileScreen()
                }

            }

        }

    }

}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {

}


@Composable
fun MyBottomNavigation(navController: NavController) {

    val destinationsList = listOf<Destinations>(
        Home,
        Settings,
        Profile
    )

    val selectedIndex = rememberSaveable() {

        mutableIntStateOf(0)

    }

    NavigationBar {
        destinationsList.forEachIndexed() { index, destination ->
            NavigationBarItem(
                label = { Text(text = destination.title) },
                selected = index == selectedIndex.value,
                onClick = {
                    selectedIndex.value = index
                    navController.navigate(destinationsList[index].route) {
                        popUpTo(Home.route)  //to remove everything from stack to home screen
                        launchSingleTop = true //to prevent adding the same screen more than once,
                    }
                },
                icon = {
                    Icon(
                        imageVector = destination.icon,
                        contentDescription = destination.title
                    )
                })
        }
    }

}