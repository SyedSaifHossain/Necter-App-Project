package com.syedsaifhossain.necterappproject.screens

import android.graphics.drawable.Icon
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
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
import com.syedsaifhossain.necterappproject.components.TextComponent

@Composable
fun CardDesign(navController: NavController,modifier: Modifier=Modifier) {
        Card(
            modifier.width(180.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 10.dp),
            shape = RoundedCornerShape(25.dp)
        ) {

            Box(modifier.fillMaxWidth()) {
                Column(modifier.fillMaxWidth()) {
                    Spacer(Modifier.height(8.dp))
                    Image(
                        painter = painterResource(id = R.drawable.fruitveg),
                        contentDescription = "",
                        modifier.size(70.dp).align(Alignment.CenterHorizontally)
                    )

                    Spacer(Modifier.height(8.dp))
                    TextComponent(
                        modifier = modifier.padding(start = 8.dp),
                        text = "Organic Fruit",
                        fontWeight = FontWeight(600),
                        fontSize = 18.sp,
                        color = Color(0xFF181725),
                        textAlign = TextAlign.Start
                    )

                    Spacer(Modifier.height(8.dp))
                    TextComponent(
                        modifier = modifier.padding(start = 8.dp),
                        text = "7 Pcs, Pricing",
                        fontWeight = FontWeight(600),
                        fontSize = 16.sp,
                        color = Color(0xFF181725),
                        textAlign = TextAlign.Start
                    )

                    Spacer(Modifier.height(8.dp))
                    Row(
                        modifier.fillMaxWidth().padding(horizontal = 8.dp),
                        verticalAlignment = Alignment.CenterVertically,
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        TextComponent(
                            modifier = modifier,
                            text = "$4.99",
                            fontWeight = FontWeight(600),
                            fontSize = 16.sp,
                            color = Color(0xFF181725),
                            textAlign = TextAlign.Start
                        )


                        FloatingActionButton(

                            modifier = Modifier.size(50.dp,50.dp),

                            onClick = {},
                            containerColor = Color(0xFF53b175),
                            contentColor = Color(0xFFfcfcfc)

                        ) {
                            Icon(imageVector = Icons.Default.Add, contentDescription = "")
                        }
                    }
                    Spacer(Modifier.height(10.dp))
                }
            }
        }
}

@Preview(showBackground = true)
@Composable
fun CardDesignPriview(){
    CardDesign(navController = rememberNavController())
}