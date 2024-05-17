package com.plcoding.e_book.data.remote.dto

data class CategoryResponse(
    val code: Int,
    val message: String,
    val result: List<Result>
)