package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
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
import com.syedsaifhossain.necterappproject.components.TextFieldComponent
import com.syedsaifhossain.necterappproject.navigation.NavigationGraph

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun LogIn(navController: NavController,modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.mask_group),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Column(
            modifier
                .fillMaxSize()
                .padding(top = 370.dp)
        ) {
            TextComponent(
                Modifier.fillMaxWidth()
                    .padding(start = 20.dp),
                text = "Login",
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF181725),
                textAlign = TextAlign.Start
            )
            Spacer(modifier = modifier.height(20.dp))
            TextComponent(
                Modifier.fillMaxWidth().padding(start = 20.dp),
                text = "Enter your email and password",
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF181725),
                textAlign = TextAlign.Start
            )
            Spacer(modifier = modifier.height(20.dp))
            TextFieldComponent(
                modifier
                    .fillMaxWidth()
                    .padding(15.dp, 0.dp),
                value = email,
                placeholder = "imshuvo97@gmail.com",
                label = "Email",
                onValueChange = { email = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                color = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Gray
                )
            )

            Spacer(modifier = modifier.height(20.dp))
            TextFieldComponent(
                modifier
                    .fillMaxWidth()
                    .padding(15.dp, 0.dp),
                value = password,
                placeholder = "",
                label = "Password",
                onValueChange = { password = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password
                ),
                trailingIcon = {

                    Icon(painter = painterResource(R.drawable.hiddenicon),

                        contentDescription = "Hidden icon",
                        modifier.size(25.dp))
                },
                color = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Gray
                )
            )
            Spacer(modifier = modifier.height(20.dp))
            TextComponent(
                Modifier.fillMaxWidth().clickable { navController.navigate(NavigationGraph.NumberScreen.route) }.padding(end=15.dp),
                text = "Forget password?",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF53b175),
                textAlign = TextAlign.End
            )
            Spacer(modifier = modifier.height(30.dp))
            ButtonComponent(modifier.fillMaxWidth()
                .padding(15.dp, 15.dp),
                onClick = {navController.navigate(NavigationGraph.HomeScreen.route)},
                containerColor = Color(0xFF53b175),
                contentColor = Color(0xFFFCFCFC),
                text = "Login",
                fontWeight = FontWeight.Medium,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                shape = RoundedCornerShape(15.dp),
                icon=null
            )

            Spacer(modifier = modifier.height(10.dp))
            TextComponent(
                Modifier.fillMaxWidth().clickable { navController.navigate(NavigationGraph.SignUp.route) }
                    .padding(end=15.dp),
                text = "Don't have anccount? Singup",
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF53b175),
                textAlign = TextAlign.Center
            )

        }
    }
}

@Preview(showBackground = true)
@Composable
fun LogInPreview(modifier: Modifier = Modifier) {
    LogIn(navController = rememberNavController())
}