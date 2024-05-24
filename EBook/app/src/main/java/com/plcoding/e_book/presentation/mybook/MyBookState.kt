package com.plcoding.e_book.presentation.mybook

import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.plcoding.e_book.domain.model.Books.Result

data class MyBookState(
    val mybookitem: LazyPagingItems<Result>,
   // val mybooksitem: List<Result> = emptyList()
)
