package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.syedsaifhossain.necterappproject.R
import com.syedsaifhossain.necterappproject.components.ButtonComponent
import com.syedsaifhossain.necterappproject.components.TextComponent

@Composable
fun Onboarding(modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.welcomebackground),
            contentDescription = "Background image",
            contentScale = ContentScale.Crop,
            modifier = modifier.fillMaxSize()
        )

        Column(
            modifier = modifier
                .fillMaxSize()
                .padding(top=380.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.group),
                contentDescription = "",
                modifier.size(60.dp,60.dp),
            )

            Spacer(modifier = modifier.height(15.dp))
            TextComponent(Modifier.fillMaxWidth(),
                text = "Welcome",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center)
            Spacer(modifier = modifier.height(8.dp))

            TextComponent(Modifier.fillMaxWidth(),
                text = "to our store",
                fontSize = 40.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                textAlign = TextAlign.Center)
            Spacer(modifier = modifier.height(8.dp))
            TextComponent(Modifier.fillMaxWidth(),
                text = "Get your groceries in as fast as one hour",
                fontSize = 20.sp,
                fontWeight = FontWeight.Normal,
                color = Color.White,
                textAlign = TextAlign.Center)
            Spacer(modifier = modifier.height(30.dp))
            ButtonComponent(
                modifier = Modifier.fillMaxWidth()
                    .padding(30.dp,15.dp),
                onClick = {},
                containerColor = Color(0xFF53b175),
                contentColor = Color.White,
                text = "Get Started",
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                shape = RoundedCornerShape(15.dp)
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun OnboardingPreview() {
    Onboarding()
}