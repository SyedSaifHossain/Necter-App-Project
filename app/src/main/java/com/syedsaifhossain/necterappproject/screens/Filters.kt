package com.syedsaifhossain.necterappproject.screens

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
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.syedsaifhossain.necterappproject.components.ButtonComponent
import com.syedsaifhossain.necterappproject.components.TextComponent

@Composable
fun FilterScreen(navController: NavController,modifier: Modifier=Modifier) {
    Box(modifier.fillMaxSize()) {

        TopSection()
        Card(
            modifier.fillMaxSize().padding(top = 120.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            shape = RoundedCornerShape(topStart = 25.dp, topEnd = 25.dp),
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFFF2F3F2)
            )
        ) {
            Box(modifier.fillMaxSize()) {
                Column(modifier.fillMaxWidth()) {
                    Spacer(modifier.height(20.dp))
                    CategoriesSection()
                    Spacer(modifier.height(20.dp))
                    BrandSection()
                    Spacer(modifier.height(100.dp))
                    BottomSection()
                }

            }
        }
    }

}

@Composable
fun TopSection(modifier: Modifier=Modifier){
    Row(
        modifier
            .fillMaxWidth()
            .padding(top = 50.dp),
        verticalAlignment = Alignment.CenterVertically) {
        IconButton(onClick = {}) {
            Icon(imageVector = Icons.Default.Close, contentDescription = "Close icon",
                modifier.size(30.dp))
        }
        Spacer(modifier.width(100.dp))
        TextComponent(
            modifier = modifier.padding(start = 8.dp),
            text = "Filters",
            fontWeight = FontWeight(600),
            fontSize = 28.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Center
        )

    }
}


@Composable
fun CategoriesSection(modifier: Modifier=Modifier){

    var checkState by remember { mutableStateOf(false) }
    Column(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)) {

        TextComponent(
            modifier = modifier.padding(start = 8.dp),
            text = "Categories",
            fontWeight = FontWeight(600),
            fontSize = 24.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Center
        )

        Spacer(modifier.height(10.dp))

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = true, onCheckedChange = {checkState=true},
                colors= CheckboxDefaults.colors(

                    Color(0xFF53b175)
                ),modifier=Modifier)
                TextComponent(
                    modifier = modifier.padding(start = 8.dp),
                    text = "Eggs",
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp,
                    color = Color(0xFF181725),
                    textAlign = TextAlign.Center
                )
            }

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {

            Checkbox(checked = false, onCheckedChange = {checkState=true},modifier=Modifier)
            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Noodles & Pasta",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Center
            )
        }

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = false, onCheckedChange = {checkState=true},modifier=Modifier)
            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Chips & Crisps",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Center
            )
        }

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = false, onCheckedChange = {checkState=true},modifier=Modifier)
            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Fast Food",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Center
            )
        }


        }
    }

@Composable
fun BrandSection(modifier: Modifier=Modifier){

    var brandCheckState by remember { mutableStateOf(false) }
    Column(
        modifier
            .fillMaxWidth()
            .padding(horizontal = 20.dp)) {

        TextComponent(
            modifier = modifier.padding(start = 8.dp),
            text = "Brand",
            fontWeight = FontWeight(600),
            fontSize = 24.sp,
            color = Color(0xFF181725),
            textAlign = TextAlign.Center
        )
        Spacer(modifier.height(10.dp))

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = false, onCheckedChange = {brandCheckState=true},modifier=Modifier)
            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Indivitual Collection",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Center
            )
        }

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = false, onCheckedChange = {brandCheckState=true},modifier=Modifier)
            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Cocola",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Center
            )
        }

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = false, onCheckedChange = {brandCheckState=true},modifier=Modifier)
            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Ifad",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Center
            )
        }

        Row(Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically) {
            Checkbox(checked = false, onCheckedChange = {brandCheckState=true},modifier=Modifier)
            TextComponent(
                modifier = modifier.padding(start = 8.dp),
                text = "Kazi Farmas",
                fontWeight = FontWeight(600),
                fontSize = 18.sp,
                color = Color(0xFF181725),
                textAlign = TextAlign.Center
            )
        }


    }

}

@Composable
fun BottomSection(modifier: Modifier=Modifier){
    ButtonComponent(modifier.fillMaxWidth()
        .padding(15.dp, 15.dp),
        onClick = {},
        containerColor = Color(0xFF53b175),
        contentColor = Color(0xFFFCFCFC),
        text = "Apply Filters",
        fontWeight = FontWeight.Medium,
        fontSize = 25.sp,
        textAlign = TextAlign.Center,
        shape = RoundedCornerShape(15.dp),
    )
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewFilterScreen(modifier: Modifier=Modifier){
    FilterScreen(navController = rememberNavController())
}