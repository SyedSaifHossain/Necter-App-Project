package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.syedsaifhossain.necterappproject.R
import com.syedsaifhossain.necterappproject.components.ButtonComponent
import com.syedsaifhossain.necterappproject.components.TextComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ExploreScreen(navController: NavController,modifier: Modifier=Modifier) {

    Box(modifier=modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.bacgroundopacity),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        var number by remember { mutableStateOf("") }

        var zone by remember{ mutableStateOf("") }
        Column(
            modifier.fillMaxSize()
        ) {
            Spacer(modifier=modifier.height(30.dp))
            IconButton(onClick = {},Modifier.padding(start = 10.dp)) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "",

                    modifier.size(50.dp)
                )
            }
            Spacer(modifier=modifier.height(30.dp))
            Image(
                painter = painterResource(id = R.drawable.illustration),
                contentDescription = null,
                modifier = modifier
                    .size(170.dp, 170.dp)
                    .align(Alignment.CenterHorizontally)
            )

            Spacer(modifier = modifier.height(20.dp))
            TextComponent(
                Modifier
                    .fillMaxWidth()
                    .height(30.dp),
                text = "Select your location",
                fontSize = 26.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF030303),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = modifier.height(10.dp))
            TextComponent(
                Modifier
                    .fillMaxWidth()
                    .height(30.dp),
                text = "Switch or your location to stay in tune with",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF7C7C7C),
                textAlign = TextAlign.Center
            )

            TextComponent(
                Modifier.fillMaxWidth(),
                text = "What's happening in your area",
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF7C7C7C),

                textAlign = TextAlign.Center
            )

            Spacer(modifier = modifier.height(130.dp))
            TextField(value = zone, onValueChange = {zone=it},
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp),
                trailingIcon = {
                    IconButton(onClick = {},Modifier.padding(start = 10.dp)) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "",
                            modifier.size(25.dp)
                        )
                    }
                },
                placeholder= { Text(text = "Banasree") },
                label={ Text(text="Your zone") },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text
                ),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Gray
                )
            )
            Spacer(modifier = modifier.height(30.dp))
            TextField(value = zone, onValueChange = {zone=it},
                modifier
                    .fillMaxWidth()
                    .padding(horizontal = 15.dp),
                trailingIcon = {
                    IconButton(onClick = {},Modifier.padding(start = 10.dp)) {
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowDown,
                            contentDescription = "",
                            modifier.size(25.dp)
                        )
                    }
                },
                placeholder= { Text(text = "Type your area") },
                label={ Text(text="Your area") },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text
                ),
                colors = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Gray
                )
            )
            Spacer(modifier = modifier.height(30.dp))

            ButtonComponent(modifier.fillMaxWidth()
                .padding(15.dp, 15.dp),
                onClick = {},
                containerColor = Color(0xFF53b175),
                contentColor = Color(0xFFFFF9FF),
                text = "Submit",
                fontWeight = FontWeight.Medium,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                shape = RoundedCornerShape(15.dp),
                icon={ }
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun ExploreScreenPreview() {
    ExploreScreen(navController = rememberNavController())
}