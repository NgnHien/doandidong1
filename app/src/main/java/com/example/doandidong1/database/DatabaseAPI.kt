package com.example.doandidong1.database

import android.content.Context
import com.example.doandidong1.entity.Question
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

interface OnDatabaseCallback{
    fun onSuccess(id: Long)
    fun onFailure(e: Exception)
}

class DatabaseAPI (context: Context){
    private var questionDao: QuestionDao
    private var testDao: TestDao
    private var testQuestionDao: TestQuestionDao

    init {
        questionDao = MyRoomDatabase.getDatabase(context).questionDao()
        testDao = MyRoomDatabase.getDatabase(context).testDao()
        testQuestionDao = MyRoomDatabase.getDatabase(context).testQuestionDao()
    }

    //Xu li bat dong bo
    // tao mot coroutineScope voi Job de quan ly vong doi cua coroutine
    private val job = Job()
    private val coroutineScope = CoroutineScope(Dispatchers.Main + job)

    //Dinh nghia cac APIs cho tang tren
    fun themCauHoi(question: Question , callback: OnDatabaseCallback) {
        // Mo mot tien trinh moi cho viec truy xuat CSDL
        coroutineScope.launch {
            try {
                val id = questionDao.addQuestion(question)
                // cap nhat id cho doi tuong nhan su moi tao tren giao dien
                if (id != -1L) {
                    question.id = id.toInt()
                }
                // quay ve main thread de goi callback
                withContext(Dispatchers.Main) {
                    callback.onSuccess(id)
                }
            } catch (e: Exception) {
                // Quay ve main thread de goi callback onFailure khi co loi
                withContext(Dispatchers.Main) {
                    callback.onFailure(e)
                }
            }
        }
    }
}
