package com.plcoding.e_book.presentation.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.domain.model.Books.Result

@Composable
fun BookList(
    modifier: Modifier = Modifier,
    resultitem: LazyPagingItems<Result>,
    onClick: (Result) -> Unit
) {
    val handlePagingResult = handleRowPagingResult(resultitem = resultitem)
    if(handlePagingResult){
        LazyRow(
            modifier = modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(Dimens.MediumPadding1),
            contentPadding = PaddingValues(all = Dimens.ExtraSmallPadding2)
        ) {
            items(count = resultitem.itemCount){
                resultitem[it]?.let{
                    YouMayLikeCard(result = it, onClick = {onClick(it)})
                }
            }
        }
    }
}


@Composable
fun BooksListHome(
    modifier: Modifier = Modifier,
    bookitem: LazyPagingItems<Result>,
    onClick: (Result) -> Unit
) {
    val handlePagingResult = handlePagingResult(resultitem = bookitem)
    if(handlePagingResult){
        LazyColumn(
            modifier = modifier.fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(Dimens.MediumPadding1),
            contentPadding = PaddingValues(all = Dimens.ExtraSmallPadding2)
        ) {
            items(count = bookitem.itemCount){
                bookitem[it]?.let{
                    YouMayLikeCard(result = it, onClick = {onClick(it)})
                }
            }
        }
    }
}


@Composable
fun handlePagingResult(
    resultitem: LazyPagingItems<Result>
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

            ShimmerEffect()
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

@Composable
fun BooksListDT(
    modifier: Modifier = Modifier,
    resultitem: List<Result>,
    onClick: (Result) -> Unit
) {

    LazyColumn(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(Dimens.MediumPadding1),
        contentPadding = PaddingValues(all = Dimens.ExtraSmallPadding2)
    ) {
        items(count = resultitem.size){
            val resultitem  = resultitem[it]
            YouMayLikeCard(result = resultitem, onClick = {onClick(resultitem)})
        }
    }

}

@Composable
private fun ShimmerEffect() {
    Column {
        repeat(10){
            YouMayLikeCardShimmerEffect(
                modifier = Modifier.padding(horizontal = Dimens.MediumPadding1)
            )
        }
    }
}

@Composable
fun handleRowPagingResult(
    resultitem: LazyPagingItems<Result>):Boolean{
    val loadState = resultitem.loadState
    val error = when {
        loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
        loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
        loadState.append is LoadState.Error -> loadState.append as LoadState.Error
        else -> null
    }

    return when{
        loadState.refresh is LoadState.Loading ->{
            ShimmerRowEffect()
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

@Composable
private fun ShimmerRowEffect() {
    Row {
        repeat(10){
            YouMayLikeCardShimmerEffect(
                modifier = Modifier.padding(horizontal = Dimens.ExtraSmallPadding2 )
            )
        }
    }
}