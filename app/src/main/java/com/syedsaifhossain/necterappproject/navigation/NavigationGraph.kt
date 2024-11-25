package com.syedsaifhossain.necterappproject.navigation

sealed class NavigationGraph(val route : String) {

    object SplashScreen : NavigationGraph(route = "splashScreen")
    object OnboadingScreen : NavigationGraph(route = "onboading")
    object HomeScreen : NavigationGraph(route = "home")
    object SingIn : NavigationGraph(route = "singin")
    object NumberScreen : NavigationGraph(route = "numberScreen")
    object Verification : NavigationGraph(route = "verification")
    object Location : NavigationGraph(route = "location")
    object OrderScreen : NavigationGraph(route = "order")
    object Login : NavigationGraph(route = "login")
    object SignUp : NavigationGraph(route = "signup")
    object Product : NavigationGraph(route = "product")
    object Explore : NavigationGraph(route = "explore")
    object Search : NavigationGraph(route = "search")
    object ErrorScreen : NavigationGraph(route = "error")
    object Beverage : NavigationGraph(route = "beverage")
    object Filter : NavigationGraph(route = "filter")
    object MyCard : NavigationGraph(route = "myCard")
    object Checkout : NavigationGraph(route = "checkout")
    object Account : NavigationGraph(route = "account")
    object Favorite : NavigationGraph(route = "favorite")
}