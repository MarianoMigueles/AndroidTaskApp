package com.example.taskaplication

import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController

open class MainNavigator(protected  val navController: NavController) {

    open fun navigateTo(destination: String) {
        navController.navigate(destination)
    }

    open fun navigateTo(taskId: Int) {
        navController.navigate("task_details/$taskId")
    }
}