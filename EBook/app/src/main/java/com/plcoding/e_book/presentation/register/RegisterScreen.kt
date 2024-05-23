package com.plcoding.e_book.presentation.Register

import android.util.Patterns
import android.widget.Toast
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.plcoding.e_book.domain.model.Register.registerPost
import com.plcoding.e_book.presentation.Login.components.HeaderText
import com.plcoding.e_book.presentation.Login.components.LoginTextField
import com.plcoding.e_book.presentation.Login.defaultPadding
import com.plcoding.e_book.presentation.Login.itemSpacing
import com.plcoding.e_book.presentation.payment.paymentViewModel
import com.plcoding.e_book.ui.theme.EBookTheme
import com.plcoding.e_book.ui.theme.PrimaryKeyColor
import com.plcoding.e_book.ui.theme.SecondaryKeyColor

@Composable
fun RegisterScreen(
    onRegisterClick: () -> Unit,
    onLoginClick: () -> Unit,
    onTermClick: () -> Unit,
    onPrivacyClick: () -> Unit,
    viewModel: paymentViewModel = hiltViewModel()
) {

    val register by viewModel.register.observeAsState()

    LaunchedEffect(register) {
        register?.let { l ->
            onRegisterClick()
        }

    }

    val (userName, onUserNameChange) = rememberSaveable { mutableStateOf("") }
    val (email, onEmailChange) = rememberSaveable { mutableStateOf("") }
    val (phoneNumber, onPhoneNumberChange) = rememberSaveable { mutableStateOf("") }
    val (password, onPasswordChange) = rememberSaveable { mutableStateOf("") }
    val (confirmPassword, onConfirmPasswordChange) = rememberSaveable { mutableStateOf("") }
    val (fullName, onfullNameChange) = rememberSaveable { mutableStateOf("") }
    val (agree, onAgreeChange) = rememberSaveable { mutableStateOf(false) }
    var isUserNameValid by remember { mutableStateOf(true) }
    var isFullNameValid by remember { mutableStateOf(false) }
    var isPasswordSame by remember { mutableStateOf(false) }
    var isPhoneNumberValid by remember { mutableStateOf(true) }
    var isEmailValid by remember { mutableStateOf(true) }
    var isPasswordValid by remember { mutableStateOf(true) }
    var hasInteractedWithOthers by remember { mutableStateOf(false) }
    val isFieldsNotEmpty = userName.isNotEmpty() &&
            email.isNotEmpty() && phoneNumber.isNotEmpty() &&
            password.isNotEmpty() &&
            confirmPassword.isNotEmpty() && agree

    val account = registerPost(userName, password, confirmPassword, email, phoneNumber, fullName)
    val context = LocalContext.current
    val screenHeight = LocalConfiguration.current.screenHeightDp.dp


    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
            modifier = Modifier.padding(
                start = defaultPadding,
                end = defaultPadding,
                top = (screenHeight - 650.dp) / 2,
                bottom = defaultPadding
            ),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            HeaderText(
                text = "Đăng Ký",
                modifier = Modifier
                    .padding(vertical = defaultPadding)
                    .align(alignment = Alignment.CenterHorizontally), // Đặt căn giữa cho phần header text
            )
            Spacer(Modifier.height(defaultPadding))

            Spacer(modifier = Modifier.width(defaultPadding))
            Column {
                LoginTextField(
                    value = fullName,
                    onValueChange = onfullNameChange,
                    labelText = "Họ và tên",
                    modifier = Modifier.fillMaxWidth(),
                    keyboardType = KeyboardType.Text
                )
                if (!isFullNameValid && hasInteractedWithOthers) {
                    Text(
                        text = "Không để trống họ và tên",
                        color = PrimaryKeyColor,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.End)
                    )
                }
            }
            Spacer(Modifier.height(defaultPadding))
            Column {
                LoginTextField(
                    value = userName,
                    onValueChange = onUserNameChange,
                    labelText = "Tên đăng nhập",
                    modifier = Modifier.fillMaxWidth(),
                    keyboardType = KeyboardType.Text
                )
                if (!isUserNameValid && hasInteractedWithOthers) {
                    Text(
                        text = "Vui lòng nhập tên đăng nhập",
                        color = PrimaryKeyColor,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.End)
                    )
                }
            }
            Spacer(Modifier.height(defaultPadding))
            Column {
                LoginTextField(
                    value = phoneNumber,
                    onValueChange = {
                        onPhoneNumberChange(it)
                        isPhoneNumberValid = it.startsWith("0") && it.length == 10 && it.all { char -> char.isDigit() }
                    },
                    labelText = "Số điện thoại",
                    modifier = Modifier.fillMaxWidth(),
                    keyboardType = KeyboardType.Phone
                )
                if (!isPhoneNumberValid) {
                    Text(
                        text = "Số điện thoại không hợp lệ",
                        color = PrimaryKeyColor,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.End)
                    )
                }
            }
            Spacer(Modifier.height(defaultPadding))
            Column {
                LoginTextField(
                    value = email,
                    onValueChange = {
                        onEmailChange(it)
                        isEmailValid = Patterns.EMAIL_ADDRESS.matcher(it).matches()
                    },
                    labelText = "Email",
                    modifier = Modifier.fillMaxWidth(),
                    keyboardType = KeyboardType.Email
                )
                if (!isEmailValid) {
                    Text(
                        text = "Email không hợp lệ",
                        color = PrimaryKeyColor,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.End)
                    )
                }
            }
            Spacer(Modifier.height(defaultPadding))
            LoginTextField(
                value = password,
                onValueChange = {
                    onPasswordChange(it)
                    isPasswordValid = it.length >= 8
                },
                labelText = "Mật khẩu",
                modifier = Modifier.fillMaxWidth(),
                keyboardType = KeyboardType.Password,
            )
                if (!isPasswordValid) {
                    Text(
                        text = "Mật khẩu phải có ít nhất 8 ký tự",
                        color = PrimaryKeyColor,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.End)
                    )
                }
            Spacer(Modifier.height(defaultPadding))
            Column {
                LoginTextField(
                    value = confirmPassword,
                    onValueChange = {
                        onConfirmPasswordChange(it)
                        isPasswordSame = password != it
                    },
                    labelText = "Xác nhận mật khẩu",
                    modifier = Modifier.fillMaxWidth(),
                    keyboardType = KeyboardType.Password
                )
                if (isPasswordSame) {
                    Text(
                        text = "Mật khẩu không khớp",
                        color = PrimaryKeyColor,
                        fontSize = 12.sp,
                        modifier = Modifier.align(Alignment.End)
                    )
                }
            }
            Spacer(Modifier.height(defaultPadding))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                val privacyText = "Điều khoản dịch vụ"
                val policyText = "Chính sách bảo mật"
                val annotatedString = buildAnnotatedString {
                    withStyle(SpanStyle(color = MaterialTheme.colorScheme.onBackground)) {
                        append("Tôi đồng ý với")
                    }
                    append(" ")
                    withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                        pushStringAnnotation(tag = policyText, policyText)
                        append(privacyText)
                    }
                    append(" và ")
                    withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                        pushStringAnnotation(tag = privacyText, privacyText)
                        append(policyText)
                    }
                    append(" của phần mềm")
                    withStyle(SpanStyle(color = MaterialTheme.colorScheme.primary)) {
                    }
                }

                Checkbox(agree, onAgreeChange)
                ClickableText(
                    annotatedString,
                ) { offset ->
                    annotatedString.getStringAnnotations(offset, offset).forEach {
                        when (it.tag) {
                            policyText -> {
                                Toast.makeText(context, "Điều khoản dịch vụ", Toast.LENGTH_SHORT)
                                    .show()
                                onTermClick()
                            }

                            privacyText -> {
                                Toast.makeText(context, "Chính sách bảo mật", Toast.LENGTH_SHORT)
                                    .show()
                                onPrivacyClick()
                            }
                        }
                    }
                }
            }
            Spacer(Modifier.height(defaultPadding + 8.dp))
            Button(
                onClick = {
                    viewModel.createAccount(account)
//                isPasswordSame = password != confirmPassword
//                if (!isPasswordSame) {
//                    onRegisterClick()
//                }
                },
                modifier = Modifier.fillMaxWidth(),
                enabled = isFieldsNotEmpty,
                colors = ButtonDefaults.buttonColors(
                    containerColor = PrimaryKeyColor,
                    contentColor = SecondaryKeyColor
                )
            ) {
                Text("Đăng ký")
            }
            Spacer(Modifier.height(defaultPadding))
            AlternativeRegisterOptions(
                onIconClick = { index: Int ->

                },
                onLoginClick = onLoginClick
            )
            }
        }
    }

@Composable
fun AlternativeRegisterOptions(
    onIconClick: (index: Int) -> Unit,
    onLoginClick: () -> Unit,
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
            Text("Bạn đã có tài khoản?")
            Spacer(Modifier.height(itemSpacing))
            TextButton(onClick = onLoginClick) {
                Text("Đăng nhập")
            }
        }
    }

}
@Preview(showSystemUi = true)
@Composable
fun PrevRegister() {
    EBookTheme {
        RegisterScreen({}, {}, {}, {})
    }
}












