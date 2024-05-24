package com.plcoding.e_book.presentation.payment

import com.plcoding.e_book.data.remote.OrderApi
import com.plcoding.e_book.data.remote.PaymentApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: PaymentApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://bookstorebackend-production-7f54.up.railway.app/BookStore/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(PaymentApi::class.java)
    }
}