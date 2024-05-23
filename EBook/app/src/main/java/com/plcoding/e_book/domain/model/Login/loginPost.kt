package com.plcoding.e_book.domain.model.Login

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


data class loginPost(
    val username: String,
    val password: String
)
