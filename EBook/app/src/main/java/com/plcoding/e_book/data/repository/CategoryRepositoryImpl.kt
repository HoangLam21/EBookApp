package com.plcoding.e_book.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.plcoding.e_book.data.local.BooksDao
import com.plcoding.e_book.data.remote.BooksApi
import com.plcoding.e_book.data.remote.BooksPagingSource
import com.plcoding.e_book.data.remote.CategoryApi
import com.plcoding.e_book.data.remote.CategoryPagingSource
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.repository.BooksResponsitory
import com.plcoding.e_book.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow

class CategoryRepositoryImpl(
    private val categoryApi: CategoryApi
): CategoryRepository {


    override fun getCategory(sources: List<String>): Flow<PagingData<com.plcoding.e_book.domain.model.Category.Result>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                CategoryPagingSource(
                    categoryApi = categoryApi,
                    sources = sources.joinToString(separator = ",")
                )
            }
        ).flow
    }

}