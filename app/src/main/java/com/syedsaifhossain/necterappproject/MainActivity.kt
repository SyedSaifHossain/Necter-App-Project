package com.syedsaifhossain.necterappproject

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.syedsaifhossain.necterappproject.ui.theme.NecterAppProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NecterAppProjectTheme{
                MyApp()
            }
        }
    }
}

@Composable
fun MyApp() {
Text(text = "Welcome")
}

@Preview(showBackground = true)
@Composable
fun MyAppPreview() {
    NecterAppProjectTheme {
            MyApp()
    }
}