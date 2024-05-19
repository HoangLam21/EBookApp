package com.plcoding.e_book.domain.model.Books

import androidx.room.Entity


data class GalleryManage(
    val createAt: String,
    val createBy: String,
    val description: String,
    val id: Int,
    val thumbnail: String,
    val updateAt: String,
    val updateBy: String
)