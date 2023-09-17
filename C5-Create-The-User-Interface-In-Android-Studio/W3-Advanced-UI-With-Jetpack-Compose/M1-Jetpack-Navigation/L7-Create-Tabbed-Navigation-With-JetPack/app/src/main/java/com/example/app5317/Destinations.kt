package com.example.app5317


import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Menu
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations {
    val route:String
    val icon: ImageVector
    val title: String
}


object Home: Destinations{
    override val route = "Home"
    override val icon = Icons.Filled.Home
    override  val title = "Home"

}


object  Location: Destinations {
    override val  route = "Location"
    override val icon = Icons.Filled.LocationOn
    override  val title = "Location"
}


object Menu: Destinations{
    override val route = "Menu"
    override val icon = Icons.Filled.Menu
    override val title = "Menu"
}