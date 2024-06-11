package com.magc.taller2.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "FamilyRisk")
data class FamilyRisk(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_rf")
    val id_rf : Int = 0,

    @ColumnInfo(name = "nivel_riesgo")
    val nivel_riesgo : String = "",

    )
