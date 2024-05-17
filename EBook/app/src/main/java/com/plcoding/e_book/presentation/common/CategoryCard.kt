package com.plcoding.e_book.presentation.common

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Category.Result
import com.plcoding.e_book.ui.theme.EBookTheme

@Composable
fun CategoryCard(category: Result,
                 onClick:()->Unit){
    val context = LocalContext.current
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Box(
            modifier = Modifier
                .size(60.dp)
                .background(
                    color = Color(android.graphics.Color.parseColor("#eeebe9")),
                    shape = CircleShape
                )
        )
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
            name="kinh di",
            updateAt = "",
            updateBy = "",
        )
        ) {

        }
    }
}
