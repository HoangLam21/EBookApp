package com.plcoding.e_book.domain.model.Register

import com.plcoding.e_book.data.remote.LoginApi
import com.plcoding.e_book.data.remote.RegisterApi
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstance {
    val api: RegisterApi by lazy {
        Retrofit.Builder()
            .baseUrl("https://bookstorebackend-production-7f54.up.railway.app/BookStore/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RegisterApi::class.java)
    }

}