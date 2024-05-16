package com.plcoding.e_book.domain.repository

import androidx.paging.PagingData
import com.plcoding.e_book.domain.model.Books.Result
import kotlinx.coroutines.flow.Flow

interface BooksResponsitory {

    fun getBooks(sources: List<String>): Flow<PagingData<Result>>

    suspend fun upsertBooks(result: Result)

    suspend fun deleteBooks(result: Result)

    fun selectBooks(): Flow<List<Result>>

    suspend fun selectBook(id: Int): Result?
}