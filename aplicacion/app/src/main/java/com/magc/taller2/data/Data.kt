package com.magc.taller2.data

import androidx.compose.runtime.mutableStateListOf
import com.magc.taller2.data.database.entity.Family
import com.magc.taller2.data.database.entity.FamilyRisk
import com.magc.taller2.data.database.entity.Material
import com.magc.taller2.data.database.entity.Person
import com.magc.taller2.data.database.entity.Studies

val Familylist = mutableStateListOf<Family>(

)


val FamilyRisklist = listOf<FamilyRisk>(
    FamilyRisk(
         1,
        "bajo"
    ),
    FamilyRisk(
        2,
    "Medio"
    ),
    FamilyRisk(
        3,
        "Alto"
      ),
    FamilyRisk(
        5,
        "Vivienda Deshabitada"
    )

)


val Material = listOf <Material>(
    Material(
        1,
        "Bhareque"
    ),
    Material(
        2,
        "Adobe"
    ),
    Material(
        4,
        "Lamina"
    ),
    Material(
        5,
        "Ladrillos"
    ),
    Material(
        6,
        "Cemento"
    ),
    Material(
        7,
        "Madera"
    ),
    Material(
        8,
        "Otros."
    ),

)
val Person = mutableStateListOf<Person>(


)
val Studies = mutableStateListOf<Studies>(
    Studies(
        1,
        "Inicial"
    ),
    Studies(
        2,
        "Parvulario"
    ),
    Studies(
        3,
        "Básico"
    ),
    Studies(
        4,
        "Medio"
    ),
    Studies(
        5,
        "Superior"
    )

)
//name "