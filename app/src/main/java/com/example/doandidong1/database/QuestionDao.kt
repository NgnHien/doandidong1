package com.example.doandidong1.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.doandidong1.entity.Question

@Dao
interface QuestionDao {
    @Query("SELECT * FROM questions")
    fun getAllQuestions(): List<Question>

    @Query("SELECT * FROM questions WHERE isCritical = 1")
    fun getCriticalQuestions(): List<Question>

    @Query("SELECT * FROM questions ORDER BY RANDOM() LIMIT 25")
    fun getRandom25Questions(): List<Question>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(questions: List<Question>)

    @Insert(onConflict = OnConflictStrategy.ABORT)
    suspend fun addQuestion(question: Question): Long
}