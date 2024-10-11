package com.example.fescity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.fescity.ui.theme.FesCityTheme
import com.example.fescity.R // Import the R file to access drawable

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FesCityTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Content(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Content(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top
    ) {
        // Add the image of lkhli3
        Image(
            painter = painterResource(id = R.drawable.images_khli3), // Make sure the image is correctly placed in the drawable folder
            contentDescription = "Image of lkhli3",
            modifier = Modifier
                .fillMaxWidth()
                .height(250.dp), // Adjust the height as per your needs
            contentScale = ContentScale.Crop
        )

        Spacer(modifier = Modifier.height(16.dp)) // Add spacing between the image and the text

        // Add a description for lkhli3
        Text(
            text = "Lkhli3 is a famous dish from Fes, known for its unique flavor and traditional preparation methods. It's an essential part of Fassi cuisine.",
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    FesCityTheme {
        Content()
    }
}
