package com.example.app3112

interface Destinations {//this interface - will be use to extends destination object

val route:String //route is equivalent to defining ID for a destination

}

//object key word create an object without prior class definition

object Home:Destinations{
    override val route = "Home"
}

object MenuList:Destinations{
    override val route = "MenuList"
}