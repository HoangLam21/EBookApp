package com.plcoding.e_book.domain.model.Books

import android.os.Parcelable
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
data class GalleryManage(
    val createAt: String,
    val createBy: String,
    val description: String,
    @PrimaryKey val id: Int? = null,
    val thumbnail: String,
    val updateAt: String,
    val updateBy: String
):Parcelable