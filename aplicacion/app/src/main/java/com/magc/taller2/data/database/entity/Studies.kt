package com.magc.taller2.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "Studies")

data class Studies(

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_estudios")
    val id_estudios : Int = 0,

    @ColumnInfo(name = "nivel_estudios")
    val nivel_estudios : String = "",

    )
