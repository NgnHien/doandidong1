package com.example.doandidong1.data

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class Converters {

    @TypeConverter
    fun fromListToString(list: List<String>?): String? {
        return if (list == null) {
            null
        } else {
            Gson().toJson(list) // Chuyển List thành JSON string
        }
    }

    @TypeConverter
    fun fromStringToList(data: String?): List<String>? {
        return if (data == null) {
            null
        } else {
            val listType = object : TypeToken<List<String>>() {}.type
            Gson().fromJson(data, listType) // Chuyển JSON string thành List
        }
    }
}
