package com.plcoding.e_book.presentation.book

sealed class DetailsEvent {
    data class UpsertDeleteBooks(val result: com.plcoding.e_book.domain.model.Books.Result): DetailsEvent()

    object RemoveSideEffect :DetailsEvent()

}