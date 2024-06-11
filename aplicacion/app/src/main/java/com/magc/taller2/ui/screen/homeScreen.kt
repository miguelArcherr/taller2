package com.magc.taller2.ui.screen


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.ListItem
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.TopAppBarDefaults.topAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextRange
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.magc.taller2.MainViewModel
import com.magc.taller2.data.Familylist
import com.magc.taller2.data.database.entity.Family
import com.magc.taller2.ui.component.TopBar
import com.magc.taller2.ui.component.listItem





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen (
    viewModel: MainViewModel,
    navController: NavController
) {

    Scaffold(
        topBar = {
                TopBar(
                    "ECOSF",
                    navController = navController
                )

//            CenterAlignedTopAppBar(
//                colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
//                    containerColor = MaterialTheme.colorScheme.primaryContainer,
//                    titleContentColor = MaterialTheme.colorScheme.primary
//                ),
//
//                title = {
//                    Text("ECOSF")
//                }
//            )
        }
    ) { paddingValues ->
        Column (
            Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            ElevatedButton(
                onClick = {
                    navController.navigate("AddFamily")
                }
            ) {
                Text("Aniadir familia")
            }
            ElevatedButton(
                onClick = { navController.navigate("FamilyDetails") }
            ) {
                Text("Ver familia")
            }
            ElevatedButton(
                onClick = { navController.navigate("PersonDetails") }
            ) {
                Text("Ver persona")
            }


        }

    }
}
@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {

    HomeScreen(MainViewModel(), NavHostController(LocalContext.current))
}









