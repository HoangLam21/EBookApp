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
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.core.view.WindowCompat
import androidx.navigation.NavController
import com.google.accompanist.systemuicontroller.rememberSystemUiController
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.presentation.navgragh.NavGragh
import com.plcoding.e_book.presentation.navgragh.Route
import com.plcoding.e_book.ui.theme.EBookTheme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        WindowCompat.setDecorFitsSystemWindows(window, false)

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
