package com.magc.taller2.ui.navigation

sealed class ScreenRoute (var route: String){
    object Home: ScreenRoute("home")
    object AddFamily: ScreenRoute("AddFamily")
    object AddPerson: ScreenRoute("AddPerson")
    object PersonDetails: ScreenRoute("PersonDetails")
    object FamilyDetails: ScreenRoute("FamilyDetails")
    object Familys: ScreenRoute("Familys")
    object Persons: ScreenRoute("Persons")


}