package com.plcoding.e_book.data.remote

import com.plcoding.e_book.data.remote.dto.CategoryResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface CategoryApi {
    @GET("category/all")
    suspend fun getCategory(
        @Query("page") page: Int,
        @Query("source") sources: String,

        ): CategoryResponse
}