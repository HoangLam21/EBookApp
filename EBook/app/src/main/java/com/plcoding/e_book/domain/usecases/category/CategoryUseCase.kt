package com.plcoding.e_book.domain.usecases.category

import com.plcoding.e_book.domain.usecases.books.SelectBook
import com.plcoding.e_book.domain.usecases.books.SelectBooks


data class CategoryUseCase(
    val getCategory: GetCategory,
    val selectCategories: SelectCategories,
    val selectCategory: SelectCategory
)
