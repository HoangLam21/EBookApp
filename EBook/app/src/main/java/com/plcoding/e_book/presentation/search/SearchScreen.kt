package com.plcoding.e_book.presentation.Search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.paging.compose.collectAsLazyPagingItems
import com.plcoding.e_book.Dimens.MediumPadding1
import com.plcoding.e_book.presentation.common.BooksList
import com.plcoding.e_book.presentation.common.Searchbar
import com.plcoding.e_book.presentation.navgragh.Route


@Composable
fun SearchScreen(
    state: SearchState,
    event: (SearchEvent) -> Unit,
    navigate: (String) ->Unit
) {

    Column(
        modifier = Modifier
            .padding(
                top = MediumPadding1,
                start = MediumPadding1,
                end = MediumPadding1
            )
            .statusBarsPadding()
            .fillMaxSize()
    ) {
        Searchbar(
            text = state.searchQuery,
            readOnly = false,
            onValueChange = {event(SearchEvent.UpdateSearchQuery(it)) },
            onSearch = {event(SearchEvent.SearchBooks) })

        Spacer(modifier = Modifier.height(MediumPadding1))
        state.resultitem?.let {
            val articles = it.collectAsLazyPagingItems()
            BooksList(resultitem = articles, onClick = {navigate(Route.DetailsScreen.route)})
        }

    }
}