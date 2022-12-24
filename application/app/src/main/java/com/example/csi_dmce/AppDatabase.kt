package com.example.csi_dmce

import androidx.room.Database
import androidx.room.RoomDatabase

// NOTE: Increment the version number each time we change the schema.
@Database(entities = [User::class], version = 5)
abstract class AppDatabase: RoomDatabase() {
    abstract fun userDao(): UserDAO
}