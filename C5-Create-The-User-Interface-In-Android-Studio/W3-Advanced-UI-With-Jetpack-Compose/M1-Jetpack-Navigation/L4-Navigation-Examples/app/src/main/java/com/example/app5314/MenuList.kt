package com.example.app5314

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController

@Composable
fun MenuListScreen(navController: NavHostController, orderNo: Int?) {
//this lesson demonstrate constant argument in destination

    Column (modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally){

        Text(text = "Menu List $orderNo", fontSize = 32.sp)
        Button(onClick = { navController.navigate(Home.route + "/10") },
            colors = ButtonDefaults.buttonColors(containerColor = Color(0xFFF4CE14))) {

            Text(text = "Order Take Away")

        }


    }

}