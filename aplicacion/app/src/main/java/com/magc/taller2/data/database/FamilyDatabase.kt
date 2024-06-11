package com.magc.taller2.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.magc.taller2.data.database.DAO.FamilyDao
import com.magc.taller2.data.database.DAO.FamilyRiskDao
import com.magc.taller2.data.database.DAO.MaterialDao
import com.magc.taller2.data.database.DAO.PersonDao
import com.magc.taller2.data.database.DAO.StudiesDao
import com.magc.taller2.data.database.entity.Family
import com.magc.taller2.data.database.entity.FamilyRisk
import com.magc.taller2.data.database.entity.Material
import com.magc.taller2.data.database.entity.Person
import com.magc.taller2.data.database.entity.Studies

@Database(

    entities = [Family::class, Person::class],
    version = 1
)
abstract class FamilyDatabase: RoomDatabase() {
    abstract fun familyDao(): FamilyDao

    abstract fun personDao(): PersonDao



}