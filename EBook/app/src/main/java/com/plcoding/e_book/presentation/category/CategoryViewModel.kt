package com.plcoding.e_book.presentation.category

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import com.plcoding.e_book.domain.usecases.category.CategoryUseCase
import com.plcoding.e_book.presentation.book.DetailsEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
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

}