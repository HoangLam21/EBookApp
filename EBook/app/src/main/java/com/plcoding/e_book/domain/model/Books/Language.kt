package com.plcoding.e_book.domain.model.Books

import androidx.room.Entity

@Entity
data class Language(
    val createAt: String,
    val createBy: String,
    val id: Int,
    val language_name: String,
    val updateAt: String,
    val updateBy: String
)