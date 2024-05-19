package com.plcoding.e_book.presentation.category

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.presentation.common.EmptyScreen

@Composable
fun DetailCategoryList(
    modifier: Modifier = Modifier,
    resultitem: LazyPagingItems<com.plcoding.e_book.domain.model.Category.Result>,
    onClick: (com.plcoding.e_book.domain.model.Category.Result) -> Unit
) {
    val handlePagingResult = handlePagingResultDetailCategoryList(resultitem = resultitem)
    if(handlePagingResult){
        LazyRow(
            modifier = modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(Dimens.MediumPadding1),
            contentPadding = PaddingValues(all = Dimens.ExtraSmallPadding2)
        ) {
            items(count = resultitem.itemCount){
                resultitem[it]?.let{
                    DetailCategoryCard(category = it, onClick = {onClick(it)})
                    Spacer(modifier= Modifier.width(5.dp))

                }
            }
        }
    }
}




@Composable
fun handlePagingResultDetailCategoryList(
    resultitem: LazyPagingItems<com.plcoding.e_book.domain.model.Category.Result>
):Boolean {
    val loadState = resultitem.loadState
    val error = when {
        loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
        loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
        loadState.append is LoadState.Error -> loadState.append as LoadState.Error
        else -> null
    }

    return when{
        loadState.refresh is LoadState.Loading ->{

            false
        }
        error != null ->{
            EmptyScreen()
            false
        }
        else ->{
            true
        }
    }
}
