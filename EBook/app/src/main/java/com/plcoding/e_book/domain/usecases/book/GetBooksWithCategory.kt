package com.plcoding.e_book.domain.usecases.book

import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.repository.BooksResponsitory
import kotlinx.coroutines.flow.Flow

class GetBooksWithCategory (
    private val booksRepository: BooksResponsitory

) {

    operator fun  invoke(categoryId:Int): Flow<List<Result>> {
        return booksRepository.getBooksWithCategory(categoryId)
    }
}