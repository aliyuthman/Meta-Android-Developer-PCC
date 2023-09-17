package com.example.app225

import android.content.res.Configuration.ORIENTATION_LANDSCAPE
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.unit.dp
import com.example.app225.ui.theme.Pink80
import com.example.app225.ui.theme.Purple80
import com.example.app225.ui.theme.PurpleGrey80

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            val drawerState = rememberDrawerState(initialValue = DrawerValue.Open)
//
            ModalNavigationDrawer(
                drawerState = drawerState,
                drawerContent = { /*TODO*/ }) {

                Scaffold(

                    topBar = {
                        TopAppBar(
                            title = { Text(resources.getString(R.string.app_name)) },
                            colors = TopAppBarDefaults.smallTopAppBarColors(containerColor = Color.White),
                            navigationIcon = {
                                IconButton(onClick = { /*TODO*/ }) {

                                    Icon(
                                        imageVector = Icons.Default.ArrowBack,
                                        contentDescription = "Close Icon"
                                    )
                                }
                            },

                            actions = {
                                IconButton(onClick = { /*TODO*/ }) {

                                    Icon(
                                        imageVector = Icons.Default.MoreVert,
                                        contentDescription = "action icon"
                                    )

                                }
                            }


                        )
                    },
                    content = { paddingValues ->
                        MenuContent(paddingValues = paddingValues)
                    }
                )
            }

        }
    }
}

@Composable
fun MenuContent(paddingValues: PaddingValues) {
    Surface(modifier = Modifier.padding(paddingValues)) {
        val menuPadding = 8.dp
        val configuration = LocalConfiguration.current

        when (configuration.orientation) {

            ORIENTATION_LANDSCAPE -> {

                Column {
                    Row (modifier = Modifier.weight(0.5f)) {
                        Text(
                            "Appetizers",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Color.LightGray)
                                .padding(menuPadding)
                                .fillMaxWidth()
                        )
                        Text(
                            "Salads",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Color.Gray)
                                .padding(menuPadding)
                                .fillMaxWidth()
                        )
                    }

                    Row (modifier = Modifier.weight(0.5f)){
                        Text(
                            "Drinks",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Color.DarkGray)
                                .padding(menuPadding)
                                .fillMaxWidth()
                        )
                        Text(
                            "Mains",
                            modifier = Modifier
                                .weight(0.25f)
                                .fillMaxHeight()
                                .background(Color.Magenta)
                                .padding(menuPadding)
                                .fillMaxWidth()
                        )
                    }
                }


            }

            else -> {

                Column {
                    Text(
                        "Appetizers",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(Purple80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Salads",
                        modifier = Modifier
                            .weight(0.25f)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Drinks",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(Pink80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                    Text(
                        "Mains",
                        modifier = Modifier
                            .weight(0.25f)
                            .background(PurpleGrey80)
                            .padding(menuPadding)
                            .fillMaxWidth()
                    )
                }

            }


        }


    }
}