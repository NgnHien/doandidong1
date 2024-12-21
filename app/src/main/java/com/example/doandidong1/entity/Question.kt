package com.example.doandidong1.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions")
data class Question(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    val questionText: String,
    val imageUrl: String? = null, // null nếu câu hỏi không có hình
    val options: List<String>,
    val answer: Int,     // Chỉ mục của đáp án đúng.
    val explain: String?, // giải thích câu hỏi
    val isCritical: Boolean = false // đánh dấu câu hỏi liệt
)
