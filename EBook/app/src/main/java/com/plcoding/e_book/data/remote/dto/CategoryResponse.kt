package com.plcoding.e_book.data.remote.dto

import com.plcoding.e_book.domain.model.Category.Result

data class CategoryResponse(
    val code: Int,
    val message: String,
    val result: List<Result>
)