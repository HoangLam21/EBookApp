package com.plcoding.e_book.domain.model.Books

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize


@Parcelize
@Entity
data class Result(
    val authors: List<Author?>,
    val available: Int,
    val bookQuantity: Int,
    val createAt: String,
    val createBy: String,
    val description: String,
    val discount: Int,
    val galleryManage: List<Gallery?>,
    val hot: Int,
    @PrimaryKey val id: Int? = null,
    val language: Language?,
    val num_pages: Int,
    val price: Int,
    val provider: Provider?,
    val publication_date: String,
    val publisher: Publisher?,
    val title: String,
    val total_pay: Int,
    val updateAt: String,
    val updateBy: String
): Parcelable