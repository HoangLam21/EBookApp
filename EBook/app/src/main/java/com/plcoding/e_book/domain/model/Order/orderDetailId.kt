package com.plcoding.e_book.domain.model.Order

import android.os.Parcelable
import kotlinx.parcelize.Parcelize




@Parcelize
data class orderDetailId(
    val order_id: Int,
    val book_id: Int
) : Parcelable
