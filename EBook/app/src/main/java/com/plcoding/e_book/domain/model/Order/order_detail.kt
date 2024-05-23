package com.plcoding.e_book.domain.model.Order

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


@Parcelize
data class order_detail(
    val id: orderDetailId,
    val avatar: String?,
    val status: Int,
    val price: Int,
    val quantity: Int,
    val discount: Int,
    val total_money: Int,
    val create_at: String?,
    val update_at: String?
) : Parcelable