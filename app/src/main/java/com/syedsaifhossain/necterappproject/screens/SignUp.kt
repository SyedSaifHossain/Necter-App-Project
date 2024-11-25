package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.syedsaifhossain.necterappproject.R
import com.syedsaifhossain.necterappproject.components.ButtonComponent
import com.syedsaifhossain.necterappproject.components.TextComponent
import com.syedsaifhossain.necterappproject.components.TextFieldComponent


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SignUp(navController: NavController,modifier: Modifier = Modifier) {
    Box(modifier.fillMaxSize()) {
        Image(
            painter = painterResource(id = R.drawable.mask_group),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
        )
        var userName by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        Column(
            modifier
                .fillMaxSize()
                .padding(top = 300.dp)
        ) {
            TextComponent(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                text = "Sign Up",
                fontSize = 28.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF181725),
                textAlign = TextAlign.Start
            )
            Spacer(modifier = modifier.height(15.dp))
            TextComponent(
                Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp),
                text = "Enter your credential to continue",
                fontSize = 18.sp,
                fontWeight = FontWeight(600),
                color = Color(0xFF181725),
                textAlign = TextAlign.Start
            )

            Spacer(modifier = modifier.height(15.dp))

            TextFieldComponent(
                modifier
                    .fillMaxWidth().height(56.dp)
                    .padding(15.dp, 0.dp),
                value = userName,
                placeholder = "Afsar Hossen Shuvo",
                label = "Username",
                onValueChange = { userName = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Text
                ),
                color = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Gray
                )
            )

            Spacer(modifier = modifier.height(15.dp))

            TextFieldComponent(
                modifier
                    .fillMaxWidth().height(56.dp)
                    .padding(15.dp, 0.dp),
                value = email,
                placeholder = "imshuvo97@gmail.com",
                label = "Email",
                onValueChange = { email = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Email
                ),
                trailingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Check,
                        contentDescription = "Done icon",
                        tint = Color.Green
                    )
                },
                color = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Gray
                )
            )
            Spacer(modifier = modifier.height(15.dp))
            TextFieldComponent(
                modifier
                    .fillMaxWidth().height(56.dp)
                    .padding(15.dp, 0.dp),
                value = password,
                placeholder = "",
                label = "Password",
                onValueChange = { password = it },
                keyboardOptions = KeyboardOptions.Default.copy(
                    keyboardType = KeyboardType.Password,
                ),
                trailingIcon = {
                    Icon(
                        painter = painterResource(R.drawable.hiddenicon),

                        contentDescription = "Hidden icon",
                        modifier.size(25.dp)
                    )
                },
                color = TextFieldDefaults.textFieldColors(
                    containerColor = Color.Transparent,
                    focusedIndicatorColor = Color.Black,
                    unfocusedIndicatorColor = Color.Gray
                ),
                visualTransformation = PasswordVisualTransformation()
            )

            Spacer(modifier = modifier.height(30.dp))

            TermsAndPrivacyText()
            Spacer(modifier = modifier.height(10.dp))

            ButtonComponent(
                modifier
                    .fillMaxWidth()
                    .padding(15.dp, 15.dp),
                onClick = {},
                containerColor = Color(0xFF53b175),
                contentColor = Color(0xFFFCFCFC),
                text = "Sign up",
                fontWeight = FontWeight.Medium,
                fontSize = 25.sp,
                textAlign = TextAlign.Center,
                shape = RoundedCornerShape(15.dp),
                icon = null
            )
            Spacer(modifier = modifier.height(10.dp))

            HaveAccount()

        }
    }
}

@Composable
fun TermsAndPrivacyText() {
    Text(
        modifier = Modifier.padding(start = 30.dp),
        text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF7C7C7C)
                )
            ) {
                append("By continuing you agree to our ")
            }
            withStyle(style = SpanStyle(color = Color(0xFF53b175), fontWeight = FontWeight(600))) {

                append("terms of service")
            }
            append("\n")

            withStyle(
                style = SpanStyle(
                    fontSize = 16.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF7C7C7C)
                )
            ) {
                append("and ")
            }
            withStyle(style = SpanStyle(color = Color(0xFF53b175),
                fontWeight = FontWeight.Bold),){
                append("Privacy Policy")
            }
        },

        textAlign = TextAlign.Start
    )
}


@Composable
fun HaveAccount() {
    Text(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { },
        text = buildAnnotatedString {
            withStyle(
                style = SpanStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF7C7C7C)
                )
            ) {
                append("Already have an account? ")
            }
            withStyle(
                style = SpanStyle(
                    fontSize = 18.sp,
                    fontWeight = FontWeight(600),
                    color = Color(0xFF53b175)
                )
            ) {
                append("Singin?")
            }
        },
        textAlign = TextAlign.Center
    )
}

@Preview(showBackground = true)
@Composable
fun SignUpPreview() {

    SignUp(navController = rememberNavController())
}