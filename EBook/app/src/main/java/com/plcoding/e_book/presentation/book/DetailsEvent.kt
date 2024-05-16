package com.plcoding.e_book.presentation.book

import com.plcoding.e_book.domain.model.Books.Result

sealed class DetailsEvent {
    data class UpsertDeleteBooks(val result: Result): DetailsEvent()

    object RemoveSideEffect :DetailsEvent()

}