package com.plcoding.e_book.domain.model.Order

import android.os.Parcelable
import androidx.room.Entity
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class Result(
    val fullname: String,
    val order_note: String,
    val address:String,
    val order_details:List<OrderDetail?>
): Parcelable
