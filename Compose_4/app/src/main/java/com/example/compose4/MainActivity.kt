package com.example.compose4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.example.compose4.ui.theme.Compose4Theme
import com.example.compose4.R

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PantallaConText()
        }
    }
}

@Composable
fun PantallaConText() {
    Column {
        Text(
            text = "Primer Text",
            fontFamily = FontFamily(Font(R.font.liberty)),
            fontSize = 50.sp
        )
        Text(
            text = "Segundo Text",
            fontFamily = FontFamily(Font(R.font.silver)),
            fontSize = 50.sp
        )
        Text(
            text = "Tercer Text",
            fontFamily = FontFamily(Font(R.font.winter)),
            fontSize = 50.sp
        )
    }
}
