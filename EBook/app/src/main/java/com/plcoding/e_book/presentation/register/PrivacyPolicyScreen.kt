package com.plcoding.e_book.presentation.Register

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.IntrinsicSize
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.plcoding.e_book.presentation.Login.defaultPadding

@Composable
fun PrivacyPolicyScreen(onBtnClick: () -> Unit) {
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
                    bottom = defaultPadding
                )
                .fillMaxWidth()
                .verticalScroll(rememberScrollState())
        ) {
            // Header: Chính sách Bảo mật
            SectionHeader("Chính sách Bảo mật")

            // Body
            val policies = listOf(
                "Thu thập thông tin" to "Chúng tôi thu thập thông tin để cung cấp dịch vụ tốt hơn cho tất cả người dùng, bao gồm các thông tin cá nhân như tên, địa chỉ email và số điện thoại.",
                "Sử dụng thông tin" to "Thông tin chúng tôi thu thập được sử dụng để duy trì, bảo vệ và cải thiện dịch vụ của chúng tôi, phát triển các dịch vụ mới và bảo vệ người dùng của chúng tôi.",
                "Chia sẻ thông tin" to "Chúng tôi không chia sẻ thông tin cá nhân với các công ty, tổ chức và cá nhân bên ngoài trừ khi thuộc một trong các trường hợp sau: Với sự đồng ý của bạn, cho các mục đích xử lý bên ngoài, hoặc vì lý do pháp lý.",
                "Bảo mật thông tin" to "Chúng tôi nỗ lực bảo vệ thông tin người dùng khỏi bị truy cập trái phép, thay đổi, tiết lộ hoặc phá hủy. Chúng tôi sử dụng mã hóa để bảo mật dữ liệu trong quá trình truyền.",
                "Quyền kiểm soát thông tin" to "Bạn có thể xem xét và cập nhật thông tin cá nhân của mình bất cứ lúc nào bằng cách truy cập vào tài khoản của bạn. Chúng tôi cung cấp các công cụ để bạn kiểm soát thông tin của mình.",
                "Thay đổi chính sách" to "Chính sách Bảo mật của chúng tôi có thể thay đổi từ thời gian này sang thời gian khác. Chúng tôi sẽ không giảm quyền của bạn theo Chính sách Bảo mật này nếu không có sự đồng ý rõ ràng của bạn."
            )
            policies.forEachIndexed { index, (title, content) ->
                PrivacyItem(index + 1, title, content)
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
fun PrivacyItem(index: Int, title: String, content: String) {
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
