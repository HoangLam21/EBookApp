package com.plcoding.e_book.presentation.home

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.FavoriteBorder
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.derivedStateOf
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.paging.compose.LazyPagingItems
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.presentation.common.BooksList
import com.plcoding.e_book.presentation.common.CategoriesList
import com.plcoding.e_book.presentation.common.ContinueReadingList
import com.plcoding.e_book.presentation.common.HotBooksList
import com.plcoding.e_book.presentation.common.Searchbar


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HomeScreen(books: LazyPagingItems<Result>, navigateToSearch:() -> Unit, navigateToDetail: (Result) -> Unit, category: LazyPagingItems<com.plcoding.e_book.domain.model.Category.Result>) {
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

//    Log.d("vo roi", "ye")
    Column(
        modifier = Modifier
            .padding(top = 40.dp, bottom = 40.dp)
            .fillMaxWidth()
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
            .background(color = Color(android.graphics.Color.parseColor("#ffffff"))),

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        ) {
            Column(
                modifier = Modifier
                    .height(60.dp)
                    .padding(start = 10.dp)
                    .fillMaxWidth(0.7f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                var text by rememberSaveable {
                    mutableStateOf("")
                }
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = {
                        Text(
                            text = "Searching for...",
                            fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                            color = Color(android.graphics.Color.parseColor("#513820")),
                            modifier = Modifier.align(Alignment.CenterHorizontally)
                        )
                    },
                    shape = RoundedCornerShape(20.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedBorderColor = Color(android.graphics.Color.parseColor("#7d6a58")),
                        unfocusedBorderColor = Color(android.graphics.Color.parseColor("#7d6a58")),
                        unfocusedLabelColor = Color(android.graphics.Color.parseColor("#7d6a58"))
                    ),
                    leadingIcon = { Icon(imageVector = Icons.Default.Search, contentDescription = null) },
                    modifier = Modifier
                        .fillMaxWidth()
                    ,
                )
            }

            Box(
                modifier = Modifier
                    .height(60.dp)
                    .padding(start = 5.dp, top = 8.dp, end = 16.dp)
                    .border(
                        width = 1.dp,
                        color = Color(android.graphics.Color.parseColor("#eeebe9")), // Màu sắc của viền
                        shape = RoundedCornerShape(20.dp) // Bán kính của góc bo tròn
                    )
                    .background(
                        color = Color(android.graphics.Color.parseColor("#eeebe9")),
                        shape = RoundedCornerShape(20.dp)
                    )
                    .fillMaxWidth(1f),
                contentAlignment = Alignment.Center
            ) {
                Row {
                    Icon(
                        imageVector = Icons.Default.FavoriteBorder,
                        contentDescription = null,
                        tint = Color(android.graphics.Color.parseColor("#513820")),
                        modifier = Modifier.padding(end = 4.dp)
                    )
                    Spacer(modifier = Modifier.width(5.dp))
                    Box(
                        modifier = Modifier
                            .size(30.dp)
                            .background(
                                color = Color(android.graphics.Color.parseColor("#513820")),
                                shape = CircleShape
                            ),
                        contentAlignment = Alignment.Center
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img2),
                            contentDescription = null,
                            modifier = Modifier
                                .size(30.dp)
                                .background(
                                    color = Color(android.graphics.Color.parseColor("#513820")),
                                    shape = CircleShape
                                )
                        )
                    }

                }

            }
        }
        Spacer(modifier = Modifier.height(20.dp))
        Box(modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .padding(start = 16.dp, top = 8.dp, end = 16.dp)
            .border(
                width = 1.dp,
                color = Color(android.graphics.Color.parseColor("#eeebe9")),
                shape = RoundedCornerShape(20.dp)
            )
            .background(
                color = Color(android.graphics.Color.parseColor("#eeebe9")),
                shape = RoundedCornerShape(20.dp)
            ),
        ){
            HotBooksList(books = books, onClick = {})
        }

        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Text(text = "Category",
                fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                color = Color(android.graphics.Color.parseColor("#513820")),
                fontSize = 17.sp, modifier = Modifier.padding(start=16.dp))
            Icon(imageVector = Icons.Default.ArrowForward, contentDescription =null,
                modifier = Modifier
                    .padding(end = 10.dp),

                Color(android.graphics.Color.parseColor("#513820"))
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        CategoriesList(category = category, onClick = {})
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Read recently",
            fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
            color = Color(android.graphics.Color.parseColor("#513820")),
            fontSize = 17.sp, modifier = Modifier.padding(start=16.dp))
        ContinueReadingList(books = books, onClick = {})

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "You may also like",
            fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
            color = Color(android.graphics.Color.parseColor("#513820")),
            fontSize = 17.sp, modifier = Modifier.padding(start=16.dp))
        BooksList(resultitem = books, onClick = {})

        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Most read books",
            fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
            color = Color(android.graphics.Color.parseColor("#513820")),
            fontSize = 17.sp, modifier = Modifier.padding(start=16.dp))
        BooksList(resultitem = books, onClick = {})
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Free books",
            fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
            color = Color(android.graphics.Color.parseColor("#513820")),
            fontSize = 17.sp, modifier = Modifier.padding(start=16.dp))
        BooksList(resultitem = books, onClick = {})
    }
}
