package com.magc.taller2.data.database.DAO

import androidx.room.Query
import com.magc.taller2.data.database.entity.Studies

interface StudiesDao {
    //seleccionar niveles de estudio
    @Query("Select * from Studies")
    suspend fun getallStudies (): MutableList<Studies>
}