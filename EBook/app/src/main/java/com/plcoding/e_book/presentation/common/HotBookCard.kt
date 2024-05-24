package com.plcoding.e_book.presentation.common

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.R
import com.plcoding.e_book.presentation.book.Base64ImageList


@Composable
fun HotBookCard(book: com.plcoding.e_book.domain.model.Books.Result,
                onClick:()->Unit){
    val context = LocalContext.current
    Row(modifier = Modifier
        .width(330.dp)
        .padding(top = 14.dp, start = 16.dp),

        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(modifier = Modifier
            .fillMaxWidth(0.7f)
        ) {
            Text(text = "Hot",

                fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                color = Color(android.graphics.Color.parseColor("#513820")),
            )
            Spacer(modifier = Modifier.height(10.dp))
            Text(text = book.title,
                fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                color = Color(android.graphics.Color.parseColor("#7d6a58")),
            )
            AuthorsText(authors = book.authors)
            Text(text =  book.price.toString(),
                fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                color = Color(android.graphics.Color.parseColor("#513820")),
                fontSize = 19.sp, modifier = Modifier.padding(start=0.dp).align(Alignment.CenterHorizontally))
            Button(onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color(android.graphics.Color.parseColor("#513820"))
                ), modifier = Modifier
                    .padding(top = 10.dp, start = 50.dp)
                    .height(37.dp)

            ) {
                Text(text = "Mua ngay",
                    fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                    color = Color(android.graphics.Color.parseColor("#ffffff")),)

            }
        }
        Box(
            contentAlignment = Alignment.Center
        ){
            Base64ImageList(
                galleryManageList = book.galleryManage.filterNotNull(),
                modifier = Modifier
                    .fillMaxWidth()
                    .height(Dimens.ThumbnailTemplate)
                    .clip(MaterialTheme.shapes.medium),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
        }
    }
}
