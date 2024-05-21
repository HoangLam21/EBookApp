package com.plcoding.e_book.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.plcoding.e_book.domain.model.Books.Result
import kotlinx.coroutines.flow.Flow

@Dao
interface BooksDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(result: Result)

    @Delete
    suspend fun delete(result: Result)

    @Query("SELECT * FROM Result")
    fun getBooks(): Flow<List<Result>>

    @Query("SELECT * FROM Result WHERE id=:id")
    suspend fun getBooks(id: Int): Result?

    @Query("SELECT * FROM Result WHERE discount > 0")
    fun getBooksWithDiscount(): Flow<List<Result>>

    @Query("SELECT * FROM Result WHERE category IN (SELECT id FROM Result WHERE Result.id =:categoryId)")
    fun getBooksWithCategory(categoryId:Int): Flow<List<Result>>
}