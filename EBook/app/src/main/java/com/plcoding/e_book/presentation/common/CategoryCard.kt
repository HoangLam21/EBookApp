package com.plcoding.e_book.presentation.common

import android.graphics.BitmapFactory
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Category.Result
import com.plcoding.e_book.ui.theme.EBookTheme
import kotlinx.coroutines.CoroutineStart
import kotlin.io.encoding.Base64
import kotlin.io.encoding.ExperimentalEncodingApi

@Composable
fun Base64Image(
    base64String: String,
    modifier: Modifier = Modifier,
    contentDescription: String? = null,
    contentScale: ContentScale = ContentScale.Crop
) {
    val decodedBytes = android.util.Base64.decode(base64String, android.util.Base64.DEFAULT)
    val bitmap = BitmapFactory.decodeByteArray(decodedBytes, 0, decodedBytes.size)
    bitmap?.let {
        Image(
            bitmap = it.asImageBitmap(),
            contentDescription = contentDescription,
            modifier = modifier,
            contentScale = contentScale
        )
    }
}

@Composable
fun CategoryCard(category: com.plcoding.e_book.domain.model.Category.Result,
                 onClick:()->Unit){
    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        category.avatar?.let {
            Base64Image(
                base64String = it,
                modifier = Modifier
                    .width(60.dp)
                    .height(60.dp)
                    .clickable { onClick() }
                    .clip(CircleShape),
                contentDescription = null,
                contentScale = ContentScale.Fit
            )
        }
        Text(text = category.name,
            fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
            color = Color(android.graphics.Color.parseColor("#513820")),


            fontSize = 13.sp
        )
    }
}
@Preview(showBackground = true)
@Composable
fun CategoryCardPreview(){

    EBookTheme{
        CategoryCard(category = Result(
            createAt = "",
            createBy = "",
            hot = 0,
            id = 0,
            avatar = "",
            name="kinh di",
            updateAt = "",
            updateBy = "",
        )
        ) {

        }
    }
}
