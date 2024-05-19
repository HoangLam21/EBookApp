package com.plcoding.e_book.domain.model.Books

data class Provider(
    val address: String,
    val createAt: String,
    val createBy: String,
    val id: Int,
    val providername: String,
    val representativename: Any,
    val updateAt: String,
    val updateBy: String
)