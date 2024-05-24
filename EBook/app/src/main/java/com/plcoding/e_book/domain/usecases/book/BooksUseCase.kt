package com.plcoding.e_book.domain.usecases.book

import com.plcoding.e_book.domain.usecases.books.DeleteBooks
import com.plcoding.e_book.domain.usecases.books.GetBooks
import com.plcoding.e_book.domain.usecases.books.SelectBook
import com.plcoding.e_book.domain.usecases.books.SelectBooks
import com.plcoding.e_book.domain.usecases.books.UpsertBooks

data class BooksUseCase(
    val getBooks: GetBooks,
    val searchBooks: SearchBooks,
    val upsertBooks: UpsertBooks,
    val deleteBooks: DeleteBooks,
    val selectBooks: SelectBooks,
    val selectBook: SelectBook,
    val getBooksWithDiscount: GetBooksWithDiscount,
    val getBooksWithCategory: GetBooksWithCategory
)
