package com.syedsaifhossain.necterappproject.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.syedsaifhossain.necterappproject.screens.HomeScreen
import com.syedsaifhossain.necterappproject.screens.Onboarding
import com.syedsaifhossain.necterappproject.screens.SplashScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = NavigationGraph.SplashScreen.route) {

        composable(route = NavigationGraph.SplashScreen.route) {
            SplashScreen(navController = navController)
        }
        composable(route = NavigationGraph.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
        composable(route = NavigationGraph.OnboadingScreen.route) {

            Onboarding(navController = navController)
        }
    }
}


