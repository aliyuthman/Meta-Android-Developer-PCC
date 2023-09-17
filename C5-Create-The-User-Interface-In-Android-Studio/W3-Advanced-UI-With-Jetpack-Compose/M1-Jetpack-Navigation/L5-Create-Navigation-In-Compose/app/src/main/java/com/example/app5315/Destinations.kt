package com.example.app5315

interface Destinations {

    val route:String
}


object Home: Destinations {

    override val route = "com.example.app5315.Home"
}


object Menu: Destinations {

    override val route = "com.example.app5315.Menu"
}