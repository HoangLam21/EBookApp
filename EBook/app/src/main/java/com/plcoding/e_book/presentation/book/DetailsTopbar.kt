package com.plcoding.e_book.presentation.book

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.plcoding.e_book.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailsTopbar(
    onBackClick:() -> Unit,
    onShareClick:() -> Unit,
    onBookMarkClick:()-> Unit
) {
    TopAppBar(
        title = { },
        modifier = Modifier.fillMaxWidth(),
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.Transparent,
            actionIconContentColor = colorResource(id = R.color.PrimaryKeyColor),
            navigationIconContentColor = colorResource(id = R.color.PrimaryKeyColor)
        ),
        navigationIcon = {

            IconButton(onClick = onBackClick) {
                Icon(painter = painterResource(id = R.drawable.ic_back_arrow), contentDescription = null)
            }
        },
        actions = {

            IconButton(onClick = onShareClick) {
                Icon(imageVector = Icons.Default.Share, contentDescription = null)
            }
            IconButton(onClick = onBookMarkClick) {
                Icon(painter = painterResource(id = R.drawable.ic_bookmark), contentDescription = null)
            }
        }
    )
}