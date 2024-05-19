package com.plcoding.e_book.domain.model.Books

import androidx.room.Entity


data class Feedback(
    val createAt: String,
    val createBy: String,
    val feedback_comment: String,
    val id: Int,
    val rating: Int,
    val updateAt: String,
    val updateBy: String
)