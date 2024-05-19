package com.plcoding.e_book.domain.model.Books

import androidx.room.Entity


data class Category(
    val avatar: String,
    val createAt: String,
    val createBy: String,
    val hot: Int,
    val id: Int,
    val name: String,
    val updateAt: String,
    val updateBy: String
)