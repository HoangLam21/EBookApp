package com.plcoding.e_book.domain.usecases.mybook

import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.repository.BooksResponsitory
import com.plcoding.e_book.domain.repository.MyBookRepository
import kotlinx.coroutines.flow.Flow

class SelectMyBooks  (
    private val myBookRepository: MyBookRepository
) {

    operator fun  invoke(): Flow<List<Result>> {
        return myBookRepository.selectMyBooks()
    }
}