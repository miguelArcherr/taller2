package com.magc.taller2.ui.screen
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.magc.taller2.MainViewModel
import com.magc.taller2.ui.component.TopBar
import com.magc.taller2.ui.navigation.Item


@Composable
fun AddFamily (
    viewModel: MainViewModel,
    navController: NavController,
    items: List<Item>
){


    Scaffold(
        topBar = {
            TopBar(
                "Agregar familia",
                navController = navController
            )
//

        },
        floatingActionButton = {
            FloatingActionButton(onClick = { navController.navigate("AddPerson") }) {
                Icon(Icons.Default.Add, contentDescription = "Add")
            }
        }



    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(paddingValues)
                .padding(start = 16.dp, end = 16.dp),
            //verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            var expanded = remember { mutableStateOf(false) }
            // Para leer el valor:
            val isExpanded = expanded.value
            // Para cambiar el valor:
            expanded.value = true

            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Canton:")
                Spacer(modifier = Modifier.weight(1f))
                TextField(
                    value = "",
                    onValueChange = {}
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Riesgo familiar:")
                Spacer(modifier = Modifier.weight(1f))
                TextField(
                    value = "",
                    onValueChange = {}
                )
            }
            Spacer(modifier = Modifier.height(15.dp))
            Row {
                Text(text = "Tipo de vivienda:")
                Spacer(modifier = Modifier.weight(1f))
                TextField(
                    value = "",
                    onValueChange = {}
                )
            }
//            Row {
//                Text(text = "Ubicacion:")
//                Spacer(modifier = Modifier.weight(1f))
//
//                IconButton(onClick = { expanded.value = true }) {
//                    Icon(Icons.Filled.MoreVert, contentDescription = "More")
//                }
//                DropdownMenu(
//                    expanded = expanded.value,
//                    onDismissRequest = { expanded.value = false }
//                ) {
//                    DropdownMenuItem(
//                        onClick = { },
//                        text = { Text("Opción 1") }
//                    )
//                    DropdownMenuItem(
//                        onClick = { },
//                        text = { Text("Opción 2") }
//                    )
//
//                }
//            }
            Spacer(modifier = Modifier.weight(1f))

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 2.dp)
            ) {
                LazyColumn(
                    modifier = Modifier
                        .padding(16.dp)
                        .heightIn(max = 200.dp)
                ) {
                    items(items) { item ->
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(vertical = 8.dp)
                        ) {
                            Text(text = item.nombre)
                            Spacer(modifier = Modifier.weight(1f))
                            Text(text = item.apelidos)
                        }
                    }
                }
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
