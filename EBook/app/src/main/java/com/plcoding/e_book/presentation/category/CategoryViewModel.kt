package com.plcoding.e_book.presentation.category

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import com.plcoding.e_book.domain.usecases.category.CategoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.filterNotNull
import kotlinx.coroutines.flow.flatMapLatest
import javax.inject.Inject

@HiltViewModel
class CategoryViewModel  @Inject constructor(
    private val bookUseCases: BooksUseCase,
    private val categoryUseCases: CategoryUseCase
): ViewModel(){

    var sideEffect by mutableStateOf<String?>(null)
        private set

    fun onEvent(event: CategoryEvent){
        when(event){


            is CategoryEvent.RemoveSideEffect ->{
                sideEffect = null
            }
        }
    }

    val book=bookUseCases.getBooks(

        sources = listOf("bcc-news", "abc-news", "al-jazeera-english")
    ).cachedIn(viewModelScope)

    val category = categoryUseCases.getCategory(
        sources = listOf("bcc-news", "abc-news", "al-jazeera-english")
    ).cachedIn(viewModelScope)

    fun getBooksByCategory(categoryId: Int): Flow<List<com.plcoding.e_book.domain.model.Books.Result>> {
        return bookUseCases.getBooksWithCategory(categoryId)
    }



}