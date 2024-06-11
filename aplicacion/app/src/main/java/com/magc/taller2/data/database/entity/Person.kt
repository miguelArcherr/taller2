package com.magc.taller2.data.database.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.ForeignKey
import androidx.room.PrimaryKey

@Entity(
    tableName = "Person",
    foreignKeys = arrayOf(

        ForeignKey(
            entity = Family::class,
            parentColumns = arrayOf("id_imf"),
            childColumns = arrayOf("vivienda"),
            onDelete = ForeignKey.CASCADE,
            onUpdate = ForeignKey.CASCADE
        ),
    )
)

data class Person(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id_persona")
    val id_persona : Int ,

    @ColumnInfo(name = "dui")
    val dui : String = "",

    @ColumnInfo(name = "nombres")
    val nombres : String = "",

    @ColumnInfo(name = "apellidos")
    val apellidos : String = "",

    @ColumnInfo(name = "fecha_nac")
    val fecha_nac : String = "",

    //fk desde Studies -> person
    @ColumnInfo(name = "grado_escolar")
    val nivel_estudio : String,

    @ColumnInfo(name = "alfabetizado")
    val alfabetizado : Boolean ,


    //fk desde Family -> Person
    @ColumnInfo(name = "vivienda", index = true)
    val id_imf : Int = 0 ,

    )
