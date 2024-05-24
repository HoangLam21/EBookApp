package com.plcoding.e_book.presentation.booksWithCategory

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.compose.LazyPagingItems
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.presentation.category.CategoryTopBar
import com.plcoding.e_book.presentation.category.DetailCategoryList
import com.plcoding.e_book.presentation.common.BooksListCategory
import com.plcoding.e_book.presentation.navgragh.Route
import kotlinx.coroutines.flow.Flow

val fontAwesome = FontFamily(
    Font(R.font.fontawesome6freesolid900, FontWeight.Normal)
)

@OptIn(ExperimentalFoundationApi::class, ExperimentalMaterial3Api::class)
@Composable
fun BooksWithCategoryScreen(books: LazyPagingItems<Result>,
                   category: LazyPagingItems<com.plcoding.e_book.domain.model.Category.Result>,
                   viewModel: BooksWithCategoryViewModel = hiltViewModel(),
                   navigateToDetail: (com.plcoding.e_book.domain.model.Books.Result) -> Unit,

//                   event:(DetailsEvent)->Unit,
                   navigateUp:()->Unit
) {
    val context = LocalContext.current
    val selectedCategory = remember { mutableStateOf<com.plcoding.e_book.domain.model.Category.Result?>(null) }
    val booksByCategory by viewModel.booksByCategory.collectAsState()

    LaunchedEffect(selectedCategory.value) {
        selectedCategory.value?.let {
            viewModel.getBooksByCategory(it.id)
        }
    }
    val titles by remember {
        derivedStateOf {
            if(books.itemCount>10){
                books.itemSnapshotList.items
                    .slice(IntRange(start=0, endInclusive = 9))
                    .joinToString(separator = " \uD83d\uDFE5 "){it.title}
            }else{
                ""
            }
        }
    }


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
//            .verticalScroll(rememberScrollState())
            .background(color = Color(android.graphics.Color.parseColor("#ffffff"))),

        ) {
        CategoryTopBar( onBackClick = navigateUp)

        Text(
            text = "Chọn thể loại",
            color = Color(android.graphics.Color.parseColor("#513820")),
            fontSize = 17.sp,
            modifier = Modifier.padding(start = 16.dp)
        )

        DetailCategoryList(resultitem = category, onClick = { selectedCategory.value = it })

        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Text(text = "Kết quả lọc",
                color = Color(android.graphics.Color.parseColor("#513820")),
                fontSize = 17.sp, modifier = Modifier.padding(start=16.dp))

        }

        Spacer(modifier = Modifier.height(10.dp))

        Spacer(modifier = Modifier.width(10.dp))
        BooksListCategory(resultitem = booksByCategory,  onClick = navigateToDetail)


    }
}
