package com.plcoding.e_book.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.cachedIn
import com.plcoding.e_book.domain.usecases.book.BooksUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val booksUseCases: BooksUseCase
): ViewModel() {

    val books = booksUseCases.getBooks(
        sources = listOf("bbc-news","abc-news", "al-jaz-egl")
    ).cachedIn(viewModelScope)
}