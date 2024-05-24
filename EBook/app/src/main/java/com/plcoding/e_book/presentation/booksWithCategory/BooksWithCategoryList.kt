package com.plcoding.e_book.presentation.booksWithCategory

import androidx.compose.foundation.lazy.LazyRow


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.presentation.common.BookCardDiscount
import com.plcoding.e_book.presentation.home.HomeViewModel
import kotlinx.coroutines.flow.Flow

@Composable
fun BooksWithCategoryList (
    modifier: Modifier = Modifier,
    resultitemFlow: Flow<List<com.plcoding.e_book.domain.model.Books.Result>>, // Flow as parameter
    onClick: (com.plcoding.e_book.domain.model.Books.Result) -> Unit,
    viewModel: HomeViewModel = hiltViewModel() // Getting ViewModel instance
) {
    val resultitem by resultitemFlow.collectAsState(initial = emptyList()) // Collect Flow

    LazyRow(
    modifier = Modifier.fillMaxSize(),
    horizontalArrangement = Arrangement.spacedBy(Dimens.MediumPadding1),
    contentPadding = PaddingValues(all = Dimens.ExtraSmallPadding2)
    ) {
        items(resultitem.size) { index ->
            val result = resultitem[index]
            BookCardDiscount(book = result, onClick = { onClick(result) })
            Spacer(modifier = modifier.width(5.dp))
        }
    }
}
