package com.plcoding.e_book.domain.model.Order

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize






@Parcelize
data class OrderResponse (
    val id: Int,
    val customerId: Int,
    val fullname: String,
    val order_note: String,
    val price: Int,
    val total_dis: Int,
    val status_trans: Int,
    val total_price: Int,
    val address: String,
    val order_detail: List<order_detail>,
    val method_payment: Int,
    val createAt: String,
    val updateAt: String,
    val createBy: String,
    val updateBy: String
) : Parcelable