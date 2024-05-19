package com.plcoding.e_book.presentation.category

sealed class CategoryEvent {
    object RemoveSideEffect : CategoryEvent()
}