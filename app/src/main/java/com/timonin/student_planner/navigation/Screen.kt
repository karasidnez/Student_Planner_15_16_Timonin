package com.timonin.student_planner.navigation

sealed class Screen(val route: String){
    object Home : Screen("home")
    object Profile : Screen("profile")
    object Settings : Screen("settings")
    object Details : Screen("details/{subjectId}"){
        fun createRoute(subjectId: String) = "details/$subjectId"
    }

}