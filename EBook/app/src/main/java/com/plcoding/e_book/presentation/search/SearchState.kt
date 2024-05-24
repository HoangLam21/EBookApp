package com.plcoding.e_book.presentation.Search

import androidx.paging.PagingData
import com.plcoding.e_book.domain.model.Books.Result
import kotlinx.coroutines.flow.Flow

data class SearchState(
    val searchQuery: String = "",
    val resultitem: Flow<PagingData<Result>> ?= null
){

}