package com.plcoding.e_book.data.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import kotlinx.coroutines.flow.Flow

@Dao
interface BooksDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(result: com.plcoding.e_book.domain.model.Books.Result)

    @Delete
    suspend fun delete(result: com.plcoding.e_book.domain.model.Books.Result)

    @Query("SELECT * FROM Result")
    fun getBooks(): Flow<List<com.plcoding.e_book.domain.model.Books.Result>>

    @Query("SELECT * FROM Result WHERE id=:id")
    suspend fun getBooks(id: Int): com.plcoding.e_book.domain.model.Books.Result?

    @Query("SELECT * FROM Result WHERE discount > 0")
    fun getBooksWithDiscount(): Flow<List<com.plcoding.e_book.domain.model.Books.Result>>

    @Query("SELECT * FROM Result WHERE categoryId =:categoryId")
    fun getBooksWithCategory(categoryId:Int): Flow<List<com.plcoding.e_book.domain.model.Books.Result>>
}