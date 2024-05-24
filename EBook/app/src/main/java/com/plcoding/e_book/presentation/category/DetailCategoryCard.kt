package com.plcoding.e_book.presentation.category

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Category.Result

@Composable
fun DetailCategoryCard(
    category: Result,
    onClick: (Result) -> Unit
) {
    Button(
        onClick = { onClick(category) }, shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(android.graphics.Color.parseColor("#eeebe9")),
            contentColor = Color(android.graphics.Color.parseColor("#513820"))
        )
    ) {
        Text(
            text = category.name,
            color = Color(android.graphics.Color.parseColor("#ffffff"))
        )
    }
}