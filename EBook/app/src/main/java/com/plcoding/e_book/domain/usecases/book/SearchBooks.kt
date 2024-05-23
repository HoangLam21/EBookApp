package com.plcoding.e_book.domain.usecases.book

import androidx.paging.PagingData
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.repository.BooksResponsitory
import kotlinx.coroutines.flow.Flow

class SearchBooks(
    private val booksRepository: BooksResponsitory
) {
    operator fun invoke(searchQuery: String, sources: List<String>): Flow<PagingData<Result>> {
        return booksRepository.searchBoooks(searchQuery = searchQuery,sources = sources)
    }
}