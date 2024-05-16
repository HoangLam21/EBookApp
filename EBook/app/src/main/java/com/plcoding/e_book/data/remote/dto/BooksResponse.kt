package com.plcoding.e_book.data.remote.dto

import com.plcoding.e_book.domain.model.Books.Result

data class BooksResponse(
    val code: Int,
    val message: String,
    val result: List<Result>
)