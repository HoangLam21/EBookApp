package com.plcoding.e_book.domain.model.Books

import android.os.Parcelable
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
data class Category(
    val avatar: String,
    val createAt: String,
    val createBy: String,
    val hot: Int,
    @PrimaryKey val id: Int? = null,
    val name: String,
    val updateAt: String,
    val updateBy: String
):Parcelable