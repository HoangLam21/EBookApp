package com.plcoding.e_book.data.remote

import com.plcoding.e_book.data.remote.dto.APIResponse
import com.plcoding.e_book.domain.model.Order.OrderResponse
import com.plcoding.e_book.domain.model.Order.Result
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface OrderApi {
    @POST("order/add")
    suspend fun CreateOrderPost(
        @Header("Authorization") token: String,
        @Body orderPost: Result
    ): Response<APIResponse<OrderResponse>>


}