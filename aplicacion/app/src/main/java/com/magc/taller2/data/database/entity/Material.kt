package com.magc.taller2.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Material")

data class Material(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_tdv")
    val id_tdv : Int = 0,

    @ColumnInfo(name = "nombre_material")
    val nombre_material : String = "",

    )
