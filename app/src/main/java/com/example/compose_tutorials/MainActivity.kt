package com.example.compose_tutorials

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.ui.Modifier
import com.example.compose_tutorials.pathway1_compose_essentials.codelab1_first_compose_app.MyApp
import com.example.compose_tutorials.ui.theme.Compose_TutorialsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Compose_TutorialsTheme {
                MyApp(modifier = Modifier.fillMaxSize())
            }
        }
    }
}
