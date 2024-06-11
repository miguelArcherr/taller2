package com.magc.taller2.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.magc.taller2.MainViewModel
import com.magc.taller2.ui.screen.AddFamily
import com.magc.taller2.ui.screen.AddPerson
import com.magc.taller2.ui.screen.FamilyDetails
import com.magc.taller2.ui.screen.FamilysScreen
import com.magc.taller2.ui.screen.HomeScreen
import com.magc.taller2.ui.screen.PersonDetails
import com.magc.taller2.ui.screen.PersonsScreen

data class Item(val nombre: String, val apelidos: String)
val personas = listOf(
    Item("josesito", "ramossito"),
    Item("ramonito", "ramossito"),
    Item("manuel", "lopez"),
    Item("maria", "antonia"),
    Item("angela", "martinez"),
    // ... más items
)
@Composable
fun Navigation(
    Viewmodel : MainViewModel
){
    val navController= rememberNavController()

    NavHost(navController = navController,
        startDestination = ScreenRoute.Home.route
    ) {
        composable(route = ScreenRoute.Home.route){
            HomeScreen(Viewmodel, navController)
        }
        composable(route = ScreenRoute.AddFamily.route){
            AddFamily(Viewmodel, navController, personas)
        }
        composable(route = ScreenRoute.AddPerson.route){
            AddPerson(Viewmodel, navController)
        }
        composable(route = ScreenRoute.FamilyDetails.route){
            FamilyDetails(Viewmodel, navController)
        }
        composable(route = ScreenRoute.Familys.route){
            FamilysScreen(Viewmodel, navController)
        }
        composable(route = ScreenRoute.PersonDetails.route){
            PersonDetails(Viewmodel, navController)
        }
        composable(route = ScreenRoute.Persons.route){
            PersonsScreen(Viewmodel, navController)
        }

    }
}
