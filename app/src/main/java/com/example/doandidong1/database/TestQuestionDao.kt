package com.example.doandidong1.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.example.doandidong1.entity.Question
import com.example.doandidong1.entity.TestQuestion

@Dao
interface TestQuestionDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertTestQuestion(testQuestion: TestQuestion)

    @Query("""
        SELECT q.* FROM questions q 
        INNER JOIN test_question tq ON q.id = tq.questionId 
        WHERE tq.testId = :testId 
        ORDER BY tq.sequence
    """)
    suspend fun getQuestionsForTest(testId: Int): List<Question>
}
