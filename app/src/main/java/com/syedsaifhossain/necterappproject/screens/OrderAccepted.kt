package com.syedsaifhossain.necterappproject.screens

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
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.syedsaifhossain.necterappproject.R
import com.syedsaifhossain.necterappproject.components.ButtonComponent
import com.syedsaifhossain.necterappproject.components.TextComponent


@Composable
fun OrderAcceptedScreen(navController: NavController,modifier: Modifier=Modifier){
    Box(modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.bacgroundopacity),
            contentDescription = null,
            modifier.fillMaxWidth(),
            contentScale = ContentScale.Crop,
        )

        Column(modifier.fillMaxSize().padding(top = 70.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.success),
                contentDescription = null,
                modifier.size(200.dp,200.dp).padding(end = 20.dp).align(Alignment.CenterHorizontally)
            )

            Spacer(modifier.height(50.dp))
            TextComponent(
                modifier = modifier.padding(start = 8.dp).width(300.dp),
                text = "Your order has been accepted",
                fontWeight = FontWeight(600),
                fontSize = 28.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Center
            )

            Spacer(modifier.height(20.dp))
            TextComponent(
                modifier = modifier.padding(start = 8.dp).width(320.dp),
                text = "Your item icon has been place and is on it's way to belong processed",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Center
            )

            Spacer(modifier.height(210.dp))
            ButtonComponent(modifier.fillMaxWidth()
                .padding(20.dp, 15.dp),
                onClick = {},
                containerColor = Color(0xFF53b175),
                contentColor = Color(0xFFFFF9FF),

                text = "Track Order",
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                shape = RoundedCornerShape(15.dp),
                icon={ }
            )

            Spacer(modifier.height(10.dp))
            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Back to home",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Start
            )
        }

    }

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewOrderAcceptedScreen(){
    OrderAcceptedScreen(navController = rememberNavController())
}