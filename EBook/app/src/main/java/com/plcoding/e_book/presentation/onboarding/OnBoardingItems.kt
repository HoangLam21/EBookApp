package com.loc.newsapp.presentation.onboarding

import androidx.annotation.DrawableRes
import com.plcoding.e_book.R

data class OnBoardingItems(
    val title: String,
    val description: String,
    @DrawableRes val image: Int,
)

val items = listOf(
    OnBoardingItems(
        title = "Ebook",
        description = "Hãy cùng nhau đắm mình vào thư viện sách và tận hưởng những câu chuyện thú vị",
        image = R.drawable.pic13
    )
)

