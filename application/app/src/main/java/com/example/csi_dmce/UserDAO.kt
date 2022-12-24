package com.example.csi_dmce

import androidx.room.*

@Dao
interface UserDAO {
    @Query("SELECT * FROM user")
    fun getAll(): List<User>

    @Query("SELECT * FROM user WHERE user_id = :id")
    fun getUserById(id: Int): User

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insert(user: User)

    @Delete
    fun delete(user: User)
}