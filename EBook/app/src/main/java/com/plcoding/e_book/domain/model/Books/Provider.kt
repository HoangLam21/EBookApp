package com.plcoding.e_book.domain.model.Books

import android.os.Parcelable
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
data class Provider(
    val address: String,
    val createAt: String,
    val createBy: String,
    @PrimaryKey val id: Int?=null,
    val providername: String,
    val representativename: String,
    val updateAt: String,
    val updateBy: String
): Parcelable