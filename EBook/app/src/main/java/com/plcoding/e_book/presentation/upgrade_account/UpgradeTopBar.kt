package com.plcoding.e_book.presentation.upgrade_account

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.e_book.Dimens.IndicatorSize
import com.plcoding.e_book.Dimens.LargeText
import com.plcoding.e_book.Dimens.MediumPadding1
import com.plcoding.e_book.Dimens.SmallIconSize
import com.plcoding.e_book.R
import com.plcoding.e_book.ui.theme.EBookTheme
import com.plcoding.e_book.ui.theme.PrimaryKeyColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun UpgradeTopBar(
    onBackClick:() -> Unit
) {
    TopAppBar(
        title = {},
        modifier = Modifier.fillMaxWidth(),
        colors = TopAppBarDefaults.mediumTopAppBarColors(
            containerColor = Color.Transparent,
            actionIconContentColor = colorResource(id = R.color.PrimaryKeyColor),
            navigationIconContentColor = colorResource(id = R.color.PrimaryKeyColor)
        ),
        navigationIcon = {


            Row(verticalAlignment = Alignment.CenterVertically) {
                IconButton(onClick = onBackClick) {
                    Icon(painter = painterResource(id = R.drawable.ic_back_arrow), contentDescription = null)
                }

                Spacer(modifier = Modifier.padding(SmallIconSize))
                Text(text = "Upgrade account", color = PrimaryKeyColor, fontSize = LargeText, fontStyle = FontStyle.Italic)

            }

        }

    )
}


@Preview(showBackground = true)
@Composable
fun ViewCMTBRS() {
    EBookTheme {
        UpgradeTopBar (

            onBackClick = {}


        )
    }
}