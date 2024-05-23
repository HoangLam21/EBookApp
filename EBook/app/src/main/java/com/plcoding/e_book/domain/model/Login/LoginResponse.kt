package com.plcoding.e_book.domain.model.Login

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class LoginResponse(
    val username:String,
    val token: String
):Parcelable
