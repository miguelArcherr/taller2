package com.magc.taller2.data.database.DAO

import androidx.room.Query
import com.magc.taller2.data.database.entity.Material

interface MaterialDao {
    //seleccionar todas los materiales de construccion
    @Query("Select * from Material")
    suspend fun getallMaterial (): MutableList<Material>
}