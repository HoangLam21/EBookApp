package com.plcoding.e_book.data.remote.dto

import com.plcoding.e_book.domain.model.Register.Result

data class registerResponse(
    val code: Int,
    val message: String,
    val result: Result
)