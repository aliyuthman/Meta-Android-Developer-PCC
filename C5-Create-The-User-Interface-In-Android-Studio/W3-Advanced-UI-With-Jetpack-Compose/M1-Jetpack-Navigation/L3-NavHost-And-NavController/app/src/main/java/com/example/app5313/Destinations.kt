package com.example.app5313

interface Destinations { //this interface will be used to extend the destinations object for route

    val route:String
}


object Dashboard:Destinations{//object of the dashboard screen extending Destinations interface

    override val route = "Dashboard"

}

//in this case using object keyword to create an object result into anonymous object without an actual class

object Detail:Destinations{//object of the Detail screen extending Destinations interface

    override val route = "Detail"

}