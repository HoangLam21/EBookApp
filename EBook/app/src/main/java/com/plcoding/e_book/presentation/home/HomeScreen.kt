package com.plcoding.e_book.presentation.home
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.compose.LazyPagingItems
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.presentation.common.BooksListHome
import com.plcoding.e_book.presentation.common.Searchbar

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(resultitem: LazyPagingItems<Result>, navigateToSearch:() -> Unit, navigateToDetail: (Result) -> Unit) {
    val titles by remember {
        derivedStateOf {
            if(resultitem.itemCount > 10){
                resultitem.itemSnapshotList.items
                    .slice(IntRange(start = 0, endInclusive = 9))
                    .joinToString(separator = " \uD83d\uDFE5 "){it.title}
            }else{
                ""
            }
        }
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = Dimens.MediumPadding1)
            .statusBarsPadding()
    ) {
        Image(painter = painterResource(id = R.drawable.ic_logo),
            contentDescription = null,
            modifier = Modifier
                .width(150.dp)
                .height(30.dp)
                .padding(horizontal = Dimens.MediumPadding1)
        )
        Spacer(modifier = Modifier.height(Dimens.MediumPadding1))

        Searchbar(text = "", readOnly = true, onValueChange = {},
            onClick = {
                navigateToSearch()
            },
            onSearch = {})

        Spacer(modifier = Modifier.height(Dimens.MediumPadding1))

        Text(
            text = titles,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = Dimens.MediumPadding1)
                .basicMarquee(),
            fontSize = 12.sp,
            color = colorResource(id = R.color.white)
        )

        Spacer(modifier = Modifier.height(Dimens.MediumPadding1))

        BooksListHome(
            modifier = Modifier.padding(horizontal = Dimens.MediumPadding1),
            bookitem = resultitem,
            onClick = {
                navigateToDetail(it)
            }
        )
    }
}
