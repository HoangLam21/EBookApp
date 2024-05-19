package com.plcoding.e_book.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.plcoding.e_book.data.local.BooksDao
import com.plcoding.e_book.data.remote.BooksApi
import com.plcoding.e_book.data.remote.BooksPagingSource
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.repository.BooksResponsitory
import kotlinx.coroutines.flow.Flow

class BooksResponsetoryImpl(
    private val booksApi: BooksApi,
    private val booksDao: BooksDao
): BooksResponsitory {

    override fun getBooks(sources: List<String>): Flow<PagingData<Result>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                BooksPagingSource(
                    booksApi = booksApi,
                    sources = sources.joinToString(separator = ",")
                )
            }
        ).flow
    }

    override suspend fun upsertBooks(result: Result) {
        booksDao.upsert(result)
    }

    override suspend fun deleteBooks(result: Result) {
        booksDao.delete(result)

    }

    override fun selectBooks(): Flow<List<Result>> {
        return booksDao.getBooks()

    }

    override suspend fun selectBook(id: Int): Result? {
        return booksDao.getBooks(id)

    }
}