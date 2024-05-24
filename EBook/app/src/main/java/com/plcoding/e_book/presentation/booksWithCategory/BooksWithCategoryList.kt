package com.plcoding.e_book.presentation.booksWithCategory

import android.util.Log
import androidx.compose.foundation.lazy.LazyRow


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.presentation.common.BookCard
import com.plcoding.e_book.presentation.common.BookCardDiscount
import com.plcoding.e_book.presentation.home.HomeViewModel
import kotlinx.coroutines.flow.Flow

@Composable
fun BooksWithCategoryList (
    modifier: Modifier = Modifier,
    resultitemList: List<Result>, // Flow as parameter
    onClick: (Result) -> Unit,
    viewModel: HomeViewModel = hiltViewModel()
) {

    LazyVerticalGrid(
        modifier = Modifier.fillMaxSize(),
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(Dimens.MediumPadding1),
        horizontalArrangement = Arrangement.spacedBy(Dimens.MediumPadding1),
        contentPadding = PaddingValues(all = Dimens.ExtraSmallPadding2)
    )
    {
        items(count = resultitemList.size) { index ->
            val resultitem = resultitemList[index]
            BookCard(book = resultitem, onClick = { onClick(resultitem) })
        }
        Log.d("da vo viewmd","11444")

    }

}

