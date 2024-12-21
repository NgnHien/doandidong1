package com.example.doandidong1.data

import com.example.doandidong1.entity.Question

val sampleQuestions = listOf(
    Question(
        questionText = "Phần của đường bộ được sử dụng cho các phương tiện giao thông qua lại là gì?",
        options = listOf(
            "Phần mặt đường và lề đường.",
            "Phần đường xe chạy.",
            "Phần đường xe cơ giới."
        ),
        answer = 1,
        explain = "Phần đường xe chạy là phần của đường bộ được sử dụng cho phương tiện giao thông qua lại.",
        type = "Lý Thuyết",
        isCritical = false
    ),
    Question(
        questionText = "“Làn đường” là gì?",
        options = listOf(
            "Là một phần của phần đường xe chạy được chia theo chiều dọc của đường, sử dụng cho xe chạy.",
            "Là một phần của phần đường xe chạy được chia theo chiều dọc của đường, có bề rộng đủ cho xe chạy an toàn.",
            "Là đường cho xe ô tô chạy, dừng, đỗ an toàn."
        ),
        answer = 1,
        explain = "Làn đường có bề rộng đủ cho xe chạy an toàn.",
        type = "Lý Thuyết",
        isCritical = false
    )
)