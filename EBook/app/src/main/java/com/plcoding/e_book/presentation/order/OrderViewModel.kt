package com.plcoding.e_book.presentation.order

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.e_book.domain.model.Order.OrderDetail
import com.plcoding.e_book.domain.model.Order.Result
import com.plcoding.e_book.domain.model.Order.RetrofitInstance
import kotlinx.coroutines.launch

class OrderViewModel : ViewModel(){

//    init {
//        val token = "eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJjb20uYXV0aGVudGljYXRpb24iLCJzdWIiOiJiZWhlbzEyIiwiZXhwIjoxNzE2MzU3OTMxLCJpYXQiOjE3MTYzNTQzMzEsInNjb3BlIjoiQ1VTVE9NRVIgR0VUX01ZX0JPT0tTIENSRUFURV9PUkRFUiBDQU5DTEVfT1JERVIgR0VUX01ZX1BBWU1FTlRTIn0.vBVy4cEvMdY3AR5tQPkfwuGSzyatgnyxxjP9PyUadBY"
//        val orderDetails = listOf(OrderDetail(book_id = 4, quantity = 2)) // Tạo danh sách chi tiết đơn hàng
//        val order = Result(
//            fullname = "John Doe",
//            order_note = "Please deliver between 9-12 AM",
//            address = "123 Main Street",
//            order_details = orderDetails
//        )
//        createOrder(token, order)
//    }
fun createOrder(token: String, order: Result) {
    viewModelScope.launch {
        try {
            val response = RetrofitInstance.api.CreateOrderPost(token, order)
            if (response.isSuccessful) {
                // Đã nhận được dữ liệu orderResponse, xử lý dữ liệu ở đây
                Log.d("OrderViewModel", "Order created successfully, Order ID: ${response.body()}")
            } else {
                Log.e("OrderViewModel", "Failed to create order: ${response.errorBody()?.string()}")
            }
        } catch (e: Exception) {
            Log.e("OrderViewModel", "Exception: ${e.message}")
        }
    }
}
}