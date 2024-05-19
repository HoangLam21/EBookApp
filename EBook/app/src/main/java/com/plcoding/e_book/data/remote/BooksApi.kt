package com.plcoding.e_book.data.remote

import com.plcoding.e_book.data.remote.dto.BooksResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface BooksApi {
    @GET("ebook/all")
    suspend fun getBooks(
        @Query("page") page: Int,
        @Query("source") sources: String,

        ):BooksResponse
}