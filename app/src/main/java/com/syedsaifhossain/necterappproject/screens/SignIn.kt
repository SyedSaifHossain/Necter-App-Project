package com.syedsaifhossain.necterappproject.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.syedsaifhossain.necterappproject.R


@Composable
fun SignIn(modifier:Modifier = Modifier){
    Box(modifier.fillMaxSize()){
        Image(painter = painterResource(id = R.drawable.bacgroundopacity),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth()
            )

            Column(){

            }
        }
    }

@Preview(showBackground = true)
@Composable
fun SignInPreview(modifier:Modifier = Modifier){

    SignIn()
}