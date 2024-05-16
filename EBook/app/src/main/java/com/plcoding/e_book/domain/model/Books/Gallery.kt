package com.plcoding.e_book.domain.model.Books

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
data class Gallery(
    @PrimaryKey val book_id: Int? = null,
    val thumbnail: String,
    val description: String
): Parcelable
