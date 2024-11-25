package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.syedsaifhossain.necterappproject.R
import com.syedsaifhossain.necterappproject.components.ButtonComponent
import com.syedsaifhossain.necterappproject.components.TextComponent

@Composable
fun ErrorScreen(navController: NavController,modifier: Modifier=Modifier) {
        Card(
            modifier.fillMaxSize().padding(start = 20.dp, end = 20.dp,top=150.dp, bottom = 100.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            shape = RoundedCornerShape(25.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFCFCFC)
            ),
        ) {
            Box(modifier.fillMaxSize()) {
                ErrorScreenContainer()

            }
        }
    }


@Composable

fun ErrorScreenContainer(modifier: Modifier=Modifier){
    Icon(imageVector = Icons.Default.Close, contentDescription = null,
        modifier.padding(20.dp))
    Column(modifier.fillMaxWidth().padding(top = 55.dp),
        verticalArrangement = Arrangement.Center,

        horizontalAlignment = Alignment.CenterHorizontally) {
        Image(painter = painterResource(id = R.drawable.image_13),
            contentDescription = null,
            modifier.size(200.dp))
            Spacer(modifier.height(30.dp))
        TextComponent(Modifier.fillMaxWidth(),
            text = "Oops! Order Failed",
            fontSize = 30.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF181725),
            textAlign = TextAlign.Center
        )
        Spacer(modifier.height(20.dp))

        TextComponent(Modifier.fillMaxWidth(),
            text = "something went tembly wrong",
            fontSize = 16.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF7C7C7C),
            textAlign = TextAlign.Center
        )

        Spacer(modifier.height(70.dp))
        ErrorBottomSection()
        Spacer(modifier.height(10.dp))
        TextComponent(Modifier.fillMaxWidth(),
            text = "Back to home",
            fontSize = 18.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF7C7C7C),
            textAlign = TextAlign.Center
        )
    }
}

@Composable
fun ErrorBottomSection(modifier: Modifier=Modifier){
    ButtonComponent(modifier.fillMaxWidth()
        .padding(25.dp, 15.dp),
        onClick = {},
        containerColor = Color(0xFF53b175),
        contentColor = Color(0xFFFCFCFC),
        text = "Please Try Again",
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
        shape = RoundedCornerShape(15.dp),
    )

}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewErrorScreen(){
    ErrorScreen(navController= rememberNavController())
}