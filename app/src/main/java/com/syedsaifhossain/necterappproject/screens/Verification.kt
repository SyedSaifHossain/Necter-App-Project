package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
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
import com.syedsaifhossain.necterappproject.components.TextComponent
import com.syedsaifhossain.necterappproject.components.TextFieldComponent

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun VerificationScreen(navController: NavController,modifier: Modifier=Modifier) {

    Box(modifier=modifier.fillMaxSize()) {

        Image(
            painter = painterResource(id = R.drawable.bacgroundopacity),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        var number by remember { mutableStateOf("") }
        Column(
            modifier.fillMaxSize()
        ) {
            Spacer(
                modifier = modifier.height(20.dp)

                    .padding(start = 30.dp)
            )

            IconButton(onClick = {},Modifier.padding(start = 10.dp)) {
                Icon(
                    imageVector = Icons.Default.KeyboardArrowLeft,
                    contentDescription = "",
                    modifier.size(30.dp)
                )
            }

            Spacer(modifier = modifier.height(100.dp))
            TextComponent(
                Modifier
                    .width(330.dp)
                    .height(30.dp)
                    .padding(start = 20.dp),
                text = "Enter your 4-digit code",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF030303),
                textAlign = TextAlign.Start
            )

            Spacer(modifier = modifier.height(15.dp))
            TextFieldComponent(
                modifier
                    .fillMaxWidth(),
                value = number,
                placeholder = "+880",
                label = "Code",
                onValueChange = { number = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Phone
                ),
                color = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Gray
                )
            )

            Spacer(modifier = modifier.height(150.dp))


            Row(modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically){
                Text(text = "Resend Code",
                    color = Color(0xFF53b175),
                    fontWeight = FontWeight(600),
                    fontSize = 18.sp,

                    modifier = Modifier.padding(start = 30.dp))
                IconButton(onClick = {},
                    modifier.padding(end = 24.dp)) {
                    Image(
                        painter = painterResource(R.drawable.rounded_right_arrow),
                        contentDescription = "",
                        modifier.fillMaxWidth().size(40.dp)
                    )
                }
            }

        }
    }
}

@Preview(showBackground = true)
@Composable
fun VerificationScreenPreview() {

    VerificationScreen(navController = rememberNavController())
}