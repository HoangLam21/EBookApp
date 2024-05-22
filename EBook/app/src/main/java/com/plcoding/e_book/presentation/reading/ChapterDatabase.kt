package com.plcoding.e_book.presentation.reading


import androidx.room.Database
import androidx.room.Room
import android.content.Context
import androidx.room.RoomDatabase


@Database(entities = [Chapter::class], version = 1)
abstract class ChapterDatabase : RoomDatabase() {
    abstract fun chapterDao(): ChapterDao

    companion object {
        @Volatile
        private var INSTANCE: ChapterDatabase? = null

        fun getDatabase(context: Context): ChapterDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    ChapterDatabase::class.java,
                    "chapter_database"
                ).build()
                INSTANCE = instance
                instance
            }
        }
    }
}