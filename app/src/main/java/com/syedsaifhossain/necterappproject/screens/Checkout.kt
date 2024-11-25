package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.Image
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
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
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
fun CheckoutScreen(navController: NavController,modifier: Modifier=Modifier){
    Box(modifier.fillMaxSize()){

        Card(
            modifier
                .fillMaxSize()
                .padding(top = 250.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp),

            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFFCFCFC)
            )
        ){

            Box(modifier.fillMaxWidth()){
                Column(modifier.fillMaxWidth().padding(top = 50.dp)) {
                    FilterHeaderSection()
                    DividerAll()
                    FilterBodySection()
                    Spacer(Modifier.height(10.dp))
                    FilterContentSection()
                    Spacer(Modifier.height(50.dp))
                    FilterButtonSection()
                }
            }
        }


    }

}


@Composable
fun FilterHeaderSection(modifier: Modifier=Modifier){

    Row(modifier.fillMaxWidth().padding(horizontal = 20.dp),
        verticalAlignment = Alignment.CenterVertically,

        horizontalArrangement = Arrangement.SpaceBetween) {
                TextComponent(
                    modifier = modifier.padding(start = 8.dp),
                    text = "Checkout",
                    fontWeight = FontWeight(600),
                    fontSize = 24.sp,
                    color = Color(0xFF181725),
                    textAlign = TextAlign.Start
                )

                IconButton(onClick = {}) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = "Edit Icon")
                }
            }
    }

@Composable
fun FilterBodySection(modifier: Modifier=Modifier) {

    Spacer(modifier.height(10.dp))
    Row(
        modifier.fillMaxWidth().padding(start = 20.dp),

        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        TextComponent(
            modifier = modifier.weight(1f),
            text = "Delivery",
            fontWeight = FontWeight(600),
            fontSize = 18.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )


        Row(
            modifier.fillMaxWidth().weight(1f).padding(start = 20.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {

            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Select Method",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),

                textAlign = TextAlign.End
            )

            IconButton(onClick = {}, modifier) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Right arrow"
                )
            }
        }

    }

    DividerAll()

    Row(
        modifier.fillMaxWidth().padding(start = 20.dp),

        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        TextComponent(
            modifier = modifier.weight(1f),
            text = "Payment",
            fontWeight = FontWeight(600),
            fontSize = 18.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )


        Row(
            modifier.fillMaxWidth().weight(1f).padding(start = 20.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(painter = painterResource(id = R.drawable.card),

                contentDescription = "Payment icon",

                modifier.size(25.dp))

            IconButton(onClick = {}, modifier) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Right arrow"
                )
            }
        }

    }

    DividerAll()

    Row(
        modifier.fillMaxWidth().padding(start = 20.dp),

        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        TextComponent(
            modifier = modifier.weight(1f),
            text = "Promo Code",
            fontWeight = FontWeight(600),
            fontSize = 18.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )


        Row(
            modifier.fillMaxWidth().weight(1f).padding(start = 20.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {

            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Pick discount",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),

                textAlign = TextAlign.End
            )

            IconButton(onClick = {}, modifier) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Right arrow"
                )
            }
        }

    }

    DividerAll()

    Row(
        modifier.fillMaxWidth().padding(start = 20.dp),

        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically
    ) {

        TextComponent(
            modifier = modifier.weight(1f),
            text = "Total Cost",
            fontWeight = FontWeight(600),
            fontSize = 18.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Start
        )


        Row(
            modifier.fillMaxWidth().weight(1f).padding(start = 20.dp),
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically
        ) {
            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "$13.97",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF53b175),

                textAlign = TextAlign.End
            )

            IconButton(onClick = {}, modifier) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowRight,
                    contentDescription = "Right arrow"
                )
            }
        }

    }
    DividerAll()
}


@Composable

fun FilterContentSection(modifier: Modifier=Modifier){
Spacer(Modifier.height(20.dp))
    TextComponent(modifier = modifier.width(325.dp).padding(horizontal = 20.dp),
        text = "By pricing on order you agree to our Terms and Condition",
        fontWeight = FontWeight(600),
        fontSize = 18.sp,
        color = Color(0xFF7C7C7C),
        textAlign = TextAlign.Start
    )
}

@Composable
fun FilterButtonSection(modifier: Modifier=Modifier){
    ButtonComponent(modifier.fillMaxWidth().padding(15.dp, 10.dp),
        onClick = {},
        containerColor = Color(0xFF53b175),
        contentColor = Color(0xFFFCFCFC),
        text = "Place Order",
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        textAlign = TextAlign.Center,
        shape = RoundedCornerShape(15.dp)
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewCheckoutScreen(){

    CheckoutScreen(navController = rememberNavController())

}