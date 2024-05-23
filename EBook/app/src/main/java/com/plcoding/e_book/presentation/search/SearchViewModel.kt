package com.plcoding.e_book.presentation.Search

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private  val booksUseCases: BooksUseCase
): ViewModel() {

    private val _state = mutableStateOf(SearchState())
    val state: State<SearchState> = _state

    fun onEvent(event: SearchEvent){
        when (event){
            is SearchEvent.UpdateSearchQuery -> {
                _state.value = state.value.copy(searchQuery = event.searchQuery)
            }
            is SearchEvent.SearchBooks -> {
                searchBooks()
            }

            else -> {}
        }
    }

    private fun searchBooks(){
        val articles = booksUseCases.searchBooks(
            searchQuery = state.value.searchQuery,
            sources = listOf("bbc-news","abc-news", "al-jaz-egl")
        ).cachedIn(viewModelScope)
        _state.value = state.value.copy(resultitem = articles)
    }
}