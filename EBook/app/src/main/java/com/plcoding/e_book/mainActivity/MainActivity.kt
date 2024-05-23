package com.plcoding.e_book.mainActivity

import android.os.Bundle
import android.util.Log
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
import com.plcoding.e_book.domain.model.Order.OrderDetail
import com.plcoding.e_book.domain.model.Order.Result
import com.plcoding.e_book.presentation.category.CategoryViewModel
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookViewModel
import com.plcoding.e_book.presentation.navgragh.NavGragh
import com.plcoding.e_book.presentation.order.OrderViewModel
import com.plcoding.e_book.presentation.payment.paymentViewModel
import com.plcoding.e_book.ui.theme.EBookTheme
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainViewModel>()

    private val viewModel2: CategoryViewModel by viewModels()

    private val orderViewModel: OrderViewModel by viewModels()

    val orderDetails = listOf(OrderDetail(book_id = 4, quantity = 2))

    private val paymentViewModel: paymentViewModel by viewModels()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

        lifecycleScope.launch {
            orderViewModel.createOrder(
                token="Bearer eyJhbGciOiJIUzI1NiJ9.eyJpc3MiOiJjb20uYXV0aGVudGljYXRpb24iLCJzdWIiOiJiZWhlbzEyIiwiZXhwIjoxNzE2Mzk5MzI1LCJpYXQiOjE3MTYzOTU3MjUsInNjb3BlIjoiQ1VTVE9NRVIgR0VUX01ZX1BBWU1FTlRTIEdFVF9NWV9CT09LUyBDQU5DTEVfT1JERVIgQ1JFQVRFX09SREVSIn0.WGio-Ai8zPoWLXaHjylxygAg5aw7NPx0XcXhG39UiXo",
                Result(
                    fullname = "John Doe",
                    order_note = "Please deliver between 9-12 AM",
                    address = "123 Main Street",
                    order_details = orderDetails
                )
            )
        }

        lifecycleScope.launch {
            paymentViewModel.makePayment(
                orderId = 13,
                method = 2
            )
        }

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
