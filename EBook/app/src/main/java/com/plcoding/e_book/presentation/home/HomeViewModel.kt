package com.plcoding.e_book.presentation.home

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import com.plcoding.e_book.domain.usecases.category.CategoryUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val bookUseCases: BooksUseCase,
    private val categoryUseCases: CategoryUseCase
):ViewModel(){

    val book=bookUseCases.getBooks(

        sources = listOf("bcc-news", "abc-news", "al-jazeera-english")
    ).cachedIn(viewModelScope)

    val category = categoryUseCases.getCategory(
        sources = listOf("bcc-news", "abc-news", "al-jazeera-english")
    ).cachedIn(viewModelScope)


    val booksWithDiscount: Flow<List<Result>> = bookUseCases.getBooksWithDiscount()


}