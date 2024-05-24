package com.plcoding.e_book.mainActivity

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.lifecycle.lifecycleScope
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.plcoding.e_book.domain.model.Login.Result
import com.plcoding.e_book.domain.model.Login.loginPost
import com.plcoding.e_book.domain.model.Order.OrderDetail
import com.plcoding.e_book.domain.model.Register.registerPost
import com.plcoding.e_book.presentation.category.CategoryViewModel
import com.plcoding.e_book.presentation.navgragh.NavGragh
import com.plcoding.e_book.presentation.payment.paymentViewModel
import com.plcoding.e_book.ui.theme.EBookTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainViewModel>()

    private val viewModel2: CategoryViewModel by viewModels()

    private val orderViewModel: paymentViewModel by viewModels()

    val orderDetails = listOf(OrderDetail(book_id = 4, quantity = 2))

    val account = Result(username = "beheo12", password = "11111111")

    val accoun2=registerPost(username = "hhh", password = "12345678", repassword = "12345678", email="asdfg", phonenumber = "0987654321", fullname = "lkjh")

    private val paymentViewModel: paymentViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        lifecycleScope.launch {
            orderViewModel.createAccount(
                accoun2
            )
        }

        /*lifecycleScope.launch {
            paymentViewModel.makePayment(
                orderId = 13,
                method = 2
            )
        }*/

        setContent {
            EBookTheme {
                val systemController = rememberSystemUiController()
                // A surface container using the 'background' color from the theme
                Box(modifier = Modifier
                    .background(MaterialTheme.colorScheme.background)
                    .fillMaxSize()) {
                    val startDestination = viewModel.startDestination
                    NavGragh(startDestination = startDestination)
                    //CommentListScreen(onNavigate = {}, navigateUp = {})
                    //CommentScreen(viewModel = commentViewModel, navigateUp = {})

                }
            }
        }
    }
}
