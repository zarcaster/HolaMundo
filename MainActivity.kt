package com.zarcaster.mysecondapp

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.zarcaster.mysecondapp.ui.theme.MySecondAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySecondAppTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Button(
                        colors = ButtonDefaults.run { buttonColors(Color.Red) },
                        onClick = {
                            Toast.makeText(this@MainActivity, "¡Hola Mundo!", Toast.LENGTH_SHORT).show()
                        }
                    ) {
                        ClickEnTocame()
                    }
                }
            }
        }
    }
}

@Composable
fun ClickEnTocame(modifier: Modifier = Modifier) {
    Text(
        text = "Tócame", color = Color.White,
        modifier = modifier
    )
}

@Preview
@Composable
fun HolaMundoPreview() {
    MySecondAppTheme {
        ClickEnTocame()
    }
}