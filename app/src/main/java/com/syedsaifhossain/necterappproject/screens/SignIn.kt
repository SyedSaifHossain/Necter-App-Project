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
import androidx.compose.foundation.layout.width
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
fun SignIn(navController: NavController,modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.mask_group),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        var number by remember { mutableStateOf("") }
        Column(
            modifier
                .fillMaxSize()
                .padding(top = 370.dp)
        ) {
            TextComponent(
                Modifier
                    .width(235.dp)
                    .height(63.dp)
                    .padding(start = 20.dp),
                text = "Get your groceries with necter",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF030303),
                textAlign = TextAlign.Start
            )

            Spacer(modifier = modifier.height(20.dp))
            TextFieldComponent(
                modifier
                    .fillMaxWidth()
                    .padding(15.dp, 0.dp),
                value = number,
                placeholder = "",
                label = "+880",
                onValueChange = { number = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Number
                ),
                leadingIcon = {
                    Image(
                        painter = painterResource(id = R.drawable.bangladesh_falg),
                        contentDescription = null,
                        modifier = modifier.size(40.dp,40.dp)
                    )
                },

                color = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Gray
                )
                )

            Spacer(modifier = modifier.height(50.dp))
            TextComponent(
                Modifier.fillMaxWidth(),
                text = "Or connect with social media",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF828282),
                textAlign = TextAlign.Center
            )
            Spacer(modifier = modifier.height(30.dp))
            ButtonComponent(modifier.fillMaxWidth()
                    .padding(15.dp, 15.dp),
                onClick = {navController.navigate(NavigationGraph.Login.route)},
                containerColor = Color(0xFF5383EC),
                contentColor = Color(0xFFFCFCFC),
                text = "Continue with Google",
                fontWeight = FontWeight.Medium,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                shape = RoundedCornerShape(15.dp),
                icon={
                    Icon(painter = painterResource(id = R.drawable.google_icon),
                        contentDescription = "google",
                        modifier.size(22.dp,24.dp))
                }

            )

            ButtonComponent(modifier.fillMaxWidth().padding(15.dp, 15.dp),
                onClick = {navController.navigate(NavigationGraph.Login.route)},
                containerColor = Color(0xFF4A66AC),
                contentColor = Color.White,
                text = "Continue with Facebook",
                fontWeight = FontWeight.Medium,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                shape = RoundedCornerShape(15.dp),
                icon={ Icon(painter = painterResource(id = R.drawable.fb_icon),
                        contentDescription = "google", modifier.size(13.dp,24.dp))
                }
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SignInPreview(modifier: Modifier = Modifier) {
    SignIn(navController = rememberNavController())
}