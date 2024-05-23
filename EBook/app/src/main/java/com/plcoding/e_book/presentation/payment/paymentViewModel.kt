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
                val response: Response<Void> = paymentApi.PaymentPost(orderId, method)
                if (response.isSuccessful) {
                    Log.d("PaymentViewModel", "Payment successful")
                } else {
                    Log.e("PaymentViewModel", "Payment failed: ${response.errorBody()?.string()}")
                }
            } catch (e: Exception) {
                Log.e("PaymentViewModel", "Exception: ${e.message}")
            }
        }
    }

}