package com.syedsaifhossain.necterappproject.components

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults.buttonColors
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit




@Composable
fun ButtonComponent(
    modifier: Modifier,
    onClick:()->Unit,
    containerColor: Color,
    contentColor: Color,
    text : String="",
    fontWeight: FontWeight,
    fontSize: TextUnit,
    textAlign: TextAlign,
    shape: Shape
){
    Button(
        modifier = modifier,
        onClick = onClick,
        shape = shape,
        colors = buttonColors(
            containerColor=containerColor,
            contentColor=contentColor,
        )
    )
    {
        Text(modifier = modifier,
            text = text,
            fontWeight = fontWeight,
            fontSize = fontSize,
            textAlign = textAlign)
    }
}