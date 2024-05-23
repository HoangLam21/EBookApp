package com.plcoding.e_book.data.remote.dto

data class APIResponseObj<T>(
    val code:Int,
    val message:String,
    val result: T
)