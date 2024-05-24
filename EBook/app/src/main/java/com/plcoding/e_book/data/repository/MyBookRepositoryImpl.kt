package com.plcoding.e_book.data.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.plcoding.e_book.data.local.BooksDao
import com.plcoding.e_book.data.remote.BooksApi
import com.plcoding.e_book.data.remote.MyBookPagingSource
import com.plcoding.e_book.data.remote.MyBooksApi
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.repository.MyBookRepository
import kotlinx.coroutines.flow.Flow

class MyBookRepositoryImpl(
    private val myBooksApi: MyBooksApi,
    private val booksDao: BooksDao


):MyBookRepository {

    override fun getMyBooks(sources: List<String>): Flow<PagingData<Result>> {
        return Pager(
            config = PagingConfig(pageSize = 10),
            pagingSourceFactory = {
                MyBookPagingSource(
                    myBooksApi = myBooksApi,
                    sources = sources.joinToString(separator = ","),
                )
            }
        ).flow
    }
    override fun selectMyBooks(): Flow<List<Result>> {
        return booksDao.getBooks()

    }
}