package com.plcoding.e_book.data.remote

import com.plcoding.e_book.data.remote.dto.APIResponseObj
import com.plcoding.e_book.domain.model.Login.LoginResponse
import com.plcoding.e_book.domain.model.Register.Result
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.POST

interface RegisterApi {
    @POST("customer/mobile-register")
    suspend fun LoginPost(
        @Body orderPost: com.plcoding.e_book.domain.model.Register.registerPost
    ): Response<APIResponseObj<Result>>
}