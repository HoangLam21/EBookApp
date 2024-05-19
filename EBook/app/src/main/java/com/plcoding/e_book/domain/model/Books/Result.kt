package com.plcoding.e_book.domain.model.Books

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Result(
    val authors: List<Author>,
    val available: Int,
    val bookQuantity: Double,
    val category: Category?,
    val createAt: String,
    val createBy: String,
    val description: String,
    val discount: Int,
    val feedback: Feedback?,
    val galleryManage: List<GalleryManage>,
    val hot: Int,
    @PrimaryKey val id: Int,
    val isebook: Boolean,
    val isvip: Boolean,
    val language: Language,
    val num_pages: Int,
    val price: Int,
    val provider: Provider,
    val publication_date: String,
    val publisher: Publisher,
    val readingsession: Int,
    val title: String,
    val total_pay: Int,
    val updateAt: String,
    val updateBy: String
)