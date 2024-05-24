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
import com.plcoding.e_book.presentation.Account.Account
import com.plcoding.e_book.presentation.Login.LoginScreen
import com.plcoding.e_book.presentation.Register.PrivacyPolicyScreen
import com.plcoding.e_book.presentation.Register.RegisterScreen
import com.plcoding.e_book.presentation.Register.TermConditionScreen
import com.plcoding.e_book.presentation.Search.SearchScreen
import com.plcoding.e_book.presentation.Search.SearchViewModel
import com.plcoding.e_book.presentation.book.BookDetailsViewModel
import com.plcoding.e_book.presentation.book.DetailsEvent
import com.plcoding.e_book.presentation.book.PaidBookDetailsScreen
import com.plcoding.e_book.presentation.book.UnpaidBookDetailsScreen
import com.plcoding.e_book.presentation.booksWithCategory.BooksWithCategoryScreen
import com.plcoding.e_book.presentation.books_navigation.components.BooksBottomNavigation
import com.plcoding.e_book.presentation.books_navigation.components.BooksBottomNavigationItem
import com.plcoding.e_book.presentation.category.CategoryScreen
import com.plcoding.e_book.presentation.category.CategoryViewModel
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookScreen
import com.plcoding.e_book.presentation.favourite_book.FavouriteBookViewModel
import com.plcoding.e_book.presentation.home.HomeScreen
import com.plcoding.e_book.presentation.home.HomeViewModel
import com.plcoding.e_book.presentation.mybook.MyBookScren
import com.plcoding.e_book.presentation.mybook.MyBookViewModel
import com.plcoding.e_book.presentation.navgragh.Route
import com.plcoding.e_book.presentation.payment.paymentViewModel
<<<<<<< HEAD
import com.plcoding.e_book.presentation.reading.ChapterScreen
import com.plcoding.e_book.presentation.reading_chapter.ReadingViewModel
=======
>>>>>>> 8b52d69a88919f7a8f123eed64f3f743f1acafad
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
            startDestination = Route.LoginScrn.route,
            modifier = Modifier.padding(bottom = bottomPadding)
        ) {

            composable(route = Route.LoginScrn.route) {
                LoginScreen(
                    onLoginClick = {
                        navController.navigate(Route.HomeScreen.route)
                    },
                    onRegisterClick = {
                        navController.navigate(Route.RegisterScrn.route)
                    }
                )

            }
            composable(route = Route.RegisterScrn.route) {
                RegisterScreen(
                    onLoginClick = {
                        navController.navigate(Route.LoginScrn.route)
                    },
                    onTermClick = {
                        navController.navigate(Route.TermScreen.route)
                    },
                    onPrivacyClick = {
                        navController.navigate(Route.PrivacyScreen.route)
                    },
                    onRegisterClick = {
                        navController.navigate(Route.LoginScrn.route)
                    }

                )
            }
            composable(route = Route.TermScreen.route) {
                TermConditionScreen(
                    onBtnClick = {
                        navController.navigate(Route.RegisterScrn.route)
                    }
                )
            }

            composable(route = Route.PrivacyScreen.route) {
                PrivacyPolicyScreen(
                    onBtnClick = {
                        navController.navigate(Route.RegisterScrn.route)
                    }
                )
            }

            composable(route = Route.HomeScreen.route) { backStackEntry ->
                val viewModel: HomeViewModel = hiltViewModel()
                val resultitem = viewModel.book.collectAsLazyPagingItems()
                val category = viewModel.category.collectAsLazyPagingItems()
<<<<<<< HEAD
                val booksWithDiscount = viewModel.booksWithDiscount
                val viewModel2: CategoryViewModel = hiltViewModel()
                val booksWithCategory = viewModel2.booksWithCategory
                HomeScreen(
                    books = resultitem, booksWithDiscount,
=======
                val booksWithDiscount =viewModel.booksWithDiscount
                val viewModel2: CategoryViewModel = hiltViewModel()
                val booksWithCategory = viewModel2.booksWithCategory
                HomeScreen(
                    books = resultitem,booksWithDiscount,
>>>>>>> 8b52d69a88919f7a8f123eed64f3f743f1acafad
                    navigateToSearch = {
                        navController.navigate(Route.SearchScreen.route)
                    },
                    navigateToDetail = { result ->
                        navigateToDetails(navController = navController, result = result)
                    },
<<<<<<< HEAD
                    category = category,
=======
                    category =category,
>>>>>>> 8b52d69a88919f7a8f123eed64f3f743f1acafad
                    navigateToCategory = {
                        navigateToTab(
                            navController = navController,
                            route = Route.CategoryScreen.route
                        )
                    },
                    navigateToBooksWithCategory = { categoryId ->
                        navigateToTab(
                            navController = navController,
                            route = Route.BooksWithCategoryScreen.route
                        )
<<<<<<< HEAD
                    }
=======
                    },
                    navigateToBooksWithCategory = { categoryId ->
                        navigateToTab(navController=navController, route=Route.BooksWithCategoryScreen.route)
                    }

                ) {
                    navController.navigate(Route.FavoriteScreen.route)
                }
            }
            Log.d("da vo viewmd","111")
>>>>>>> 8b52d69a88919f7a8f123eed64f3f743f1acafad

                ) {
                    navController.navigate(Route.FavoriteScreen.route)
                }
            }
            Log.d("da vo viewmd", "111")

            composable(route = Route.DetailsScreen.route) {

                val viewModel: BookDetailsViewModel = hiltViewModel()
                val resultitem = viewModel.books.collectAsLazyPagingItems()
<<<<<<< HEAD
                resultitem.itemSnapshotList.items.forEach { item ->
                    Log.d("MyBookScreen", "Book: $item")
                }
                if (viewModel.sideEffect != null) {
                    Toast.makeText(LocalContext.current, viewModel.sideEffect, Toast.LENGTH_SHORT)
                        .show()
                    viewModel.onEvent(DetailsEvent.RemoveSideEffect)

                }
                navController.previousBackStackEntry?.savedStateHandle?.get<Result>("book")
                    ?.let { result ->
                        UnpaidBookDetailsScreen(
                            result = result,
                            event = viewModel::onEvent,
                            navigateUp = { navController.navigateUp() },
                            resultitem = resultitem,
                            navigateToDetail = { resultitem ->
                                navigateToDetails(
                                    navController = navController,
                                    result = resultitem
                                )
                            },
                            navigateUpgrade = {
                                navController.navigate(Route.UpgradeAccountScreen.route)
                            }
                        )
                    }
            }



            composable(route=Route.SearchScreen.route){
                val viewModel: SearchViewModel = hiltViewModel()
                val state = viewModel.state.value
                SearchScreen(state = state, event = viewModel::onEvent) {

                }
            }
