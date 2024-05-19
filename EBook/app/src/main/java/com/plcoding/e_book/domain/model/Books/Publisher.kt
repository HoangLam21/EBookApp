package com.plcoding.e_book.domain.model.Books

import android.os.Parcelable
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
data class Publisher(
    val createAt: String,
    val createBy: String,
    @PrimaryKey val id: Int? = null,
    val publisher_name: String,
    val updateAt: String,
    val updateBy: String
):Parcelable