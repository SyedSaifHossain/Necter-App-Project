package com.syedsaifhossain.necterappproject.components

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.TextUnit

@Composable
fun TextComponent(
    modifier: Modifier,
    text : String="",
    fontWeight: FontWeight,
    fontSize: TextUnit,
    color: Color,
    textAlign: TextAlign
){
    Text(modifier = modifier,
        text = text,
        fontWeight = fontWeight,
        fontSize = fontSize,
        color = color,
        textAlign = textAlign)
}