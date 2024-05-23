package com.plcoding.e_book.data.remote

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ResponseURLPayment(
    val id: Int,
    val customerId: Int,
    val order_id: Int,
    val method_payment: Int,
    val payment_status: Boolean,
    val vnpaycode: String,
    val createAt: String,
    val paymentURL: String,
): Parcelable
