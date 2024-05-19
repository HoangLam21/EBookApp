package com.plcoding.e_book.data.remote

import androidx.room.Dao
import androidx.room.Query
import com.plcoding.e_book.domain.model.Category.Result
import kotlinx.coroutines.flow.Flow
@Dao
interface CategoryDao {
    @Query("SELECT * FROM Result")
    fun getCategories(): Flow<List<com.plcoding.e_book.domain.model.Category.Result>>

    @Query("SELECT * FROM Result WHERE id=:id")
    suspend fun getCategory(id: Int): Result?
}