=======


                val orderId:Int

                if(viewModel.sideEffect!=null){
                    Toast.makeText(LocalContext.current, viewModel.sideEffect, Toast.LENGTH_SHORT).show()
                    viewModel.onEvent(DetailsEvent.RemoveSideEffect)

                }
                navController.previousBackStackEntry?.savedStateHandle?.get<com.plcoding.e_book.domain.model.Books.Result>("book")?.let{
                        result ->
                    UnpaidBookDetailsScreen(
                        result = result,
                        event = viewModel::onEvent,
                        navigateUp = {navController.navigateUp()},
                        resultitem = resultitem,
                        navigateToDetail = {
                                resultitem ->
                            navigateToDetails(navController = navController, result = resultitem)
                        }
//                        navigateToCheckout = {
//                            viewModel.createOrder(result.id)
//                            navigateToTab(navController = navController, route=Route.CheckoutScreen.route)                        }


                    )
                }
            }

            composable(route=Route.SearchScreen.route){
                val viewModel: SearchViewModel = hiltViewModel()
                val state = viewModel.state.value
                SearchScreen(state = state, event = viewModel::onEvent) {

                }
            }
>>>>>>> 8b52d69a88919f7a8f123eed64f3f743f1acafad
            composable(route = Route.CategoryScreen.route){
                val viewModel: CategoryViewModel = hiltViewModel()
                val books = viewModel.book.collectAsLazyPagingItems()
                val categories=viewModel.category.collectAsLazyPagingItems()
                CategoryScreen(books = books, category = categories, navigateUp = {navController.navigateUp()})
            }
            composable(route = Route.PaidDetailsScreen.route){

                val viewModel: BookDetailsViewModel = hiltViewModel()
                val resultitem = viewModel.books.collectAsLazyPagingItems()

                if(viewModel.sideEffect!=null){
                    Toast.makeText(LocalContext.current, viewModel.sideEffect, Toast.LENGTH_SHORT).show()
                    viewModel.onEvent(DetailsEvent.RemoveSideEffect)

                }
                navController.previousBackStackEntry?.savedStateHandle?.get<com.plcoding.e_book.domain.model.Books.Result>("book")?.let{
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

            composable(route = Route.BooksWithCategoryScreen.route) { backStackEntry ->
                val viewModel: CategoryViewModel = hiltViewModel()
                val categoryId = backStackEntry.arguments?.getInt("categoryId") ?: 0
                viewModel.setCategory(categoryId)

                BooksWithCategoryScreen(
                    books = viewModel.booksWithCategory,
                    categoryId = categoryId,
                    navigateUp = {
                        navController.navigateUp()
                    }
                )
            }
//            composable(route = Route.FavoriteScreen.route) {
//                val viewModel: FavouriteBookViewModel = hiltViewModel()
//               val state = viewModel.state.value
//                FavouriteBookScreen(state = state,
//                    navigateToDetails = {result -> navigateToDetails(navController =navController, result = result)  })
//            }

            composable(route = Route.BookmarkScreen.route){
                val viewModel: MyBookViewModel = hiltViewModel()
                val resultitem = viewModel.mybooks.collectAsLazyPagingItems()

                resultitem.itemSnapshotList.items.forEach { item ->
                    Log.d("MyBookScreen", "Book: $item")
                }
                MyBookScren(mybookitem = resultitem,
                    navigateToDetails = {result -> navigateToDetails(navController =navController, result = result)},
                    navigateUp = {navController.navigateUp()})
            }
<<<<<<< HEAD

            composable(route = Route.CheckoutScreen.route){
                UpgradeAccountScreen(navigateUp = {navController.navigateUp()} )
            }

            composable(route=Route.AccountScreen.route){
                Account()
            }

            composable(route = Route.UpgradeAccountScreen.route){
=======
            composable(route = Route.CheckoutScreen.route){
>>>>>>> 8b52d69a88919f7a8f123eed64f3f743f1acafad
                UpgradeAccountScreen(navigateUp = {navController.navigateUp()} )
            }

            composable(
                route = Route.ReadingScreen.route,
                arguments = listOf(navArgument("chapterIndex") { type = NavType.IntType }),
            ) { backStackEntry ->
                val viewModel: ReadingViewModel = hiltViewModel()

                val chapterIndex = backStackEntry.arguments?.getInt("chapterIndex") ?: 0
                ChapterScreen(chapterIndex, navigateUp = { navController.navigateUp() },viewModel)
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

private fun navigateToDetails(navController: NavController, result: com.plcoding.e_book.domain.model.Books.Result) {
    navController.currentBackStackEntry?.savedStateHandle?.set("book", result)
    val route = if (result.id == 1 || result.id == 2|| result.id == 3 || result.id==10) {
        Route.DetailsScreen.route
    } else {
        Route.PaidDetailsScreen.route
    }
    navController.navigate(route)
}

fun navigateToOrder(navController: NavController) {
    val action = Route.CheckoutScreen.route
    navController.navigate(action)
}
