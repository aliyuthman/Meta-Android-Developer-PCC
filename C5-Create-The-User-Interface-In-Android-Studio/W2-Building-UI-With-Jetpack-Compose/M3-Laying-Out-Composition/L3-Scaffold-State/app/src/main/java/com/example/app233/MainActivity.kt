package com.example.app233

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.NavigationDrawerItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

//adding drawer and drawer action open
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomeScreen()
        }
    }
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    //here from the drawer, we want to make the drawer show up when the menu icon is clicked
    /*For this we declare two above the scaffold here:
    *
    * 1. Scaffold state
    * 2. scope with coroutine scope
    *
    * */

//    val scaffoldState = rememberScaffoldState() deprecated

    val scope = rememberCoroutineScope()
    val drawerState = rememberDrawerState(initialValue = DrawerValue.Closed)


    ModalNavigationDrawer(

        drawerState = drawerState,
        drawerContent = {
            DrawerPanel(drawerState = drawerState, scope = scope)
        }) {


        Scaffold(
            topBar = {
                TopAppBar(drawerState = drawerState, scope = scope)
            }
        ) {

            Column {
                UpperPanel()
                LowerPanel()
            }

        }

    }

}

