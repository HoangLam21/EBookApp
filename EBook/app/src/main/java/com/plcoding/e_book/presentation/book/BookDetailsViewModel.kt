package com.plcoding.e_book.presentation.book

import android.annotation.SuppressLint
import android.content.Context

import android.content.Intent
import android.net.Uri
import android.util.Log
import androidx.activity.viewModels
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContextCompat.startActivity
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.plcoding.e_book.data.remote.PaymentApi
import com.plcoding.e_book.domain.model.Order.OrderDetail
import com.plcoding.e_book.domain.model.Order.Result
import com.plcoding.e_book.domain.model.Order.RetrofitInstance
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import com.plcoding.e_book.presentation.books_navigation.navigateToOrder
import com.plcoding.e_book.presentation.payment.paymentViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject


@HiltViewModel
class BookDetailsViewModel @Inject constructor(
    private val booksUseCase: BooksUseCase
): ViewModel() {
    var sideEffect by mutableStateOf<String?>(null)
        private set

    fun onEvent(event: DetailsEvent){
        when(event){
            is DetailsEvent.UpsertDeleteBooks -> {
                viewModelScope.launch {
                    val bookitem = event.result.id?.let { booksUseCase.selectBook(it) }
                    if(bookitem==null){
                        upserBookResponseItem(event.result)
                    }else{
                        deleteBookResponseItem(event.result)
                    }
                }
            }

            is DetailsEvent.RemoveSideEffect ->{
                sideEffect = null
            }
        }
    }

    val books = booksUseCase.getBooks(
        sources = listOf("bbc-news","abc-news", "al-jaz-egl")
    ).cachedIn(viewModelScope)

    private suspend fun deleteBookResponseItem(result: com.plcoding.e_book.domain.model.Books.Result) {
        Log.d("da co delete","upsert")

        booksUseCase.deleteBooks(result = result)
        Log.d("da co delete","upsert")

        sideEffect = "Book Deleted"
    }

    private suspend fun upserBookResponseItem(result: com.plcoding.e_book.domain.model.Books.Result) {
        Log.d("da co delete","upsert")

        booksUseCase.upsertBooks(result= result)
        Log.d("da co upsert","upsert")
        sideEffect = "Book Saved"

    }

    private val _orderId = MutableLiveData<Int?>()
    val orderId: LiveData<Int?> = _orderId

    private val _paymentUrl = MutableLiveData<String?>()
    val paymentUrl: LiveData<String?> = _paymentUrl




    fun makePayment(orderId: Int, method: Int) {
        viewModelScope.launch {
            try {
                val response = com.plcoding.e_book.presentation.payment.RetrofitInstance.api.PaymentPost(orderId,method)
                val responseURL = response.body()
                if (response.isSuccessful) {
                    if (responseURL != null) {
                        Log.d("PaymentViewModel", "Payment successful"+responseURL.result.paymentURL)
                        val URL=responseURL.result.paymentURL

                        _paymentUrl.value = responseURL.result.paymentURL


                        val intent = Intent(Intent.ACTION_VIEW, Uri.parse(URL))
                        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK

                    }
                } else {
                    Log.e("PaymentViewModel", "Payment failed: ${response.errorBody()?.string()}")
                }
            } catch (e: Exception) {
                Log.e("PaymentViewModel", "Exception: ${e.message}")
            }
        }
    }


    fun createOrder(idBook: Int){
        val orderDetails = listOf(OrderDetail(book_id = idBook, quantity = 1))
        val token = "Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJjb20uYXV0aGVudGljYXRpb24iLCJzdWIiOiJiZWhlbzEyIiwiZXhwIjoxNzE2NDU5ODMzLCJpYXQiOjE3MTY0NTYyMzMsInNjb3BlIjoiQ1VTVE9NRVIgR0VUX01ZX1BBWU1FTlRTIEdFVF9NWV9CT09LUyBDQU5DTEVfT1JERVIgQ1JFQVRFX09SREVSIn0.yqsi6JwMEOnWdddLLCmbUSH-W7fo76MbPrYiHJSzjYU"
        val order = Result(
            fullname = "John Doe",
            order_note = "Please deliver between 9-12 AM",
            address = "123 Main Street",
            order_details = orderDetails
        )
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.CreateOrderPost(token, order)
                val responseAPI = response.body()
                if (response.isSuccessful) {
                    if (responseAPI != null) {
                        val orderId = responseAPI.result.id
                        _orderId.value = orderId
                        makePayment(
                            orderId = orderId,
                            method = 2
                        )
                    }
                } else {
                    Log.e("OrderViewModel", "Failed to create order: ${response.errorBody()?.string()}")
                }
            } catch (e: Exception) {
                Log.e("OrderViewModel", "Exception: ${e.message}")
            }

        }
    }

}