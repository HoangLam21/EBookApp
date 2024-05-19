package com.plcoding.e_book.domain.usecases.books

import com.plcoding.e_book.domain.repository.BooksResponsitory
import kotlinx.coroutines.flow.Flow
import com.plcoding.e_book.domain.model.Books.Result

class SelectBooks(
    private val booksRepository: BooksResponsitory

) {

    operator fun  invoke(): Flow<List<Result>>{
        return booksRepository.selectBooks()
    }
}