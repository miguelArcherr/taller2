package com.magc.taller2.data.database.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.magc.taller2.data.database.entity.Family
import com.magc.taller2.data.database.entity.Person

@Dao
interface PersonDao {
    //seleccionar todas las personas
    @Query("Select * from Person")
    suspend fun getallPerson (): MutableList<Person>

    //seleccionar persona especifica por dui
    @Query("Select * from Person where dui =:Dui ")
    suspend fun getPersondui(Dui:String): Person

    //seleccionar persona especifica por id
    @Query("Select * from Person where id_persona =:id_persona ")
    suspend fun getPersonid(id_persona:Int): Person

    //seleccionar persona especifica por apellido
    @Query("Select * from Person where apellidos =:apellido ")
    suspend fun getPersonapellido(apellido:String): Person

    //buscar la casa de la persona
    @Query("Select * from Person p inner join Family f on p.vivienda = f.id_imf  ")
    suspend fun getcasaPersona(): Family

    //insertar a persona
    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun inserPerson(person: Person)
}