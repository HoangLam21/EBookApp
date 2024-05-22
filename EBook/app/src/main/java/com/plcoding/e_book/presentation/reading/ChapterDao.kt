package com.plcoding.e_book.presentation.reading

import androidx.lifecycle.LiveData
import kotlinx.coroutines.flow.Flow
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction

@Dao
interface ChapterDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(chapter: Chapter)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsertAll(chapters: List<Chapter>)

    @Query("SELECT * FROM Chapter")
    fun getAllChapter(): Flow<List<Chapter>>

    @Query("SELECT * FROM chapter WHERE id=:id")
    suspend fun getChapter(id: Int): Chapter?

   // @Suppress("AndroidUnresolvedRoomSqlReference")

}