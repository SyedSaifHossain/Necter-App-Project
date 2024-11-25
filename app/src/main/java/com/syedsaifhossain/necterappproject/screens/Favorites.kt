package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
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
fun FavoriteScreen(navController: NavController,modifier: Modifier=Modifier){
    Box(modifier.fillMaxSize()){

        Column(modifier.fillMaxWidth().padding(top = 50.dp),
            verticalArrangement = Arrangement.Center,

            horizontalAlignment = Alignment.CenterHorizontally) {
            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Favorurite",
                fontWeight = FontWeight(600),
                fontSize = 28.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Center
            )
            Spacer(modifier.height(15.dp))
            FavoriteDividerAll()
            Spacer(modifier.height(15.dp))
            SpriteDetail()
            FavoriteDividerAll()
            Spacer(modifier.height(15.dp))
            DietCokeDetail()
            FavoriteDividerAll()
            Spacer(modifier.height(15.dp))
            JuiceDetail()
            FavoriteDividerAll()
            Spacer(modifier.height(15.dp))
            CokeDetail()
            FavoriteDividerAll()
            Spacer(modifier.height(15.dp))
            PepsiDetail()
            FavoriteDividerAll()

            Spacer(modifier.height(70.dp))
            FavoriteButtonSection()
            Spacer(modifier.height(20.dp))
            BottomNavbar()
        }

    }

}

@Composable

fun SpriteDetail(modifier: Modifier=Modifier) {

    Row(modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.sprite_can),
                contentDescription = "Sprite",
                modifier.size(50.dp).padding(start = 20.dp))

        Column(modifier.padding(start = 15.dp,top=10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

                TextComponent(
                    modifier = modifier.padding(start = 8.dp),
                    text = "Sprite Can",
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp,
                    color = Color(0xFF181725),
                    textAlign = TextAlign.Start
                )
            Spacer(modifier.height(5.dp))
            TextComponent(
                modifier = modifier.padding(start = 15.dp, bottom = 10.dp),
                text = "325ml, Price",
                fontWeight = FontWeight(600),
                fontSize = 16.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Start
            )

        }

        Row(modifier.fillMaxWidth().padding(start = 110.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){

            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "$1.50",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),

                textAlign = TextAlign.Start
            )
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
            }
        }
    }

}

@Composable
fun DietCokeDetail(modifier: Modifier=Modifier) {

    Row(modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.dietcoke_can),
            contentDescription = "Dietcoke",
            modifier.size(50.dp).padding(start = 20.dp))

        Column(modifier.padding(start = 15.dp,top=10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            TextComponent(
                modifier = modifier,
                text = "Diet Coke",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Start
            )
            Spacer(modifier.height(5.dp))
            TextComponent(
                modifier = modifier.padding(start = 15.dp, bottom = 10.dp),
                text = "355ml, Price",
                fontWeight = FontWeight(600),
                fontSize = 16.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Start
            )

        }

        Row(modifier.fillMaxWidth().padding(start = 110.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){

            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "$1.99",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),

                textAlign = TextAlign.Start
            )
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
            }
        }
    }

}

@Composable

fun JuiceDetail(modifier: Modifier=Modifier) {

    Row(modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.apple_juice),
            contentDescription = "Apple juice bottole",
            modifier.size(50.dp).padding(start = 20.dp),
            contentScale = ContentScale.Crop)


        Column(modifier.padding(start = 15.dp,top=10.dp).width(180.dp),
            verticalArrangement = Arrangement.Center) {

            TextComponent(
                modifier = modifier.padding(start = 15.dp),
                text = "Apple & Graph Juice",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Start
            )
            Spacer(modifier.height(5.dp))
            TextComponent(

                modifier = modifier.padding(start = 15.dp, bottom = 10.dp),
                text = "2L, Price",
                fontWeight = FontWeight(600),
                fontSize = 16.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Start
            )

        }

        Row(modifier.fillMaxWidth().padding(start = 30.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){

            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "$15.50",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),

                textAlign = TextAlign.Start
            )
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
            }
        }
    }
}

@Composable
fun CokeDetail(modifier: Modifier=Modifier) {

    Row(modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.cocacola_can),
            contentDescription = "Coca cola can",
            modifier.size(50.dp).padding(start = 20.dp))

        Column(modifier.padding(start = 15.dp,top=10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            TextComponent(
                modifier = modifier,
                text = "Coke Can",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Start
            )
            Spacer(modifier.height(5.dp))
            TextComponent(
                modifier = modifier.padding(start = 15.dp, bottom = 10.dp),
                text = "325ml, Price",
                fontWeight = FontWeight(600),
                fontSize = 16.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Start
            )

        }

        Row(modifier.fillMaxWidth().padding(start = 110.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){

            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "$4.99",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Start
            )
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
            }
        }
    }
}


@Composable
fun PepsiDetail(modifier: Modifier=Modifier) {
    Row(modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center) {
        Image(painter = painterResource(id = R.drawable.pepsi),
            contentDescription = "Pepsi",
            modifier.size(50.dp).padding(start = 20.dp))

        Column(modifier.padding(start = 15.dp,top=10.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally) {

            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Pepsi Can",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Start
            )
            Spacer(modifier.height(5.dp))
            TextComponent(
                modifier = modifier.padding(start = 15.dp, bottom = 10.dp),
                text = "350ml, Price",
                fontWeight = FontWeight(600),
                fontSize = 16.sp,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Start
            )

        }

        Row(modifier.fillMaxWidth().padding(start = 110.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically){

            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "$4.99",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),

                textAlign = TextAlign.Start
            )
            IconButton(onClick = {}) {
                Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
            }
        }
    }

}
@Composable
fun FavoriteDividerAll(modifier: Modifier=Modifier){
    Spacer(modifier.height(10.dp))
    Surface(modifier.fillMaxWidth().height(1.dp).background(color=Color.Black)
        .border(BorderStroke(width = 1.dp,color=Color.Gray))) {}
}


@Composable
fun FavoriteButtonSection(modifier: Modifier=Modifier){
    ButtonComponent(modifier.fillMaxWidth()
        .padding(20.dp,10.dp),
        onClick = {},
        containerColor = Color(0xFF53b175),
        contentColor = Color(0xFFFCFCFC),
        text = "Add All To Card",
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        textAlign = TextAlign.Center,
        shape = RoundedCornerShape(15.dp)
    )
}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewFavoriteScreen(){
    FavoriteScreen(navController = rememberNavController())
}