package com.plcoding.e_book.domain.model

import com.plcoding.e_book.data.remote.OrderApi
import com.plcoding.e_book.domain.model.Login.loginPost
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: OrderApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://bookstorebackend-production-7f54.up.railway.app/BookStore/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(OrderApi::class.java)
    }
}