package com.plcoding.e_book.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState
import com.plcoding.e_book.domain.model.Books.Result

class SearchBooksPagingSource (
    private val booksApi: BooksApi,
    private val searchQuery: String,
    private val sources: String
): PagingSource<Int, Result>() {
    override fun getRefreshKey(state: PagingState<Int, Result>): Int? {
        return state.anchorPosition?.let{ anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1)?: anchorPage?.nextKey?.minus(1)
        }
    }

    private var totalBookCount = 0
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int, Result> {
        val page = params.key ?:1
        return try {
            val booksRepository =
                booksApi.searchBooks(searchQuery = searchQuery, sources=sources, page = page)
            totalBookCount += booksRepository.result.size
            val articles = booksRepository.result.distinctBy {it.title}
            LoadResult.Page (
                data = articles,
                nextKey = if (totalBookCount == 400) null else page + 1,
                prevKey = null
            )
        } catch (e: Exception) {
            e.printStackTrace()
            LoadResult.Error(
                throwable = e
            )
        }
    }
}