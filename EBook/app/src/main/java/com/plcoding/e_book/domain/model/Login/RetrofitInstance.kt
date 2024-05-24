package com.plcoding.e_book.domain.model.Login

import com.plcoding.e_book.data.remote.LoginApi
import com.plcoding.e_book.data.remote.OrderApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: LoginApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://bookstorebackend-production-7f54.up.railway.app/BookStore/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(LoginApi::class.java)
    }

}