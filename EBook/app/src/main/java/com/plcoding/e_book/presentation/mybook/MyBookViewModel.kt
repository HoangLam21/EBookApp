package com.plcoding.e_book.presentation.mybook

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.plcoding.e_book.domain.usecases.mybook.MyBookUseCase
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class MyBookViewModel @Inject constructor(
    private val myBookUseCase: MyBookUseCase
):ViewModel() {

    val mybooks = myBookUseCase.getMyBooks(
        sources = listOf("hahahahahah","hahahahahahahahhah")
    ).cachedIn(viewModelScope)

//    private val _state = mutableStateOf(MyBookState())
//    val state: State<MyBookState> = _state
//
//    init {
//        getMyBooks()
//    }
//
//    private fun getMyBooks(){
//        myBookUseCase.selectMyBooks().onEach {
//            _state.value = _state.value.copy(mybooksitem = it.asReversed())
//        }.launchIn(viewModelScope)
//    }
}