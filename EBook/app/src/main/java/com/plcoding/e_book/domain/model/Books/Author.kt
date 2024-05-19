package com.plcoding.e_book.domain.model.Books

import android.os.Parcelable
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
data class Author(
    val author_name: String,
    val createAt: String,
    val createBy: String,
    @PrimaryKey val id: Int? = null,
    val updateAt: String,
    val updateBy: String
):Parcelable