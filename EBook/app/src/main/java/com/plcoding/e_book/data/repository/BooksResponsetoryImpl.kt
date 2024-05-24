package com.plcoding.e_book.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.plcoding.e_book.data.local.BooksDao
import com.plcoding.e_book.data.remote.BooksApi
import com.plcoding.e_book.data.remote.BooksPagingSource
import com.plcoding.e_book.data.remote.SearchBooksPagingSource
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.repository.BooksResponsitory
import kotlinx.coroutines.flow.Flow

class BooksResponsetoryImpl(
    private val booksApi: BooksApi,
    private val booksDao: BooksDao
): BooksResponsitory {

    override fun getBooks(sources: List<String>): Flow<PagingData<com.plcoding.e_book.domain.model.Books.Result>> {
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
    override fun searchBoooks(
        searchQuery: String,
        sources: List<String>
    ): Flow<PagingData<Result>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                SearchBooksPagingSource(
                    searchQuery = searchQuery,
                    booksApi = booksApi,
                    sources = sources.joinToString(separator = ",")
                )
            }
        ).flow
    }

    override suspend fun upsertBooks(result: com.plcoding.e_book.domain.model.Books.Result) {
        booksDao.upsert(result)
    }

    override suspend fun deleteBooks(result: com.plcoding.e_book.domain.model.Books.Result) {
        booksDao.delete(result)

    }

    override fun selectBooks(): Flow<List<com.plcoding.e_book.domain.model.Books.Result>> {
        return booksDao.getBooks()
    }

    override suspend fun selectBook(id: Int): com.plcoding.e_book.domain.model.Books.Result? {
        return booksDao.getBooks(id)

    }

    override fun getBooksWithDiscount(): Flow<List<com.plcoding.e_book.domain.model.Books.Result>> {
        return booksDao.getBooksWithDiscount()
    }

    override fun getBooksWithCategory(categoryId: Int): Flow<List<com.plcoding.e_book.domain.model.Books.Result>> {
        return booksDao.getBooksWithCategory(categoryId)
    }


}