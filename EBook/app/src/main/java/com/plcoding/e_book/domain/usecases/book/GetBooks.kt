package com.plcoding.e_book.domain.usecases.books

import androidx.paging.PagingData
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.repository.BooksResponsitory
import kotlinx.coroutines.flow.Flow

class GetBooks(
    private val booksRepository: BooksResponsitory
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Result>> {
        return booksRepository.getBooks(sources = sources)
    }
}