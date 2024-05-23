package com.plcoding.e_book.data.remote

import com.plcoding.e_book.domain.model.Order.Result
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST
import retrofit2.http.Query

interface PaymentApi {
    @POST("payment/payfor")
    suspend fun PaymentPost(
        @Query("order_id") orderId:Int,
        @Query("method") method: Int
    ): Response<Void>
}