package com.plcoding.e_book.data.remote.dto

data class Result(
    val createAt: String,
    val createBy: String,
    val hot: Int,
    val id: Int,
    val name: String,
    val updateAt: String,
    val updateBy: String
)