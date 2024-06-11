package com.magc.taller2.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.magc.taller2.MainViewModel
import com.magc.taller2.ui.component.TopBar


@Composable
fun PersonDetails (
    viewModel: MainViewModel,
    navController: NavController
){
    Scaffold(
        topBar = {
            TopBar(
                "Ver persona",
                navController = navController
                )
//
        }
    ) { paddingValues ->

        Text(
            modifier = Modifier.padding(paddingValues),
            text = "Ver personas"
        )

    }
}