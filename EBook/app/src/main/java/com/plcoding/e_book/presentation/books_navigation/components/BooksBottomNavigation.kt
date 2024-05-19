package com.plcoding.e_book.presentation.books_navigation.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.plcoding.e_book.Dimens
import com.plcoding.e_book.R
import com.plcoding.e_book.presentation.home.fontAwesome
import java.time.format.TextStyle

@Composable
fun BooksBottomNavigation(
    items: List<BooksBottomNavigationItem>,
    selected: Int,
    onItemClick: (Int) -> Unit
) {
    NavigationBar(
        modifier = Modifier.fillMaxWidth(),
        containerColor = Color(android.graphics.Color.parseColor("#ffffff")),
    ) {
        items.forEachIndexed { index, item ->
            val isSelected = index == selected
            NavigationBarItem(
                selected = isSelected,
                onClick = { onItemClick(index) },
                icon = {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .clickable { onItemClick(index) } // Thêm tính năng nhấp vào biểu tượng
                            .padding(vertical = 4.dp)
                    ) {
                        Text(
                            text = item.icon,
                            style = androidx.compose.ui.text.TextStyle(
                                fontFamily = fontAwesome,
                                fontSize = 27.sp,
                                color = if (isSelected) Color(android.graphics.Color.parseColor("#513820")) else Color.Gray
                            )
                        )
                        Spacer(modifier = Modifier.height(5.dp))
                        if (isSelected) { // Kiểm tra xem mục này có được chọn không
                            Spacer( // Vẽ đường gạch dưới biểu tượng khi được chọn
                                modifier = Modifier
                                    .height(2.dp)
                                    .width(30.dp)
                                    .background(Color(android.graphics.Color.parseColor("#513820")))
                            )
                        } else {
                            Spacer(modifier = Modifier.height(2.dp)) // Khoảng cách giữa biểu tượng và văn bản
                        }
                    }
                },
                colors = NavigationBarItemDefaults.colors(
                    selectedIconColor = Color(android.graphics.Color.parseColor("#513820")),
                    selectedTextColor = Color(android.graphics.Color.parseColor("#513820")),
                    unselectedIconColor = Color.Gray,
                    unselectedTextColor = Color.Gray,
                    indicatorColor = Color(android.graphics.Color.parseColor("#ffffff"))
                ),
                modifier = Modifier.padding(horizontal = 8.dp)
            )
        }
    }
}

data class BooksBottomNavigationItem(
    val icon: String,
)

