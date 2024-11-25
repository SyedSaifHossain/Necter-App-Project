package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.syedsaifhossain.necterappproject.R
import com.syedsaifhossain.necterappproject.navigation.NavigationGraph
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(navController: NavController,modifier:Modifier=Modifier){
    LaunchedEffect(true) {
        delay(3000)
        navController.navigate(NavigationGraph.OnboadingScreen.route)
    }
    Box(
        modifier = modifier.fillMaxSize()
            .background(Color(0xFF53b175)),
        contentAlignment = Alignment.Center
    )
    {
        Image(
            painter = painterResource(id = R.drawable.splashscreenicon),
            contentDescription = "",
            modifier.fillMaxWidth().size(70.dp)
            )
    }
}


@Preview(showBackground = true)
@Composable
private fun SplashScreenPreview(){
    SplashScreen(navController = rememberNavController())
}