package com.example.doandidong1.entity

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "questions")
data class Question(
    @PrimaryKey(autoGenerate = true) var id: Int = 0,
    val questionText: String,
    val imageUrl: String? = null, // null nếu câu hỏi không có hình
    @ColumnInfo(name = "options")
    val options: List<String>,
    val answer: Int,
    val explain: String?,
    val type: String?,
    val isCritical: Boolean = false,
)

