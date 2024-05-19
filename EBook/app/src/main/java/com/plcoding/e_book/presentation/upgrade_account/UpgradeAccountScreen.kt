package com.plcoding.e_book.presentation.upgrade_account

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.Dimens.IndicatorSize
import com.plcoding.e_book.Dimens.LargeText
import com.plcoding.e_book.Dimens.MediumPadding1
import com.plcoding.e_book.R
import com.plcoding.e_book.presentation.common.UpgradeAccountCard

import com.plcoding.e_book.ui.theme.EBookTheme
import com.plcoding.e_book.ui.theme.PrimaryKeyColor

@Composable
fun UpgradeAccountScreen(
    navigateUp: ()-> Unit
) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(IndicatorSize).verticalScroll(rememberScrollState())) {
        UpgradeTopBar(
            onBackClick = navigateUp
        )

        Image(
            painter = painterResource(id = R.drawable.upgradeaccount), contentDescription = null,
            Modifier
                .fillMaxWidth(1f)
                .height(150.dp)
        )

        Spacer(modifier = Modifier.height(MediumPadding1))

        Text(
            text = "Bạn đang sở hữu phiên bản ebook thông thường và muốn nâng cấp lên phiên bản prenium? Hãy sẵn sàng cho một trải" +
                    "nghiệm đọc sách hoàn toàn mới với những ưu đãi độc đáo!",
            color = PrimaryKeyColor,
            fontStyle = FontStyle.Italic
        )

        Spacer(modifier = Modifier.height(MediumPadding1))
        Text(
            text = "Các gói nâng cấp",
            color = PrimaryKeyColor,
            fontSize = LargeText,
            fontWeight = FontWeight.Light
        )
        Spacer(modifier = Modifier.height(MediumPadding1))

        Column(modifier = Modifier.fillMaxWidth().height(800.dp)) {
            UpgradeAccountCard(onClick = { /*TODO*/ }, day = "ngày", price = 7000, hour = "24 giờ")

            Spacer(modifier = Modifier.height(IndicatorSize))

            UpgradeAccountCard(onClick = { /*TODO*/ }, day = "tuần", price = 20000, hour = "7 ngày")

            Spacer(modifier = Modifier.height(IndicatorSize))

            UpgradeAccountCard(
                onClick = { /*TODO*/ },
                day = "tháng",
                price = 70000,
                hour = "30 ngày"
            )

            Spacer(modifier = Modifier.height(IndicatorSize))

            UpgradeAccountCard(
                onClick = { /*TODO*/ },
                day = "6 tháng",
                price = 400000,
                hour = "6 tháng"
            )

            Spacer(modifier = Modifier.height(IndicatorSize))

            UpgradeAccountCard(
                onClick = { /*TODO*/ },
                day = "1 năm",
                price = 790000,
                hour = "1 năm"
            )

        }


    }

}




@Preview(showBackground = true)
@Composable
fun ViewUpgradeScreen() {
    EBookTheme {
        UpgradeAccountScreen (

            navigateUp = {}


        )
    }
}