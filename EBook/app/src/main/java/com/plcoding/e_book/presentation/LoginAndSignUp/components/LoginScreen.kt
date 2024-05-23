package com.plcoding.e_book.presentation.Login


import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.plcoding.e_book.domain.model.Login.Result
import com.plcoding.e_book.presentation.Login.components.HeaderText
import com.plcoding.e_book.presentation.Login.components.LoginTextField
import com.plcoding.e_book.presentation.payment.paymentViewModel
import com.plcoding.e_book.ui.theme.DarkBackground
import com.plcoding.e_book.ui.theme.EBookTheme
import com.plcoding.e_book.ui.theme.GrayText
import com.plcoding.e_book.ui.theme.LightBackground
import com.plcoding.e_book.ui.theme.PrimaryKeyColor
import com.plcoding.e_book.ui.theme.SecondaryKeyColor

val defaultPadding = 12.dp
val itemSpacing = 8.dp

private val DarkColorScheme = darkColorScheme(
    primary = PrimaryKeyColor,
    secondary = SecondaryKeyColor,
    background = DarkBackground
)

private val LightColorScheme = lightColorScheme(
    primary = PrimaryKeyColor,
    secondary = GrayText,
    background = LightBackground
)
@Composable
fun LoginScreen(
    onLoginClick: () -> Unit,
    onRegisterClick: () -> Unit ,
    viewModel: paymentViewModel = hiltViewModel()

) {


    val Login by viewModel.login.observeAsState()

    var userName by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val account = Result(userName,password)


    val (checked, onCheckedChange) = rememberSaveable {
        mutableStateOf(false)
    }
    val isFieldsEmpty = userName.isNotEmpty() && password.isNotEmpty()

    val context = LocalContext.current
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp

    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(
                start = defaultPadding,
                end = defaultPadding,
                top = (screenHeight - 400.dp) / 2,
                bottom = defaultPadding
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            HeaderText(
                text = "Đăng Nhập",
                modifier = Modifier
                    .padding(vertical = defaultPadding)
                    .align(alignment = Alignment.CenterHorizontally), // Đặt căn giữa cho phần header text

            )
            LoginTextField(
                value = userName,
                onValueChange = { userName = it },
                labelText = "Tên đăng nhập",
                leadingIcon = Icons.Default.Person,
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(Modifier.height(itemSpacing))
            LoginTextField(
                value = password,
                onValueChange = { password = it },
                labelText = "Mật khẩu",
                leadingIcon = Icons.Default.Lock,
                modifier = Modifier.fillMaxWidth(),
                keyboardType = KeyboardType.Password,
                visualTransformation = PasswordVisualTransformation()
            )
            Spacer(Modifier.height(itemSpacing))
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Row(
                    horizontalArrangement = Arrangement.Center,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Checkbox(checked = checked, onCheckedChange = onCheckedChange)
                    Text("Ghi nhớ tôi")
                }
                TextButton(onClick = {}) {
                    Text("Quên mật khẩu?")
                }
            }
            val loginn by viewModel.login.observeAsState()

            LaunchedEffect(loginn) {
                loginn?.let{
                    l-> onLoginClick()
                }

            }
            Spacer(Modifier.height(itemSpacing))
            Button(
                onClick ={ viewModel.createReading(account)


                },
                modifier = Modifier.fillMaxWidth(),
                enabled = isFieldsEmpty,
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryKeyColor,
                    contentColor = SecondaryKeyColor
                )
            ) {
                Text("Đăng nhập")
            }
            AlternativeLoginOptions(
                onIconClick = { index ->

                },
                onRegisterClick = onRegisterClick
            )

        }
    }
}


@Composable
fun AlternativeLoginOptions(
    onIconClick: (index: Int) -> Unit,
    onRegisterClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(Modifier.height(itemSpacing))
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text("Bạn chưa có tài khoản?")
            Spacer(Modifier.height(itemSpacing))
            TextButton(onClick = onRegisterClick) {
                Text("Đăng ký")
            }
        }
    }

}

@Preview(showSystemUi = true)
@Composable
fun PrevLoginScreen() {
    EBookTheme {
        LoginScreen({}, {})
    }
}




