package com.plcoding.e_book.presentation.navgragh

import android.util.Log
import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navigation
import com.plcoding.e_book.presentation.book.UnpaidBookDetailsScreen
import com.plcoding.e_book.presentation.books_navigation.BooksNavigator
import com.plcoding.e_book.presentation.onboarding.OnBoardingScreen
import com.plcoding.e_book.presentation.onboarding.OnBoardingViewModel

@Composable
fun NavGragh(
    startDestination: String
) {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = startDestination) {
        Log.d("halo2","halo1")
        navigation(
            route = Route.AppStartNavigation.route,
            startDestination = Route.OnBoardingScreen.route
        ) {
            composable(route = Route.OnBoardingScreen.route) {
                val viewModel: OnBoardingViewModel = hiltViewModel()
                OnBoardingScreen(onEvent = viewModel::onEvent)
            }
        }
        navigation(
            route = Route.BooksNavigation.route,
            startDestination = Route.BooksNavigatorScreen.route
        ) {

            composable(route = Route.BooksNavigatorScreen.route) {

                BooksNavigator()

            }
        }
    }
}
