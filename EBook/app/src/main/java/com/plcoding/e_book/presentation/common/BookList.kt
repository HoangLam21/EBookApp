package com.plcoding.e_book.presentation.common

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import com.plcoding.e_book.Dimens

@Composable
fun BooksList(
    modifier: Modifier = Modifier,
    resultitem: LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result>,
    onClick: (com.plcoding.e_book.domain.model.Books.Result) -> Unit
) {
    val handlePagingResult = handlePagingResultBookList(resultitem = resultitem)
    if(handlePagingResult){
        LazyRow(
            modifier = modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(Dimens.MediumPadding1),
            contentPadding = PaddingValues(all = Dimens.ExtraSmallPadding2)
        ) {
            items(count = resultitem.itemCount){
                resultitem[it]?.let{
                    BookCard(book = it, onClick = {onClick(it)})
                }
            }
        }
    }
}





@Composable
fun handlePagingResult(
    resultitem: LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result>
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

            BookListShimmerEffect()
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
    resultitem: List<com.plcoding.e_book.domain.model.Books.Result>,
    onClick: (com.plcoding.e_book.domain.model.Books.Result) -> Unit
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
private fun BookListShimmerEffect() {
    Row {
        repeat(10){
            BookCardShimmerEffect()
            Spacer(modifier = Modifier.width(5.dp))
        }
    }
}

@Composable
fun handlePagingResultBookList(
    resultitem: LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result>):Boolean{
    val loadState = resultitem.loadState
    val error = when {
        loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
        loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
        loadState.append is LoadState.Error -> loadState.append as LoadState.Error
        else -> null
    }

    return when{
        loadState.refresh is LoadState.Loading ->{
            BookListShimmerEffect()
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
fun ContinueReadingList(
    books: LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result>,
    onClick: (com.plcoding.e_book.domain.model.Books.Result) -> Unit
) {
    val handlerPagingResult = handlePagingResultContinueBook(books = books)
    if(handlerPagingResult){
        LazyRow(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .height(170.dp)
                .padding(start = 11.dp)
        ) {
            items(count = books.itemCount){
                books[it]?.let{
                    ContinueReadingCard(book = it,onClick={onClick(it)})
                    Spacer(modifier = Modifier.width(7.dp))
                }
            }

        }
    }

}

@Composable
fun handlePagingResultContinueBook(
    books: LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result>,
): Boolean {
    val loadState = books.loadState
    val error = when {
        loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
        loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
        loadState.append is LoadState.Error -> loadState.append as LoadState.Error
        else -> null
    }
    return when {
        loadState.refresh is LoadState.Loading -> {
            ShimmerEffectContinueReading()
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
private fun ShimmerEffectContinueReading() {
    Row {
        repeat(20) {
            ContinueReadingShimmerEffect()
            Spacer(modifier = Modifier.width(5.dp))
        }
    }
}

@Composable
fun HotBooksList(
    books: LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result>,
    onClick: (com.plcoding.e_book.domain.model.Books.Result) -> Unit
) {
    val handlerPagingResult = handlePagingResultHot(books = books)
    if(handlerPagingResult){
        LazyRow(
            modifier = Modifier
                .fillMaxSize()
                .fillMaxWidth()
                .height(250.dp)
                .padding(start = 11.dp)
        ) {
            items(count = books.itemCount){
                books[it]?.let{
                    HotBookCard(book = it,onClick={onClick(it)})
                    Spacer(modifier = Modifier.width(7.dp))
                }
            }

        }
    }

}



@Composable
fun handlePagingResultHot(
    books: LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result>,
): Boolean {
    val loadState = books.loadState
    val error = when {
        loadState.refresh is LoadState.Error -> loadState.refresh as LoadState.Error
        loadState.prepend is LoadState.Error -> loadState.prepend as LoadState.Error
        loadState.append is LoadState.Error -> loadState.append as LoadState.Error
        else -> null
    }
    return when {
        loadState.refresh is LoadState.Loading -> {
            ShimmerEffectHot()
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
private fun ShimmerEffectHot() {
    Row {
        repeat(20) {
            HotBookCardShimmerEffect()
            Spacer(modifier = Modifier.width(5.dp))
        }
    }
}
@Composable
fun BooksListCategory(
    modifier: Modifier = Modifier,
    resultitem: LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result>,
    onClick: (com.plcoding.e_book.domain.model.Books.Result) -> Unit
) {

    val handlePagingResult = handlePagingResultBooksListCategory(resultitem = resultitem)
    if(handlePagingResult){
        LazyRow(
            modifier = modifier.fillMaxSize(),
            horizontalArrangement = Arrangement.spacedBy(Dimens.MediumPadding1),
            contentPadding = PaddingValues(all = Dimens.ExtraSmallPadding2)
        ) {
            items(count = resultitem.itemCount){
                resultitem[it]?.let{
                    BookCardCategory(book = it, onClick = {onClick(it)})
                }
            }
        }
    }
}


@Composable
fun handlePagingResultBooksListCategory(
    resultitem: LazyPagingItems<com.plcoding.e_book.domain.model.Books.Result>
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

            BookListCategoryShimmerEffect()
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
private fun BookListCategoryShimmerEffect() {
    Column {
        repeat(10){
            BookCardCategoryShimmerEffect()
            Spacer(modifier = Modifier.height(5.dp))
        }
    }
}