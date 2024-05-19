package com.plcoding.e_book.presentation.common

import android.graphics.fonts.FontStyle
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.Dimens.ExtraSmallPadding2
import com.plcoding.e_book.Dimens.IconSize
import com.plcoding.e_book.Dimens.IndicatorSize
import com.plcoding.e_book.Dimens.LargeText
import com.plcoding.e_book.Dimens.MediumText
import com.plcoding.e_book.Dimens.SmallIconSize
import com.plcoding.e_book.R
import com.plcoding.e_book.ui.theme.EBookTheme
import com.plcoding.e_book.ui.theme.PrimaryKeyColor

@Composable
fun UpgradeAccountCard(
    modifier: Modifier = Modifier,
    onClick:()-> Unit,
    day: String,
    price: Int,
    hour: String
) {

    Card ( border = BorderStroke(2.dp, color = PrimaryKeyColor), shape = RoundedCornerShape(20.dp), modifier = Modifier.clickable {  }){
        Row (verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White)
                .height(80.dp)
                .padding(3.dp)){
            Image(painter = painterResource(id = R.drawable.diamond), contentDescription = null, modifier = Modifier
                .size(50.dp)
                .padding(start = IndicatorSize),)
            Row (
                Modifier
                    .weight(1f)
                    .padding(start = IndicatorSize)
                    .background(Color.Transparent), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
                Column(
                    Modifier

                        .weight(1f)
                        .background(Color.Transparent), verticalArrangement = Arrangement.Top,) {
                    Text(text = "Gói ${day}", fontSize = LargeText, color = PrimaryKeyColor, modifier = Modifier.padding(ExtraSmallPadding2))

                    Text(text = "Sử dụng trong ${hour}", fontSize = MediumText, color = PrimaryKeyColor,modifier = Modifier.padding(bottom = ExtraSmallPadding2))
                }
                Text(text = "${price}đ", color = PrimaryKeyColor,modifier = Modifier.padding(end = IconSize))
            }

        }
    }
}



@Preview(showBackground = true)
@Composable
fun ViewUGCard() {

    EBookTheme {
        UpgradeAccountCard(onClick = { /*TODO*/ }, day = "1", price =22 , hour = "22 h")
    }

}