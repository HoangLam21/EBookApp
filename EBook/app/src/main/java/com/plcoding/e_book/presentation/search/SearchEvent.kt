package com.plcoding.e_book.presentation.Search

sealed class SearchEvent {
    data class UpdateSearchQuery(val searchQuery: String): SearchEvent()

    object SearchBooks: SearchEvent()
}