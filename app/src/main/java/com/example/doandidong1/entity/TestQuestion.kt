package com.example.doandidong1.entity

import androidx.room.Entity
import androidx.room.ForeignKey

@Entity(
    tableName = "test_question",
    primaryKeys = ["testId", "questionId"],
    foreignKeys = [
        ForeignKey(entity = Test::class, parentColumns = ["id"], childColumns = ["testId"]),
        ForeignKey(entity = Question::class, parentColumns = ["id"], childColumns = ["questionId"])
    ]
)
data class TestQuestion(
    val testId: Int, // ID của bộ đề
    val questionId: Int, // ID của câu hỏi
    val sequence: Int // Thứ tự câu hỏi trong bộ đề
)
