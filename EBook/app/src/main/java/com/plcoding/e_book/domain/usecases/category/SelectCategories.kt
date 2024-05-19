package com.plcoding.e_book.domain.usecases.category

import com.plcoding.e_book.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow

class SelectCategories (
    private val categoryRepository: CategoryRepository

) {

    operator fun  invoke(): Flow<List<com.plcoding.e_book.domain.model.Category.Result>> {
        return categoryRepository.selectCategories()
    }
}