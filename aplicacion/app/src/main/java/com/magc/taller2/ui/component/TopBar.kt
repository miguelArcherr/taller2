package com.magc.taller2.ui.component

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Screen
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.magc.taller2.ui.navigation.ScreenRoute


@Composable
fun TopBar(
    title: String ="",
    navController: NavController
) {
    val currentRoute = navController.currentBackStackEntry?.destination?.route

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .height(60.dp)
            .background(MaterialTheme.colorScheme.primary),
        verticalAlignment = Alignment.CenterVertically
    ){
        if (currentRoute != ScreenRoute.Home.route){
            Icon(
                modifier = Modifier.padding(start = 10.dp).clickable { navController.popBackStack() },
                imageVector = Icons.Default.ArrowBack,
                contentDescription = "back",
                tint = Color.White,
            )
        }
//        Icon(
//            modifier = Modifier.padding(start = 10.dp).clickable { navController.popBackStack() },
//            imageVector = Icons.Default.ArrowBack,
//            contentDescription = "back",
//            tint = Color.White,
//
//        )
        Spacer(modifier = Modifier.width(30.dp))
        Text(
            modifier = Modifier.padding(start = 10.dp),
            text = title,
            color = Color.White,
            fontWeight = FontWeight.SemiBold
        )
    }
}

@Preview
@Composable
fun PreviewTopbar(){
    TopBar("Ejemplo", NavHostController(LocalContext.current))
}