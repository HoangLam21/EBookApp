package com.plcoding.e_book.domain.model.Login

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Result(
    val username: String,
    val password: String
):Parcelable
