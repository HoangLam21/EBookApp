package com.plcoding.e_book.domain.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow

interface BooksResponsitory {

    fun getBooks(sources: List<String>): Flow<PagingData<com.plcoding.e_book.domain.model.Books.Result>>

    suspend fun upsertBooks(result: com.plcoding.e_book.domain.model.Books.Result)

    suspend fun deleteBooks(result: com.plcoding.e_book.domain.model.Books.Result)

    fun selectBooks(): Flow<List<com.plcoding.e_book.domain.model.Books.Result>>

    suspend fun selectBook(id: Int): com.plcoding.e_book.domain.model.Books.Result?
}