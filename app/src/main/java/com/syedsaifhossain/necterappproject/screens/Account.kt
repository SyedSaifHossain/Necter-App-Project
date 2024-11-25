package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
fun Account(navController: NavController,modifier: Modifier=Modifier){
    Box(modifier.fillMaxSize()){

        Column(modifier.fillMaxWidth().padding(top = 70.dp)) {
            HeaderSection()
            DividerAll()
            ContentSection()
            Spacer(Modifier.height(10.dp))
            ButtonSection()
            Spacer(Modifier.height(10.dp))

            BottomNavbar()
        }

    }

}

@Composable
fun HeaderSection(modifier: Modifier=Modifier){

    Row(modifier.fillMaxWidth().padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {

        Column(modifier.weight(3f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {
            Image(painter = painterResource(id = R.drawable.profile),
                contentDescription = "Profile",

                modifier.size(70.dp))
        }


        Column(modifier.weight(7f)) {
            Row(modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.Start,
                verticalAlignment = Alignment.CenterVertically){

                TextComponent(
                    modifier = modifier.padding(start = 3.dp),
                    text = "Afsar Hossen",
                    fontWeight = FontWeight(600),
                    fontSize = 20.sp,
                    color = Color(0xFF171825),
                    textAlign = TextAlign.Start
                )
                    Icon(imageVector = Icons.Default.Edit, contentDescription = "Edit Icon",
                        tint = Color(0xFF53b175),
                        modifier=Modifier.padding(start = 5.dp).clickable {  })

            }

            TextComponent(
                modifier = modifier.padding(start = 3.dp, bottom = 15.dp),
                text = "imshuvo97@gmail.com",
                fontWeight = FontWeight(600),
                fontSize = 16.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Start
            )

        }
    }

}

@Composable
fun DividerAll(modifier: Modifier=Modifier){
    Spacer(modifier.height(10.dp))
    Surface(modifier.fillMaxWidth().height(1.dp).background(color=Color.Black)
        .border(BorderStroke(width = 1.dp,color=Color.Gray))) {}
}

@Composable
fun ContentSection(modifier: Modifier=Modifier){

    Spacer(modifier.height(10.dp))

    Row(modifier.fillMaxWidth().padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically){

        Icon(painter = painterResource(id = R.drawable.orders_icon), contentDescription = "Edit Icon",
            modifier.weight(1f).size(20.dp)
        )
        TextComponent(
            modifier = modifier.padding(start = 8.dp).weight(8f),
            text = "Order",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )

        IconButton(onClick = {},modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "Edit Icon")
        }

    }
    DividerAll()
    Row(modifier.fillMaxWidth().padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically){

        Icon(painter = painterResource(id = R.drawable.details_icon), contentDescription = "Edit Icon",
            modifier.weight(1f).size(18.dp)
        )
        TextComponent(
            modifier = modifier.padding(start = 8.dp).weight(8f),
            text = "My Details",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )

        IconButton(onClick = {},modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "Edit Icon")
        }

    }

    DividerAll()

    Row(modifier.fillMaxWidth().padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically){

        Icon(painter = painterResource(id = R.drawable.delivery_address), contentDescription = "Edit Icon",
            modifier.weight(1f).size(20.dp)
        )
        TextComponent(
            modifier = modifier.padding(start = 8.dp).weight(8f),
            text = "Delivery Address",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )

        IconButton(onClick = {},modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "Edit Icon")
        }

    }

    DividerAll()

    Row(modifier.fillMaxWidth().padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically){

        Icon(painter = painterResource(id = R.drawable.payment), contentDescription = "Edit Icon",
            modifier.weight(1f).size(18.dp)
        )
        TextComponent(
            modifier = modifier.padding(start = 8.dp).weight(8f),
            text = "Payment Method",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )

        IconButton(onClick = {},modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "Edit Icon")
        }

    }
    DividerAll()

    Row(modifier.fillMaxWidth().padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically){
        Icon(painter = painterResource(id = R.drawable.promo_cord_icon), contentDescription = "Edit Icon",
            modifier.weight(1f).size(20.dp)
        )
        TextComponent(
            modifier = modifier.padding(start = 8.dp).weight(8f),
            text = "Promo Code",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )

        IconButton(onClick = {},modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "Edit Icon")
        }

    }
    DividerAll()

    Row(modifier.fillMaxWidth().padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically){
        Icon(painter = painterResource(id = R.drawable.notification), contentDescription = "Edit Icon",
            modifier.weight(1f).size(20.dp)
        )
        TextComponent(
            modifier = modifier.padding(start = 8.dp).weight(8f),
            text = "Notification",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )

        IconButton(onClick = {},modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "Edit Icon")
        }

    }

    DividerAll()

    Row(modifier.fillMaxWidth().padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically){

        Icon(painter = painterResource(id = R.drawable.help_icon), contentDescription = "Edit Icon",
            modifier.weight(1f).size(20.dp)
        )
        TextComponent(
            modifier = modifier.padding(start = 8.dp).weight(8f),
            text = "Help",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )

        IconButton(onClick = {},modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "Edit Icon")
        }

    }
    DividerAll()

    Row(modifier.fillMaxWidth().padding(horizontal = 20.dp),
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically){
        Icon(painter = painterResource(id = R.drawable.about_icon), contentDescription = "Edit Icon",
            modifier.weight(1f).size(20.dp)
        )
        TextComponent(
            modifier = modifier.padding(start = 8.dp).weight(8f),
            text = "About",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )

        IconButton(onClick = {},modifier.weight(1f)) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "Edit Icon")
        }
    }

    DividerAll()
}

@Composable
fun ButtonSection(modifier: Modifier=Modifier){
    ButtonComponent(modifier.fillMaxWidth()
        .padding(20.dp,10.dp),
        onClick = {},
        containerColor = Color(0xFFCEC9D9),
        contentColor = Color(0xFF53b175),
        text = "Log Out",
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        textAlign = TextAlign.Start,
        shape = RoundedCornerShape(15.dp),
        icon={
            Icon(imageVector = Icons.Filled.ExitToApp,
                contentDescription = "Logout",
                modifier.padding(end = 70.dp).size(30.dp,30.dp))
        }

    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun AccountScreen(){
    Account(navController = rememberNavController())
}