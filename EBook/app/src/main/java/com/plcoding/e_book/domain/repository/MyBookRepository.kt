package com.plcoding.e_book.domain.repository

import androidx.paging.PagingData
import com.plcoding.e_book.domain.model.Books.Result
import kotlinx.coroutines.flow.Flow

interface MyBookRepository {
    fun getMyBooks(sources: List<String>): Flow<PagingData<Result>>
    fun selectMyBooks(): Flow<List<Result>>
}