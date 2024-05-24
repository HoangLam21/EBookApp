package com.plcoding.e_book.domain.repository

import androidx.paging.PagingData
import com.plcoding.e_book.domain.model.Books.Result
import kotlinx.coroutines.flow.Flow

interface BooksResponsitory {

    fun getBooks(sources: List<String>): Flow<PagingData<com.plcoding.e_book.domain.model.Books.Result>>

    fun searchBoooks(searchQuery: String, sources: List<String>): Flow<PagingData<Result>>

    suspend fun upsertBooks(result: com.plcoding.e_book.domain.model.Books.Result)

    suspend fun deleteBooks(result: com.plcoding.e_book.domain.model.Books.Result)

    fun selectBooks(): Flow<List<com.plcoding.e_book.domain.model.Books.Result>>

    suspend fun selectBook(id: Int): com.plcoding.e_book.domain.model.Books.Result?

    fun getBooksWithDiscount(): Flow<List<com.plcoding.e_book.domain.model.Books.Result>>

    fun getBooksWithCategory(categoryId:Int):Flow<List<com.plcoding.e_book.domain.model.Books.Result>>

}