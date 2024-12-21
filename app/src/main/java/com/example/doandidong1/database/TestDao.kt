package com.example.doandidong1.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.doandidong1.entity.Test

@Dao
interface TestDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTest(test: Test)

    @Query("SELECT * FROM test")
    suspend fun getAllTests(): List<Test>
}
