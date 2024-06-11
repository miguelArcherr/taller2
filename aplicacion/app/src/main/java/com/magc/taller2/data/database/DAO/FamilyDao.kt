package com.magc.taller2.data.database.DAO

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.magc.taller2.data.database.entity.Family
@Dao
interface FamilyDao {

    //seleccionar todas las familias
    @Query ("Select * from Family")
   suspend fun getallFamily (): MutableList<Family>

   //seleccionar familia especifica
   @Query ("Select * from Family where id_imf =:id_familia ")
   suspend fun getFamilyid(id_familia:Int): Family

    //seleccionar familias por canton
    @Query ("Select * from Family where canton =:Canton ")
    suspend fun getallFamilycanton(Canton:String): Family

   //insertar a familia
   @Insert(onConflict = OnConflictStrategy.ABORT)
   suspend fun inserFamily(family: Family)}

//canton,
   // riesgo, tipo
