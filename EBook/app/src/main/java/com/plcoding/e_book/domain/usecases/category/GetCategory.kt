package com.plcoding.e_book.domain.usecases.category

import androidx.paging.PagingData
import com.plcoding.e_book.domain.repository.CategoryRepository
import kotlinx.coroutines.flow.Flow

class GetCategory(
    private val categoryRepository: CategoryRepository
) {

    operator fun invoke(sources: List<String>): Flow<PagingData<com.plcoding.e_book.domain.model.Category.Result>> {
        return categoryRepository.getCategory(sources = sources)
    }
}