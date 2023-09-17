package com.example.app5316

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

interface Destinations {

    val route: String
    val icon: ImageVector
    val title: String
}


object Home: Destinations{
    override val route = "Home"
    override val icon = Icons.Filled.Home
    override val title = "Home"

}


object Settings: Destinations{
    override val route = "Settings"
    override val icon = Icons.Filled.Settings
    override val title = "Settings"

}


object Profile: Destinations{
    override val route = "Profile"
    override val icon = Icons.Filled.Person
    override val title = "Profile"

}