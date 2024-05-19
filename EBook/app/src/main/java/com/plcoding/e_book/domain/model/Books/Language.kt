package com.plcoding.e_book.domain.model.Books

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Language(
    val createAt: String,
    val createBy: String,
    val id: Int,
    val language_name: String,
    val updateAt: String,
    val updateBy: String
):Parcelable