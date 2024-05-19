package com.plcoding.e_book.presentation.upgrade

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.R

@Preview(showBackground = true)
@Composable
fun Upgrade() {
    Column( modifier = Modifier
        .fillMaxWidth()
        .fillMaxHeight()
        .verticalScroll(rememberScrollState())
        .background(color = Color(android.graphics.Color.parseColor("#ffffff"))),

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
        ) {
            Icon(
                imageVector = Icons.Default.ArrowBack,
                contentDescription = null,
                tint = Color(android.graphics.Color.parseColor("#513820")),
                modifier = Modifier
                    .size(25.dp),
            )
            Spacer(modifier = Modifier.width(10.dp))
            Row(modifier = Modifier
                .fillMaxWidth()
                ,
                horizontalArrangement = Arrangement.Center) {
                Text(text = "Nâng cấp",  fontFamily = FontFamily(Font(R.font.cormorantgaramondbold)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 25.sp,
                )
            }

        }
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 20.dp),
            horizontalArrangement = Arrangement.Center) {
            Image(painter = painterResource(id = R.drawable.img49), contentDescription = null,
                modifier = Modifier
                    .padding(top = 10.dp, bottom = 10.dp)
            )
        }
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Bạn đã sở hữu phiên bản ebook thông thường và muốn nâng cấp lên phiên bản premium? Hãy sẵn sàng cho một trải nghiệm đọc sách hoàn toàn mới với những ưu đãi độc đáo!",fontFamily = FontFamily(
            Font(R.font.cormorantgaramondlight)
        ),
            color = Color(android.graphics.Color.parseColor("#513820")), fontSize =20.sp, modifier = Modifier.padding(start=16.dp,end=16.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Text(text = "Các gói nâng cấp",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
            color = Color(android.graphics.Color.parseColor("#513820")), fontSize =25.sp, modifier = Modifier.padding(start=16.dp,end=16.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Row() {
            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(90.dp)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                    .border(
                        width = 1.dp, // Độ rộng của viền
                        color = Color(android.graphics.Color.parseColor("#513820")), // Màu sắc của viền
                        shape = RoundedCornerShape(20.dp) // Bán kính của góc bo tròn
                    )

            ){
                Row {
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = Color(android.graphics.Color.parseColor("#513820")),
                            modifier = Modifier
                                .size(25.dp),
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
                        Text(text = "Gói ngày",fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                            color = Color(android.graphics.Color.parseColor("#513820")), fontSize =22.sp,)
                        Text(text = "Sử dụng trong 24 giờ",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                            color = Color(android.graphics.Color.parseColor("#513820")), fontSize =20.sp,)
                    }

                }
            }
        }
        Row() {
            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(90.dp)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                    .border(
                        width = 1.dp, // Độ rộng của viền
                        color = Color(android.graphics.Color.parseColor("#513820")), // Màu sắc của viền
                        shape = RoundedCornerShape(20.dp) // Bán kính của góc bo tròn
                    )

            ){
                Row {
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = Color(android.graphics.Color.parseColor("#513820")),
                            modifier = Modifier
                                .size(25.dp),
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
                        Text(text = "Gói tuần",fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                            color = Color(android.graphics.Color.parseColor("#513820")), fontSize =22.sp,)
                        Text(text = "Sử dụng trong 7 ngày",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                            color = Color(android.graphics.Color.parseColor("#513820")), fontSize =20.sp,)
                    }

                }
            }
        }
        Row() {
            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(90.dp)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                    .border(
                        width = 1.dp, // Độ rộng của viền
                        color = Color(android.graphics.Color.parseColor("#513820")), // Màu sắc của viền
                        shape = RoundedCornerShape(20.dp) // Bán kính của góc bo tròn
                    )

            ){
                Row {
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = Color(android.graphics.Color.parseColor("#513820")),
                            modifier = Modifier
                                .size(25.dp),
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
                        Text(text = "Gói tháng",fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                            color = Color(android.graphics.Color.parseColor("#513820")), fontSize =22.sp,)
                        Text(text = "Sử dụng trong 30 ngày",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                            color = Color(android.graphics.Color.parseColor("#513820")), fontSize =20.sp,)
                    }

                }
            }
        }
        Row() {
            Box(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .height(90.dp)
                    .padding(start = 16.dp, top = 16.dp, end = 16.dp)
                    .border(
                        width = 1.dp, // Độ rộng của viền
                        color = Color(android.graphics.Color.parseColor("#513820")), // Màu sắc của viền
                        shape = RoundedCornerShape(20.dp) // Bán kính của góc bo tròn
                    )

            ){
                Row {
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
                        Icon(
                            imageVector = Icons.Default.Star,
                            contentDescription = null,
                            tint = Color(android.graphics.Color.parseColor("#513820")),
                            modifier = Modifier
                                .size(25.dp),
                        )
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    Column(verticalArrangement = Arrangement.Center, modifier = Modifier.fillMaxHeight()) {
                        Text(text = "Gói năm",fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                            color = Color(android.graphics.Color.parseColor("#513820")), fontSize =22.sp,)
                        Text(text = "Sử dụng trong 365 ngày",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                            color = Color(android.graphics.Color.parseColor("#513820")), fontSize =20.sp,)
                    }

                }
            }
        }
    }
}