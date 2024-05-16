package com.plcoding.e_book.domain.usecases.books

import com.plcoding.e_book.data.local.BooksDao
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.repository.BooksResponsitory

class UpsertBooks(
    private val booksResponsitory: BooksResponsitory

) {

    suspend operator fun  invoke(result: Result){
        booksResponsitory.upsertBooks(result)
    }
}