package com.plcoding.e_book.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.plcoding.e_book.domain.model.Books.Result


@Database(entities = [Result::class], version = 1)
@TypeConverters(BooksTypeConvertor::class)
abstract class BooksDatabse: RoomDatabase() {

    abstract val booksDao: BooksDao
}