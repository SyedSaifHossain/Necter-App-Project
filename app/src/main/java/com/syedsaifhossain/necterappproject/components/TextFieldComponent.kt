package com.syedsaifhossain.necterappproject.components
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp


@Composable
fun TextFieldComponent(
    modifier: Modifier = Modifier,
    value: String,
    placeholder:String,
    onValueChange: (String) -> Unit,
    label: String,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default.copy(
        keyboardType = KeyboardType.Text
    ),
    leadingIcon: @Composable (()->Unit)?=null,
    trailingIcon: @Composable (()->Unit)?=null,
    color: TextFieldColors,
    visualTransformation: PasswordVisualTransformation?=null
) {
    TextField(
        modifier = modifier
            .padding(15.dp, 0.dp),
        value = value,
        placeholder={ Text(placeholder) },
        onValueChange = onValueChange,
        label = { Text(label) },
        keyboardOptions = keyboardOptions,
        leadingIcon = leadingIcon,
        trailingIcon = trailingIcon,
        colors = color,
        visualTransformation = visualTransformation?: VisualTransformation.None
    )
}