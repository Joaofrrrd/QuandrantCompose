package com.example.quandrantcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.quandrantcompose.ui.theme.QuandrantComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            QuandrantComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(titre1 = "Text composable",
                        texte1 = "Displays text and follows the recommended Material Design guidelines.",
                        titre2 = "Image composable",
                        texte2 = "Creates a composable that lays out and draws a given Painter class object.".,
                        titre3 = "Row composable",
                        texte3 = "A layout composable that places its children in a horizontal sequence.",
                        titre4 = "Column composable",
                        texte4 = "A layout composable that places its children in a vertical sequence.")
                }
            }
        }
    }
}

@Composable
fun Greeting(titre1: String, texte1 : String, titre2 : String, texte2 : String, titre3 : String, texte3 : String, titre4 : String, texte4 : String, modifier: Modifier = Modifier) {
    Column(
        Text(
            text = titre1,
            text = texte1,
            backgroundColor = Color(0xFFEADDFF),
            
        )

    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    QuandrantComposeTheme {
        Greeting(titre1 = "Text composable",
            texte1 = "Displays text and follows the recommended Material Design guidelines.",
            titre2 = "Image composable",
            texte2 = "Creates a composable that lays out and draws a given Painter class object.".,
            titre3 = "Row composable",
            texte3 = "A layout composable that places its children in a horizontal sequence.",
            titre4 = "Column composable",
            texte4 = "A layout composable that places its children in a vertical sequence.")
    }
}