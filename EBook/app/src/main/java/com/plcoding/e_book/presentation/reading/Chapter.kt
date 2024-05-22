package com.plcoding.e_book.presentation.reading

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Chapter(
    @PrimaryKey var id: Int,
    var title: String,
    var content: String,
    var bookId: Int,
)
