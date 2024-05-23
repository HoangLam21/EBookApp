package com.plcoding.e_book.presentation.favourite_book

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.plcoding.e_book.Dimens.MediumPadding1
import com.plcoding.e_book.presentation.common.BooksListDT
import com.plcoding.e_book.presentation.favorite_book.FavouriteTopBar

@Composable
fun FavouriteBookScreen(
    state: FavouriteBookState,
    navigateToDetails: (com.plcoding.e_book.domain.model.Books.Result) ->Unit,
    navigateUp: ()-> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(top = MediumPadding1, start = MediumPadding1, end = MediumPadding1),

        )
    {
        FavouriteTopBar(
            onBackClick = navigateUp
        )


        Spacer(modifier = Modifier.height(MediumPadding1))

        BooksListDT(resultitem = state.resultitem, onClick = {navigateToDetails(it)} )
    }
}