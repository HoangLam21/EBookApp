package com.plcoding.e_book.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState

class BooksPagingSource(
    private val booksApi: BooksApi,
    private val sources: String
): PagingSource<Int, com.plcoding.e_book.domain.model.Books.Result>() {

    private var totalBooksCount = 0;
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, com.plcoding.e_book.domain.model.Books.Result> {
        val page = params.key?: 1
        return try {
            val booksResponse = booksApi.getBooks(sources = sources, page = page)
            totalBooksCount += booksResponse.result.size
            val books = booksResponse.result.distinctBy { it.id }
            LoadResult.Page(
                data = books,
                nextKey = if(totalBooksCount == 400) null else page + 1,
                prevKey = null
            )
        }catch (e:Exception){
            e.printStackTrace()
            LoadResult.Error(
                throwable = e
            )
        }
    }

    override fun getRefreshKey(state: PagingState<Int, com.plcoding.e_book.domain.model.Books.Result>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1)?: anchorPage?.nextKey?.minus(1)

        }
    }
}