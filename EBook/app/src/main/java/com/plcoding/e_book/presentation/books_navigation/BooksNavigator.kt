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
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import androidx.paging.compose.collectAsLazyPagingItems
import com.plcoding.e_book.domain.model.Books.Result
import com.plcoding.e_book.presentation.Account.Account
import com.plcoding.e_book.presentation.book.BookDetailsViewModel
import com.plcoding.e_book.presentation.book.DetailsEvent
import com.plcoding.e_book.presentation.book.PaidBookDetailsScreen
import com.plcoding.e_book.presentation.book.UnpaidBookDetailsScreen
import com.plcoding.e_book.presentation.books_navigation.components.BooksBottomNavigation
import com.plcoding.e_book.presentation.books_navigation.components.BooksBottomNavigationItem
import com.plcoding.e_book.presentation.category.CategoryScreen
import com.plcoding.e_book.presentation.category.CategoryViewModel
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookScreen
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookViewModel
import com.plcoding.e_book.presentation.home.HomeScreen
import com.plcoding.e_book.presentation.home.HomeViewModel
import com.plcoding.e_book.presentation.navgragh.Route
import com.plcoding.e_book.presentation.reading.ChapterScreen
import com.plcoding.e_book.presentation.upgrade.Upgrade
import com.plcoding.e_book.presentation.upgrade_account.UpgradeAccountScreen

@Composable
fun BooksNavigator() {

    val bottomNavigationItems = remember {
        listOf(
            BooksBottomNavigationItem(icon = "\uf015") ,
            BooksBottomNavigationItem(icon = "\uf02d"),
            BooksBottomNavigationItem(icon = "\uf007")

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
            Route.BookmarkScreen.route -> 1
            Route.AccountScreen.route -> 2
            else -> 0
        }
    }

    val isBottomBarVisible = remember(key1 = backstackState){
        backstackState?.destination?.route == Route.HomeScreen.route
                || backstackState?.destination?.route == Route.SearchScreen.route
                ||backstackState?.destination?.route == Route.BookmarkScreen.route
                ||backstackState?.destination?.route==Route.AccountScreen.route
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
                                route = Route.BookmarkScreen.route
                            )

                            2 -> navigateToTab(
                                navController = navController,
                                route = Route.AccountScreen.route
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
                val resultitem = viewModel.book.collectAsLazyPagingItems()
                val category = viewModel.category.collectAsLazyPagingItems()
                HomeScreen(
                    books = resultitem,
                    navigateToSearch = {
                        navigateToTab(
                            navController = navController,
                            route = Route.SearchScreen.route
                        )
                    },
                    navigateToDetail = {
                            result ->
                        navigateToDetails(navController = navController, result = result)
                    }, category=category,
                    navigateToCategory = {
                        navigateToTab(
                            navController=navController,
                            route=Route.CategoryScreen.route
                        )
                    }, navigateToLike = {
                        navController.navigate( Route.FavoriteScreen.route)
                    }
                )
            }
            Log.d("da vo viewmd","111")

            composable(route = Route.DetailsScreen.route){

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
                        navigateUpgrade = {
                            navController.navigate( Route.UpgradeAccountScreen.route)
                        }
                    )
                }
            }
            composable(route = Route.PaidDetailsScreen.route){

                val viewModel: BookDetailsViewModel = hiltViewModel()
                val resultitem = viewModel.books.collectAsLazyPagingItems()

                if(viewModel.sideEffect!=null){
                    Toast.makeText(LocalContext.current, viewModel.sideEffect, Toast.LENGTH_SHORT).show()
                    viewModel.onEvent(DetailsEvent.RemoveSideEffect)

                }
                navController.previousBackStackEntry?.savedStateHandle?.get<Result>("book")?.let{
                        result ->
                    PaidBookDetailsScreen(
                        result = result,
                        event = viewModel::onEvent,
                        navigateUp = {navController.navigateUp()},
                        navigateReading = { chapterIndex ->
                            navController.navigate(Route.ReadingScreen.createRoute(chapterIndex))
                        },
                    )
                }
            }


            composable(route = Route.FavoriteScreen.route){

                val viewModel: FavouriteBookViewModel = hiltViewModel()
                val state = viewModel.state.value
                FavouriteBookScreen(state = state,
                    navigateToDetails = {result -> navigateToDetails(navController =navController, result = result)},
                    navigateUp = {navController.navigateUp()})
            }

//            composable(route = Route.FavoriteScreen.route) {
//                val viewModel: FavouriteBookViewModel = hiltViewModel()
//               val state = viewModel.state.value
//                FavouriteBookScreen(state = state,
//                    navigateToDetails = {result -> navigateToDetails(navController =navController, result = result)  })
//            }

            composable(route = Route.BookmarkScreen.route){
//                val viewModel: FavouriteBookViewModel = hiltViewModel()
//                val state = viewModel.state.value
//                FavouriteBookScreen(state = state,
//                    navigateToDetails = {result -> navigateToDetails(navController =navController, result = result)  })
            }
            composable(route = Route.UpgradeAccountScreen.route){
                UpgradeAccountScreen(navigateUp = {navController.navigateUp()} )
            }
            composable(route=Route.AccountScreen.route){
                Account()
            }

            composable(
                route = Route.ReadingScreen.route,
                arguments = listOf(navArgument("chapterIndex") { type = NavType.IntType })
            ) { backStackEntry ->
                val chapterIndex = backStackEntry.arguments?.getInt("chapterIndex") ?: 0
                ChapterScreen(chapterIndex, navigateUp = { navController.navigateUp() })
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
    val route = if (result.id == 1 || result.id == 2|| result.id == 3) {
        Route.DetailsScreen.route
    } else {
        Route.PaidDetailsScreen.route
    }
    navController.navigate(route)
}
