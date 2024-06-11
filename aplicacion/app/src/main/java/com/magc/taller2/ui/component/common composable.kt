package com.magc.taller2.ui.component

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.magc.taller2.data.Familylist
import com.magc.taller2.data.database.entity.Family

@Composable
fun listItem(
    family: Family,
    onItemClick: (Family) -> Unit = {}
){
    TextButton(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth(),
        onClick = {  }, shape = CutCornerShape(0f)
    ) {
        Text(text = "${family.id_imf}- ${family.canton} - ${family.Material_vivienda} - ${family.nivel_riesgo} - ${family.cabecera}- ${family.cordenadas}")
    }

}

