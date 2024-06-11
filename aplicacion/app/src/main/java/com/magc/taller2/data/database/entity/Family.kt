package com.magc.taller2.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "Family",

)

data class Family(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_imf")
    val id_imf : Int ,

    @ColumnInfo(name = "canton")
    val canton : String = "",

    //fk desde material -> family
    @ColumnInfo(name = "Material de vivienda")
    val Material_vivienda : String,

    @ColumnInfo(name = "coordenadas")
    val cordenadas : String = "",

    //fk desde FamilyRisk -> family
    @ColumnInfo(name = "Nivel de riesgo")
    val nivel_riesgo: String,

    @ColumnInfo(name = "cabecera")
    val cabecera : String = "",


    )
