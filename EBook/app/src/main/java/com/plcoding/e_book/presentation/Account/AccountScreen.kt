package com.plcoding.e_book.presentation.Account

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
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.R

@Preview(showBackground = true)
@Composable
fun Account() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top=40.dp)
            .fillMaxHeight()
            .verticalScroll(rememberScrollState())
            .background(color = Color(android.graphics.Color.parseColor("#ffffff"))),

        ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 10.dp)
                .align(Alignment.CenterHorizontally)
        ) {

            Text(
                text = "Nguyen Thi Nhu Huynh", fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 22.sp, modifier = Modifier
                    .align(
                        Alignment.CenterVertically
                    )
                    .fillMaxWidth(0.9f)
                    .padding(start = 16.dp)
            )
            Icon(
                imageVector = Icons.Default.Settings,
                contentDescription = null,
                tint = Color(android.graphics.Color.parseColor("#513820")),
                modifier = Modifier
                    .padding(end = 4.dp)
                    .size(25.dp),

                )
        }
        Spacer(modifier = Modifier.height(20.dp))
        Row {
            Spacer(modifier = Modifier.width(16.dp))
            Box(
                modifier = Modifier
                    .size(120.dp)

                    .background(
                        color = Color(android.graphics.Color.parseColor("#eeebe9")),
                        shape = CircleShape
                    )
            )
        }

        Spacer(modifier = Modifier.height(70.dp))
        Text(text = "Thông tin tài khoản",fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
            color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 24.sp, modifier = Modifier.padding(start=16.dp))
        Spacer(modifier = Modifier.width(20.dp))
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp)
                .padding(start = 16.dp, top = 8.dp, end = 16.dp)
                .border(
                    width = 1.dp, // Độ rộng của viền
                    color = Color(android.graphics.Color.parseColor("#eeebe9")), // Màu sắc của viền
                    shape = RoundedCornerShape(20.dp) // Bán kính của góc bo tròn
                )
                .background(
                    color = Color(android.graphics.Color.parseColor("#eeebe9")),
                    shape = RoundedCornerShape(20.dp) // Bán kính của góc background
                ),
        ){
            Column(horizontalAlignment = Alignment.CenterHorizontally) {
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
                        .background(
                            color = Color(android.graphics.Color.parseColor("#513820")),
                            shape = RoundedCornerShape(20.dp) // Bán kính của góc background
                        ),
                ){
                    Row(modifier = Modifier.align(Alignment.Center)) {
                        Box(
                            modifier = Modifier
                                .size(50.dp)

                                .background(
                                    color = Color(android.graphics.Color.parseColor("#eeebe9")),
                                    shape = CircleShape
                                )
                        )
                        Spacer(modifier = Modifier.width(10.dp))
                        Text(text = "Tài khoản miễn phí",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                            color = Color(android.graphics.Color.parseColor("#ffffff")), fontSize = 24.sp, modifier = Modifier.padding(top=8.dp))

                    }
                }

                Row(modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 20.dp),
                    horizontalArrangement = Arrangement.Center
                ) {

                    Text(
                        text = "Nâng cấp ngay",
                        fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
                        color = Color(android.graphics.Color.parseColor("#513820")),
                        fontSize = 23.sp,
                    )
                    Icon(
                        imageVector = Icons.Default.ArrowForward,
                        contentDescription = null,
                        tint = Color(android.graphics.Color.parseColor("#513820")),
                        modifier = Modifier
                            .padding(top = 3.dp, start = 4.dp)
                            .size(25.dp),

                        )
                }
            }

        }
        Spacer(modifier = Modifier.height(20.dp))
        Text(text = "Thông tin cá nhân",fontFamily = FontFamily(Font(R.font.cormorantgaramondmedium)),
            color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 24.sp, modifier = Modifier.padding(start=16.dp))
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Column {
                Text(text = "Tên: ",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 20.sp, modifier = Modifier.padding(start=25.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "Giới tính: ",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 20.sp, modifier = Modifier.padding(start=25.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "Ngày sinh: ",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 20.sp, modifier = Modifier.padding(start=25.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "Số điện thoại: ",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 20.sp, modifier = Modifier.padding(start=25.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "Email: ",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 20.sp, modifier = Modifier.padding(start=25.dp))

            }
            Column {
                Text(text = "Nguyễn Thị Như Huỳnh ",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 20.sp, modifier = Modifier.padding(start=25.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "Nữ",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 20.sp, modifier = Modifier.padding(start=25.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "13/07/2004",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 20.sp, modifier = Modifier.padding(start=25.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "0348775966",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 20.sp, modifier = Modifier.padding(start=25.dp))
                Spacer(modifier = Modifier.height(7.dp))
                Text(text = "huynh04137@gmail.com",fontFamily = FontFamily(Font(R.font.cormorantgaramondlight)),
                    color = Color(android.graphics.Color.parseColor("#513820")), fontSize = 20.sp, modifier = Modifier.padding(start=25.dp))
            }
        }
    }
}