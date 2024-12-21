package com.example.doandidong1.database

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.doandidong1.entity.Question
import com.example.doandidong1.entity.Test
import com.example.doandidong1.entity.TestQuestion

@Database(entities = [Question::class , Test::class , TestQuestion::class], version = MyRoomDatabase.DB_VERSION)
abstract class MyRoomDatabase : RoomDatabase(){
    companion object{
        // 1.Định Nghĩa thuộc tính chung của CSDL , trong đó DB_INSTANCE chỉ được tạo 1 lần và các luồng luôn nhìn thấy giá trị mới nhất
        const val DB_VERSION = 1
        const val DB_NAME = "my_database"

        @Volatile
        private var DB_INSTANCE:MyRoomDatabase? = null

        // Chỉ một luồng có thể gọi lệnh tạo mới CSDL ( tạo một lần duy nhất )
        fun getDatabase(context: Context):MyRoomDatabase{
            return DB_INSTANCE ?: synchronized(this){
                val instance = Room.databaseBuilder(context , MyRoomDatabase::class.java ,DB_NAME).build()
                DB_INSTANCE = instance
                instance
            }
        }
    }

    // 2.Định nghĩa đối tượng DAO truy xuất CSDL
    abstract fun questionDao(): QuestionDao
    abstract fun testDao(): TestDao
    abstract fun testQuestionDao(): TestQuestionDao
}
