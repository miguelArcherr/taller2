package com.magc.taller2.data.database.DAO

import androidx.room.Query
import com.magc.taller2.data.database.entity.FamilyRisk

interface FamilyRiskDao {
    //seleccionar todas los niveles de riesgo
    @Query("Select * from FamilyRisk")
    suspend fun getallFamilyRis (): MutableList<FamilyRisk>
}