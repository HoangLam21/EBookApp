package com.plcoding.e_book.domain.model.Category

import com.plcoding.e_book.data.remote.CategoryApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: CategoryApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://bookstorebackend-production-7f54.up.railway.app/BookStore/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(CategoryApi::class.java)
    }
}