package com.magc.taller2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import com.magc.taller2.ui.navigation.Navigation
import com.magc.taller2.ui.theme.Taller2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewmodel : MainViewModel by viewModels()

        setContent {
            Taller2Theme {

                Surface(
                    modifier = Modifier.fillMaxSize(),
                ) {
                    Navigation(viewmodel)

                }
            }
        }
    }
}

