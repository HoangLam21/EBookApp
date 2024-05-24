package com.plcoding.e_book.presentation.favourite_book


data class FavouriteBookState(
    val resultitem: List<com.plcoding.e_book.domain.model.Books.Result> = emptyList()
)
