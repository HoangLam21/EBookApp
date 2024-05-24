package com.plcoding.e_book.data.remote

import androidx.paging.PagingSource
import androidx.paging.PagingState

class CategoryPagingSource(
    private val categoryApi: CategoryApi,
    private val sources: String
): PagingSource<Int, com.plcoding.e_book.domain.model.Category.Result>() {

    private var totalCategorysCount = 0;
    override suspend fun load(params: LoadParams<Int>): LoadResult<Int,  com.plcoding.e_book.domain.model.Category.Result> {
        val page = params.key?: 1
        return try {
            val categoryResponse = categoryApi.getCategory(sources = sources, page = page)
            totalCategorysCount += categoryResponse.result.size
            val books = categoryResponse.result.distinctBy { it.id }
            LoadResult.Page(
                data = books,
                nextKey = if(totalCategorysCount == 12) null else page + 1,
                prevKey = null
            )
        }catch (e:Exception){
            e.printStackTrace()
            LoadResult.Error(
                throwable = e
            )
        }
    }

    override fun getRefreshKey(state: PagingState<Int, com.plcoding.e_book.domain.model.Category.Result>): Int? {
        return state.anchorPosition?.let { anchorPosition ->
            val anchorPage = state.closestPageToPosition(anchorPosition)
            anchorPage?.prevKey?.plus(1)?: anchorPage?.nextKey?.minus(1)

        }
    }
}