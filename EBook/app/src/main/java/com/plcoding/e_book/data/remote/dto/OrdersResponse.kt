package com.plcoding.e_book.data.remote.dto

import com.plcoding.e_book.domain.model.Category.Result
import com.plcoding.e_book.domain.model.Order.OrderResponse

data class OrdersResponse (
    val code: Int,
    val message: String,
    val result: List<OrderResponse>
)