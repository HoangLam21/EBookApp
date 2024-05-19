package com.plcoding.e_book.domain.model.Books

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
data class Feedback(
    val createAt: String,
    val createBy: String,
    val feedback_comment: String,
    @PrimaryKey val id: Int? = null,
    val rating: Int,
    val updateAt: String,
    val updateBy: String
): Parcelable