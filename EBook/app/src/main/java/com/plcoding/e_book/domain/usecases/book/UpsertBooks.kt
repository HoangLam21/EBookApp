package com.plcoding.e_book.domain.usecases.books

import com.plcoding.e_book.domain.repository.BooksResponsitory

class UpsertBooks(
    private val booksResponsitory: BooksResponsitory

) {

    suspend operator fun  invoke(result: com.plcoding.e_book.domain.model.Books.Result){
        booksResponsitory.upsertBooks(result)
    }
}