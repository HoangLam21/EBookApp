package com.plcoding.e_book.presentation.booksWithCategory

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.model.Category.RetrofitInstance
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BooksWithCategoryViewModel @Inject constructor(
    private val booksUseCase: BooksUseCase
): ViewModel() {
    private val _booksByCategory = MutableStateFlow<List<Result>>(emptyList())
    val booksByCategory: StateFlow<List<Result>> = _booksByCategory
    fun getBooksByCategory(categoryId:Int) {
        viewModelScope.launch {
            try {
                val response = RetrofitInstance.api.getBooksByCategory(categoryId)
                val responseAPI = response.body()
                if (response.isSuccessful) {
                    if (responseAPI != null) {
                        Log.d("OrderViewModel", "Order created successfully, Order ID: ${responseAPI.result}")
                        _booksByCategory.value = (responseAPI.result ?: emptyList()) as List<Result>

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