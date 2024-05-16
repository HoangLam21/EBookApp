package com.plcoding.e_book.presentation.books_navigation

import android.util.Log
import android.widget.Toast
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.paging.compose.collectAsLazyPagingItems
import com.plcoding.e_book.R
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.presentation.book.BookDetailsViewModel
import com.plcoding.e_book.presentation.book.DetailsEvent
import com.plcoding.e_book.presentation.book.UnpaidBookDetailsScreen
import com.plcoding.e_book.presentation.books_navigation.components.BooksBottomNavigation
import com.plcoding.e_book.presentation.books_navigation.components.BooksBottomNavigationItem
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookScreen
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookViewModel
import com.plcoding.e_book.presentation.home.HomeScreen
import com.plcoding.e_book.presentation.home.HomeViewModel
import com.plcoding.e_book.presentation.navgragh.Route

@Composable
fun BooksNavigator() {

    val bottomNavigationItems = remember {
        listOf(
            BooksBottomNavigationItem(icon = R.drawable.ic_home, text = "Home") ,
            BooksBottomNavigationItem(icon = R.drawable.ic_search, text = "Search"),
            BooksBottomNavigationItem(icon = R.drawable.ic_bookmark, text = "Bookmark")

        )
    }

    val navController = rememberNavController()
    val backstackState = navController.currentBackStackEntryAsState().value
    var selectedItem by rememberSaveable {
        mutableStateOf(0)
    }

    selectedItem = remember(key1 = backstackState) {
        when(backstackState?.destination?.route){
            Route.HomeScreen.route -> 0
            Route.SearchScreen.route -> 1
            Route.BookmarkScreen.route -> 2
            else -> 0
        }
    }

    val isBottomBarVisible = remember(key1 = backstackState){
        backstackState?.destination?.route == Route.HomeScreen.route
                || backstackState?.destination?.route == Route.SearchScreen.route
                ||backstackState?.destination?.route == Route.BookmarkScreen.route
    }

    Scaffold(
        modifier = Modifier.fillMaxSize(),

        bottomBar = {
            if(isBottomBarVisible){
                BooksBottomNavigation(items = bottomNavigationItems,
                    selected = selectedItem,
                    onItemClick = {index ->
                        when (index) {
                            0 -> navigateToTab(
                                navController = navController,
                                route = Route.HomeScreen.route
                            )

                            1 -> navigateToTab(
                                navController = navController,
                                route = Route.SearchScreen.route
                            )

                            2 -> navigateToTab(
                                navController = navController,
                                route = Route.BookmarkScreen.route
                            )
                        }
                    }
                )
            }

        }
    ) {
        val bottomPadding = it.calculateBottomPadding()
        NavHost(
            navController = navController,
            startDestination = Route.HomeScreen.route,
            modifier = Modifier.padding(bottom = bottomPadding)
        ) {

            composable(route = Route.HomeScreen.route) { backStackEntry ->
                val viewModel: HomeViewModel = hiltViewModel()
                val resultitem = viewModel.books.collectAsLazyPagingItems()
                HomeScreen(
                    resultitem = resultitem,
                    navigateToSearch = {
                        navigateToTab(
                            navController = navController,
                            route = Route.SearchScreen.route
                        )
                    },
                    navigateToDetail = {
                            result ->
                        navigateToDetails(navController = navController, result = result)
                    }
                )
            }
            Log.d("da vo viewmd","111")

            composable(route = Route.DetailsScreen.route){
                Log.d("da vo viewmd","111")

                val viewModel: BookDetailsViewModel = hiltViewModel()
                val resultitem = viewModel.books.collectAsLazyPagingItems()

                if(viewModel.sideEffect!=null){
                    Toast.makeText(LocalContext.current, viewModel.sideEffect, Toast.LENGTH_SHORT).show()
                    viewModel.onEvent(DetailsEvent.RemoveSideEffect)

                }
                navController.previousBackStackEntry?.savedStateHandle?.get<Result>("book")?.let{
                        result ->
                    UnpaidBookDetailsScreen(
                        result = result,
                        event = viewModel::onEvent,
                        navigateUp = {navController.navigateUp()},
                        resultitem = resultitem,
                        navigateToDetail = {
                                resultitem ->
                            navigateToDetails(navController = navController, result = resultitem)
                        },
                    )
                }
            }



            composable(route = Route.BookmarkScreen.route){
                val viewModel: FavouriteBookViewModel = hiltViewModel()
                val state = viewModel.state.value
                FavouriteBookScreen(state = state,
                    navigateToDetails = {result -> navigateToDetails(navController =navController, result = result)  })
            }
        }

    }
}



private fun navigateToTab(navController: NavController, route: String){
    navController.navigate(route ){
        navController.graph.startDestinationRoute?.let{ homeScreen ->
            popUpTo(homeScreen){
                saveState = true
            }
            restoreState = true
            launchSingleTop = true
        }
    }

}

private fun navigateToDetails(navController: NavController, result: Result) {
    navController.currentBackStackEntry?.savedStateHandle?.set("book", result)
    navController.navigate(
        route = Route.DetailsScreen.route
    )
}
