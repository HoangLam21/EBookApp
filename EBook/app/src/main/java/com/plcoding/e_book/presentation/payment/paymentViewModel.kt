package com.plcoding.e_book.presentation.payment

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.e_book.domain.model.Login.Result
import com.plcoding.e_book.domain.model.Login.loginPost
import com.plcoding.e_book.domain.model.Register.registerPost
import com.plcoding.e_book.domain.model.RetrofitInstance
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class paymentViewModel @Inject constructor(
    private val booksUseCase: BooksUseCase
): ViewModel() {

    private val _login = MutableLiveData<String?>()
    val login: LiveData<String?> = _login
    fun createReading(account: Result) {

        viewModelScope.launch {
            try {
                val response = com.plcoding.e_book.domain.model.Login.RetrofitInstance.api.LoginPost(account)
                val responseAPI = response.body()
                if (response.isSuccessful) {
                    if (responseAPI != null) {
                        Log.d("LoginViewModel", "Đăng nhập thành công, Người dùng: ${responseAPI.message}")
                    }
                    if (responseAPI != null) {
                        _login.value = responseAPI.message
                    }

                } else {
                    Log.e("OrderViewModel", "Failed to create order: ${response.errorBody()?.string()}")
                }
            } catch (e: Exception) {
                Log.e("OrderViewModel", "Exception: ${e.message}")
            }
        }
    }

    private val _register = MutableLiveData<String?>()
    val register: LiveData<String?> = _register

    fun createAccount(account: registerPost) {

        viewModelScope.launch {
            try {
                val response = com.plcoding.e_book.domain.model.Register.RetrofitInstance.api.LoginPost(account)
                val responseAPI = response.body()
                if (response.isSuccessful) {
                    if (responseAPI != null) {
                        Log.d("RegisterViewModel", "Đăng nhập thành công, Người dùng: ${responseAPI.message}")
                    }
                    if (responseAPI != null) {
                        _register.value = responseAPI.message
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