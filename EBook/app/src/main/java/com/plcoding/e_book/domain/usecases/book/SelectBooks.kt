package com.plcoding.e_book.domain.usecases.books

import com.plcoding.e_book.domain.repository.BooksResponsitory
import kotlinx.coroutines.flow.Flow

class SelectBooks(
    private val booksRepository: BooksResponsitory

) {

    operator fun  invoke(): Flow<List<com.plcoding.e_book.domain.model.Books.Result>>{
        return booksRepository.selectBooks()
    }
}