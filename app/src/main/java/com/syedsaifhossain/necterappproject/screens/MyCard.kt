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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
fun MyCardScreen(navController: NavController,modifier: Modifier=Modifier) {
        Column(
            modifier
                .fillMaxWidth()
                .padding(top = 50.dp)) {
            MyCardHeader()
            MyCardBody()

            MyCardButtonSection()

            Spacer(modifier.height(15.dp))

            BottomNavbar()
        }
    }


@Composable
fun MyCardHeader(modifier: Modifier=Modifier) {

    Column(modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally) {
        TextComponent(Modifier.fillMaxWidth(),
            text = "My Cart",
            fontSize = 28.sp,
            fontWeight = FontWeight(600),
            color = Color(0xFF181725),
            textAlign = TextAlign.Center
        )
        Spacer(modifier.height(20.dp))

        TopDivider()

    }
}


@Composable
fun MyCardBody(modifier: Modifier=Modifier) {
    Row(modifier.fillMaxWidth().padding(top = 15.dp), horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {
                TextComponent(
                    modifier = modifier.weight(9f).padding(start = 25.dp),
                    text = "Bell Pepper Red",
                    fontWeight = FontWeight(600),
                    fontSize = 20.sp,
                    color = Color(0xFF181725),
                    textAlign = TextAlign.Center
                )
                    Icon(imageVector = Icons.Default.Close, contentDescription = null,
                        tint = Color(0xFF7C7C7C),
                        modifier = modifier.weight(1f).padding(end = 20.dp).clickable {  }
                    )
            }
    Row(modifier.fillMaxWidth().padding(start = 20.dp)) {

        Image(painter = painterResource(id = R.drawable.bellpapper_icon),
            contentDescription = "",
            modifier.size(80.dp)

        )
        Column(modifier.fillMaxWidth()) {
            TextComponent(

                modifier = modifier.padding(start = 15.dp),
                text = "1kg, price",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Start
            )

            Row(
                modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {

                MyCartCountNumber()

                TextComponent(

                    modifier = modifier.padding(start = 5.dp, end = 20.dp, top = 5.dp),
                    text = "$4.99",

                    fontWeight = FontWeight(600),
                    fontSize = 20.sp,
                    color = Color(0xFF181725),

                    textAlign = TextAlign.Center
                )
            }
        }
    }

    Spacer(modifier.height(10.dp))
    MyCartDivider()
    Row(modifier.fillMaxWidth().padding(top = 15.dp), horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {
        TextComponent(
            modifier = modifier.weight(9f).padding(start = 25.dp),
            text = "Egg Chicken Red",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Center
        )
        Icon(imageVector = Icons.Default.Close, contentDescription = null,
            tint = Color(0xFF7C7C7C),
            modifier = modifier.weight(1f).padding(end = 20.dp).clickable {  }

        )

    }

    Row(modifier.fillMaxWidth().padding(start = 20.dp)) {
        Image(painter = painterResource(id = R.drawable.egg_red),
            contentDescription = "",
            modifier.size(80.dp)

        )
        Column(modifier.fillMaxWidth()) {
            TextComponent(

                modifier = modifier.padding(start = 15.dp),
                text = "4pcs, price",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Start
            )


            Row(
                modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {

                MyCartCountNumber()
                TextComponent(
                    modifier = modifier.padding(start = 5.dp, end = 20.dp, top = 5.dp),
                    text = "$1.99",
                    fontWeight = FontWeight(600),
                    fontSize = 20.sp,
                    color = Color(0xFF181725),
                    textAlign = TextAlign.Center
                )
            }
        }
    }

    Spacer(modifier.height(10.dp))
    MyCartDivider()

    Row(modifier.fillMaxWidth().padding(top = 15.dp), horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {
        TextComponent(
            modifier = modifier.weight(9f).padding(start = 25.dp),
            text = "Organic Bananas",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Center
        )

        Icon(imageVector = Icons.Default.Close, contentDescription = null,
            tint = Color(0xFF7C7C7C),
            modifier = modifier.weight(1f).padding(end = 20.dp).clickable {  }
        )
    }

    Row(modifier.fillMaxWidth().padding(start = 20.dp)) {

        Image(painter = painterResource(id = R.drawable.banana),
            contentDescription = "",
            modifier.size(80.dp)
        )

        Column(modifier.fillMaxWidth()) {
            TextComponent(

                modifier = modifier.padding(start = 15.dp),
                text = "12kg, price",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Start
            )


            Row(
                modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {

                MyCartCountNumber()

                TextComponent(
                    modifier = modifier.padding(start = 5.dp, end = 20.dp, top = 5.dp),
                    text = "$1.99",
                    fontWeight = FontWeight(600),
                    fontSize = 20.sp,
                    color = Color(0xFF181725),

                    textAlign = TextAlign.Center
                )
            }
        }
    }
    Spacer(modifier.height(10.dp))
    MyCartDivider()
    Row(modifier.fillMaxWidth().padding(top = 15.dp), horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically) {
        TextComponent(
            modifier = modifier.weight(9f).padding(start = 115.dp),
            text = "Ginger",
            fontWeight = FontWeight(600),
            fontSize = 20.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )

        Icon(imageVector = Icons.Default.Close, contentDescription = null,
            tint = Color(0xFF7C7C7C),
            modifier = modifier.weight(1f).padding(end = 20.dp).clickable {  }

        )

    }

    Row(modifier.fillMaxWidth().padding(start = 20.dp)) {
        Image(painter = painterResource(id = R.drawable.ginger),
            contentDescription = "",
            modifier.size(80.dp)

        )
        Column(modifier.fillMaxWidth()) {
            TextComponent(

                modifier = modifier.padding(start = 15.dp),
                text = "250gm, price",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Start
            )


            Row(
                modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                horizontalArrangement = Arrangement.SpaceBetween) {

                MyCartCountNumber()
                TextComponent(
                    modifier = modifier.padding(start = 5.dp, end = 20.dp, top = 5.dp),
                    text = "$2.99",
                    fontWeight = FontWeight(600),
                    fontSize = 20.sp,
                    color = Color(0xFF181725),

                    textAlign = TextAlign.Center
                )
            }
        }
    }
    Spacer(modifier.height(10.dp))
    MyCartDivider()
    Spacer(modifier.height(10.dp))
}

@Composable
fun MyCartCountNumber(modifier: Modifier=Modifier) {
    var count by remember { mutableStateOf(1) }

    Row(modifier.width(200.dp).padding(start = 15.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {

        Box(modifier = Modifier
                .border(BorderStroke(1.dp,Color(0xFF7C7C7C)), shape = RoundedCornerShape(15.dp))
                .height(40.dp)
                .width(50.dp)
        ) {
            TextComponent(
                modifier = Modifier.align(Alignment.Center),
                text = "-",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF030303),
                textAlign = TextAlign.Center
            )
        }
        Spacer(modifier.width(8.dp))
        TextComponent(
            modifier = Modifier,
            text = "${count}",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            color = Color(0xFF030303),
            textAlign = TextAlign.Start
        )


        Spacer(modifier.width(8.dp))

        Box(modifier = Modifier
            .border(BorderStroke(1.dp,Color(0xFF7C7C7C)), shape = RoundedCornerShape(15.dp))
            .height(40.dp)
            .width(50.dp)

        ){
            TextComponent(
                modifier = Modifier
                    .clickable { count++ }
                    .align(Alignment.Center),
                text = "+",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF030303),
                textAlign = TextAlign.Center
            )
        }

    }
}


@Composable
fun MyCardButtonSection(modifier: Modifier=Modifier){
    ButtonComponent(modifier.fillMaxWidth()
        .padding(20.dp,10.dp),
        onClick = {},
        containerColor = Color(0xFF53b175),
        contentColor = Color(0xFFFCFCFC),
        text = "Go to checkout",
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
        shape = RoundedCornerShape(15.dp)
    )
}

@Composable
fun TopDivider(modifier: Modifier=Modifier){
    Surface(modifier.fillMaxWidth().background(Color.Black).height(1.dp)
        .border(BorderStroke(width = 1.dp,color=Color.Gray))) {}
}

@Composable
fun MyCartDivider(modifier: Modifier=Modifier){
    Spacer(modifier.height(10.dp))
    Surface(modifier.fillMaxWidth().height(1.dp)
        .padding(horizontal = 25.dp)
        .border(BorderStroke(width = 1.dp,color=Color.Gray))) {}
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMyCardScreen(){
MyCardScreen(navController = rememberNavController())
}