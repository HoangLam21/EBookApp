package com.plcoding.e_book.domain.usecases.category

import com.plcoding.e_book.domain.repository.CategoryRepository

class SelectCategory(
    private val categoryRepository: CategoryRepository
) {

    suspend operator fun  invoke(id: Int): com.plcoding.e_book.domain.model.Category.Result?{
        return categoryRepository.selectCategory(id)
    }
}