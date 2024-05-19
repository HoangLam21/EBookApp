package com.plcoding.e_book.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface CategoryDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(category: com.plcoding.e_book.domain.model.Category.Result)

    @Delete
    suspend fun delete(category: com.plcoding.e_book.domain.model.Category.Result)
    @Query("SELECT * FROM Result")
    fun getCategories(): Flow<List<com.plcoding.e_book.domain.model.Category.Result>>

    @Query("SELECT * FROM Result WHERE id=:id")
    suspend fun getCategory(id: Int): com.plcoding.e_book.domain.model.Category.Result?

}