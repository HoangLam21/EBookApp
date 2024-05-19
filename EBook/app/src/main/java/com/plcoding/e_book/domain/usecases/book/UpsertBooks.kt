package com.plcoding.e_book.domain.usecases.books

import com.plcoding.e_book.domain.repository.BooksResponsitory
import com.plcoding.e_book.domain.model.Books.Result

class UpsertBooks(
    private val booksResponsitory: BooksResponsitory

) {

    suspend operator fun  invoke(result: Result){
        booksResponsitory.upsertBooks(result)
    }
}