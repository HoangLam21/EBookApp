package com.plcoding.e_book.presentation.mybook

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.paging.compose.LazyPagingItems
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.presentation.common.BooksListDT
import com.plcoding.e_book.presentation.common.MyBooksList
import com.plcoding.e_book.presentation.favorite_book.FavouriteTopBar
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookState

@Composable
fun MyBookScren(
    mybookitem: LazyPagingItems<Result>,
    navigateToDetails: (Result) ->Unit,
    navigateUp: ()-> Unit
) {
    val titles by remember {
        derivedStateOf {
            if(mybookitem.itemCount>10){
                mybookitem.itemSnapshotList.items
                    .slice(IntRange(start=0, endInclusive = 9))
                    .joinToString(separator = " \uD83d\uDFE5 "){it.title}
            }else{
                ""
            }
        }
    }



    Column(
        modifier = Modifier
            .fillMaxSize()
            .statusBarsPadding()
            .padding(
                top = Dimens.MediumPadding1,
                start = Dimens.MediumPadding1,
                end = Dimens.MediumPadding1
            ),

        )
    {
        MyBookTopBar(
            onBackClick = navigateUp
        )


        Spacer(modifier = Modifier.height(Dimens.MediumPadding1))

        MyBooksList(resultitem = mybookitem , onClick = {
            navigateToDetails(it)
        } )
       // MyBooksList(r = state.mybooksitem, onClick = {navigateToDetails(it)} )

    }
}