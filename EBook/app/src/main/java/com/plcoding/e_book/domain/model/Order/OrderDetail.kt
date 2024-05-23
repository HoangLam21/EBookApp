package com.plcoding.e_book.domain.model.Order

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class OrderDetail(
    val book_id: Int,
    val quantity: Int
): Parcelable
