package com.example.app5313

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController


@Composable
fun DashboardScreen(navController: NavHostController) {
//NavGraph require routes, those we need to create an interface for all the destination
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Dashboard Screen", fontSize = 48.sp)
        Button(onClick = { navController.navigate(Detail.route) }) {

            Text(
                text = "Next",
                fontSize = 18.sp,
                modifier = Modifier.padding(horizontal = 32.dp, vertical = 8.dp)
            )

        }
    }

}