//package com.plcoding.e_book.data.remote
//
//import com.plcoding.e_book.util.Constants.USER_TOKEN
//import retrofit2.Response
//import retrofit2.http.Body
//import retrofit2.http.Header
//import retrofit2.http.PATCH
//import retrofit2.http.Query
//
//interface UserUpdateApi {
//    @PATCH("customer/update/info/{id}")
//    suspend fun updateUserInf(
//        @Header("Authorization") token: String = USER_TOKEN,
//        @Query("id") userId: Int,
//        @Body customerInformationRequest: CustomerInformationRequest
//    ): Response<CustomerInformationRequest>
//}