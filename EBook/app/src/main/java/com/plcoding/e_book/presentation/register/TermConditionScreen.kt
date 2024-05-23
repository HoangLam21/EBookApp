package com.plcoding.e_book.presentation.Register

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.plcoding.e_book.presentation.Login.defaultPadding

@Composable
fun TermConditionScreen(onBtnClick: () -> Unit) {
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier
                .padding(
                start = defaultPadding,
                end = defaultPadding,
                top = (screenHeight - 650.dp) / 2,
                bottom = defaultPadding)
                .fillMaxWidth()
                .verticalScroll(rememberScrollState()) // Thêm thanh cuộn
        ) {
            // Header: Điều khoản dịch vụ
            SectionHeader("Điều khoản dịch vụ")

            // Body
            val terms = listOf(
                "Giới thiệu" to "Bằng cách sử dụng dịch vụ của chúng tôi, bạn đồng ý tuân thủ các điều khoản này. Vui lòng đọc kỹ.",
                "Sử dụng dịch vụ" to "Bạn phải tuân thủ mọi chính sách cung cấp trong dịch vụ. Không được lạm dụng hoặc can thiệp vào dịch vụ.",
                "Bảo vệ quyền riêng tư" to "Chính sách bảo mật của chúng tôi giải thích cách chúng tôi xử lý thông tin cá nhân và bảo vệ quyền riêng tư của bạn khi sử dụng dịch vụ.",
                "Nội dung của bạn" to "Bạn giữ bản quyền và mọi quyền sở hữu bạn đã có đối với nội dung mà bạn gửi lên dịch vụ của chúng tôi.",
                "Chấm dứt sử dụng" to "Chúng tôi có thể tạm ngừng hoặc chấm dứt cung cấp dịch vụ cho bạn nếu bạn không tuân thủ các điều khoản hoặc chính sách của chúng tôi.",
                "Thay đổi dịch vụ" to "Chúng tôi liên tục thay đổi và cải tiến dịch vụ của mình. Chúng tôi có thể thêm hoặc xóa chức năng, và chúng tôi có thể tạm ngừng hoặc ngừng hoàn toàn một dịch vụ."
            )
            terms.forEachIndexed { index, (title, content) ->
                TermItem(index + 1, title, content)
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Button: I Agree
            Button(
                onClick = onBtnClick,
                modifier = Modifier.width(IntrinsicSize.Max)
            ) {
                Text("Tôi Đồng Ý")
            }
        }
    }
}

@Composable
fun TermItem(index: Int, title: String, content: String) {
    Column(
        modifier = Modifier.padding(bottom = 16.dp)
    ) {
        Text(
            text = "$index. $title",
            style = MaterialTheme.typography.titleMedium,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Start
        )
        Text(
            text = content,
            style = MaterialTheme.typography.bodyMedium,
            textAlign = TextAlign.Start
        )
    }
}
