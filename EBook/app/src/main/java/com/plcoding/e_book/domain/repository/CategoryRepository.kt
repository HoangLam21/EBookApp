package com.plcoding.e_book.domain.repository

import androidx.paging.PagingData
import kotlinx.coroutines.flow.Flow

interface CategoryRepository {
    fun getCategory(sources: List<String>): Flow<PagingData<com.plcoding.e_book.domain.model.Category.Result>>

    fun selectCategories(): Flow<List<com.plcoding.e_book.domain.model.Category.Result>>

    suspend fun selectCategory(id: Int): com.plcoding.e_book.domain.model.Category.Result?
}