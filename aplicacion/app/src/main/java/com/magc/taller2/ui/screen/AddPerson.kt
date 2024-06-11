package com.magc.taller2.ui.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.magc.taller2.MainViewModel
import com.magc.taller2.ui.component.TopBar


@Composable
fun AddPerson (
    viewModel: MainViewModel,
    navController: NavController
){
    var checked by remember { mutableStateOf(true) }
    Scaffold(
        topBar = {
            TopBar(
                "Agregar persona",
                navController = navController
            )

        }
    ) { paddingValues ->

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues)
                .padding(start = 16.dp, end = 16.dp),
            //verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally

        ){
            Row {
                Text(text = "DUI::")
                Spacer(modifier = Modifier.weight(1f))
                TextField(
                    value = "",
                    onValueChange = {}
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Nombres:")
                Spacer(modifier = Modifier.weight(1f))
                TextField(
                    value = "",
                    onValueChange = {}
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Apellidos:")
                Spacer(modifier = Modifier.weight(1f))
                TextField(
                    value = "",
                    onValueChange = {}
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Fecha de nacimiento:")
                Spacer(modifier = Modifier.weight(1f))
                TextField(
                    value = "",
                    onValueChange = {}
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Grado de estudio:")
                Spacer(modifier = Modifier.weight(1f))
                TextField(
                    value = "",
                    onValueChange = {}
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Alfabetizado:")
                Spacer(modifier = Modifier.weight(1f))
                Switch(
                    checked = checked,
                    onCheckedChange = {
                        checked = it
                    }
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Cabecera:")
                Spacer(modifier = Modifier.weight(1f))

                Switch(
                    checked = checked,
                    onCheckedChange = {
                        checked = it
                    }
                )
            }

            Spacer(modifier = Modifier.weight(1f))

            Row (
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ){
                ElevatedButton(onClick = {  }) {
                    Text("Limpiar")
                }
                ElevatedButton(
                    modifier = Modifier
                        .padding(end = 30.dp),
                    onClick = { navController.navigate("Home") }
                ) {
                    Text("Guardar")
                }
            }
        }
    }
}