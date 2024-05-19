package com.plcoding.e_book.presentation.favourite_book
import com.plcoding.e_book.domain.model.Books.Result


data class FavouriteBookState(
    val resultitem: List<Result> = emptyList()
)
