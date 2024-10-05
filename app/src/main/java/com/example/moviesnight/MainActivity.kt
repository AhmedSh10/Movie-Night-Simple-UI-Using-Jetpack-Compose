package com.example.moviesnight

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.moviesnight.ui.theme.ApplicationTheme
import com.example.moviesnight.ui.theme.data.DiscoverScreenState
import com.example.moviesnight.ui.theme.screen.DiscoveryScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DiscoveryScreen(modifier = Modifier.padding(innerPadding),
                    screenState = DiscoverScreenState()
                    )

                }
            }
        }
    }
}

