package com.magc.taller2.data.database

import android.app.Application
import androidx.room.Room

class Myaplication : Application(){

    companion object{
        lateinit var database: FamilyDatabase
    }

    override fun onCreate() {
        super.onCreate()

        database= Room.databaseBuilder(
            applicationContext,
            FamilyDatabase::class.java,
            "FamilyDatabase"
        ).fallbackToDestructiveMigration().build()
    }
}