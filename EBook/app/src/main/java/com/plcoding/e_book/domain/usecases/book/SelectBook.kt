package com.plcoding.e_book.domain.usecases.books

import com.plcoding.e_book.domain.repository.BooksResponsitory

class SelectBook(
    private val booksRepository: BooksResponsitory
) {

    suspend operator fun  invoke(id: Int): com.plcoding.e_book.domain.model.Books.Result?{
        return booksRepository.selectBook(id)
    }
}