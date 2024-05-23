package com.plcoding.e_book.data.remote.dto

data class APIResponse<T>(
    val code:Int,
    val message:String,
    val result:List <T>
)