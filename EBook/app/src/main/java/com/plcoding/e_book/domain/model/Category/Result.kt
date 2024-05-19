package com.plcoding.e_book.domain.model.Category

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Result(
    val avatar: String,
    val createAt: String,
    val createBy: String,
    val hot: Int,
    @PrimaryKey val id: Int,
    val name: String,
    val updateAt: String,
    val updateBy: String
)