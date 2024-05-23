package com.plcoding.e_book.data.remote

import com.plcoding.e_book.data.remote.dto.APIResponseObj
import com.plcoding.e_book.domain.model.Login.LoginResponse
import com.plcoding.e_book.domain.model.Login.loginPost
import com.plcoding.e_book.domain.model.Order.OrderResponse
import com.plcoding.e_book.domain.model.Order.Result
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

interface LoginApi {
    @POST("auth/login")
    suspend fun LoginPost(
        @Body orderPost: com.plcoding.e_book.domain.model.Login.Result
    ): Response<APIResponseObj<LoginResponse>>
}