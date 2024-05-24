package com.plcoding.e_book.presentation.favourite_book

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

@HiltViewModel
class FavouriteBookViewModel @Inject constructor(
    private val booksUseCases: BooksUseCase
): ViewModel(){
    private val _state = mutableStateOf(FavouriteBookState())
    val state: State<FavouriteBookState> = _state

    init {
        getBook()
    }

    val booksWithDiscount: Flow<List<com.plcoding.e_book.domain.model.Books.Result>> = booksUseCases.getBooksWithDiscount()

    private fun getBook(){
        booksUseCases.selectBooks()
            .onEach {
            _state.value = _state.value.copy(resultitem = it.asReversed())
        }.launchIn(viewModelScope)
    }
}