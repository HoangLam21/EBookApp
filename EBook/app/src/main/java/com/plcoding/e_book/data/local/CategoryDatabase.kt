package com.plcoding.e_book.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import com.plcoding.e_book.domain.model.Category.Result

@Database(entities = [Result::class], version =1)
abstract class CategoryDatabase: RoomDatabase() {
    abstract val categoryDao:CategoryDao
}