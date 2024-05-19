package com.plcoding.e_book.presentation.category

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Category.Result

@Composable
fun DetailCategoryCard(
    category: Result, onClick:()->Unit
){
    Text(text = category.name,fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
        color = Color(android.graphics.Color.parseColor("#513820"))
    )
}