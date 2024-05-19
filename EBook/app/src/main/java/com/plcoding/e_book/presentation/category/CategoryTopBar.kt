package com.plcoding.e_book.presentation.category

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.R
import com.plcoding.e_book.ui.theme.EBookTheme

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CategoryTopBar(
    onBackClick:()->Unit,
){
    TopAppBar(title = {  }, modifier = Modifier.fillMaxWidth(),
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.Transparent,
            actionIconContentColor = Color(android.graphics.Color.parseColor("#513820")),
            navigationIconContentColor = Color(android.graphics.Color.parseColor("#513820")),

        ),
        navigationIcon = {

            Row{
                IconButton(onClick = onBackClick) {
                    Text(
                        text = "\uf060",
                        style = androidx.compose.ui.text.TextStyle( fontFamily = com.plcoding.e_book.presentation.home.fontAwesome,
                            fontSize = 27.sp,
                            color = Color(android.graphics.Color.parseColor("#513820")))
                    )
                }
                Text(text = "Category",
                    fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                    color = Color(android.graphics.Color.parseColor("#513820")),
                    fontSize = 24.sp, modifier = Modifier.padding(start=16.dp, top=5.dp))
            }

        },

        )
}

@Preview
@Composable
fun CategoryTopBarPreview(){
    EBookTheme {
        CategoryTopBar( onBackClick = {})
    }
}


