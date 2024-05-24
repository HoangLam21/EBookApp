package com.plcoding.e_book.domain.usecases.mybook

import androidx.paging.PagingData
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.domain.repository.BooksResponsitory
import com.plcoding.e_book.domain.repository.MyBookRepository
import kotlinx.coroutines.flow.Flow

class GetMyBooks(
    val myBookRepository: MyBookRepository
) {
    operator fun invoke(sources: List<String>): Flow<PagingData<Result>> {
        return myBookRepository.getMyBooks(sources = sources)
    }
}