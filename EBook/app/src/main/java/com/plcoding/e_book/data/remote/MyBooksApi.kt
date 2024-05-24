package com.plcoding.e_book.data.remote

import com.plcoding.e_book.data.remote.dto.BooksResponse
import com.plcoding.e_book.util.Constants.USER_TOKEN
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query

interface MyBooksApi {
    @GET("ebook/mine")
    suspend fun getMyBooks(
        @Query("page") page: Int,
        @Query("source") sources: String,
        @Header("Authorization") token: String = USER_TOKEN
        ): BooksResponse
}