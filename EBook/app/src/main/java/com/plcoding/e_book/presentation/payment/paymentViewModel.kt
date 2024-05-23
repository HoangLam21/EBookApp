package com.plcoding.e_book.presentation.payment

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.e_book.data.remote.PaymentApi
import kotlinx.coroutines.launch
import retrofit2.Response

class paymentViewModel: ViewModel() {

    private val paymentApi: PaymentApi = com.plcoding.e_book.presentation.payment.RetrofitInstance.api

    fun makePayment(orderId: Int, method: Int) {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.PaymentPost(orderId,method)
                val responseURL = response.body()
                if (response.isSuccessful) {
                    if (responseURL != null) {
                        Log.d("PaymentViewModel", "Payment successful"+responseURL.result.paymentURL)
                    }
                } else {
                    Log.e("PaymentViewModel", "Payment failed: ${response.errorBody()?.string()}")
                }
            } catch (e: Exception) {
                Log.e("PaymentViewModel", "Exception: ${e.message}")
            }
        }
    }

}