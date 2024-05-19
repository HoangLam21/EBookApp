package com.plcoding.e_book.presentation.common

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.plcoding.e_book.domain.model.Category.Result

@Composable
fun CategoriesList(
    category: LazyPagingItems<com.plcoding.e_book.domain.model.Category.Result>,
    onClick: (com.plcoding.e_book.domain.model.Category.Result) -> Unit
) {
    val handlerPagingResult = handlePagingResult(category = category)
    if(handlerPagingResult){
        LazyRow(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .height(100.dp)
                .padding(start = 11.dp)
        ) {
            items(count = category.itemCount){
                category[it]?.let{
                    CategoryCard(category = it, onClick={onClick(it)})
                    Spacer(modifier = Modifier.width(25.dp))
                }
            }

        }
    }

}



@Composable
fun handlePagingResult(
    category: LazyPagingItems<Result>,
): Boolean {
    val loadState = category.loadState
    val error = when {
        loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
        loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
        loadState.append is LoadState.Error -> loadState.append as LoadState.Error
        else -> null
    }
    return when {
        loadState.refresh is LoadState.Loading -> {
            ShimmerEffect()
            false
        }
        error != null -> {
            EmptyScreen()
            false
        }
        else -> {
            true
        }
    }
}

@Composable
private fun ShimmerEffect() {
    Row {
        repeat(10) {
            CategoryCardShimmerEffect()
        }
    }
}