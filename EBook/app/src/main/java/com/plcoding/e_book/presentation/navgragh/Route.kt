package com.plcoding.e_book.presentation.navgragh

import androidx.navigation.NamedNavArgument


sealed class Route(
    val route: String,
    val arguments: List<NamedNavArgument> = emptyList()
){
    object OnBoardingScreen : Route(route = "onBoardingScreen")

    object HomeScreen : Route(route = "homeScreen")

    object SearchScreen : Route(route = "searchScreen")

    object BookmarkScreen : Route(route = "bookMarkScreen")

    object DetailsScreen : Route(route = "detailsScreen")

    object AppStartNavigation : Route(route = "appStartNavigation")

    object BooksNavigation : Route(route = "booksNavigation")

    object BooksNavigatorScreen : Route(route = "booksNavigator")

    object UpgradeAccountScreen : Route(route = "upgradeAccountScreen")

    object PaidDetailsScreen : Route(route = "paidDetailsScreen")

    object AccountScreen : Route(route="accountScreen")

    object CategoryScreen : Route(route="categoryScreen")

    object FavoriteScreen : Route(route="favriteBookScreen")

    object ReadingScreen : Route(route = "readingScreen/{chapterIndex}") {
        fun createRoute(chapterIndex: Int) = "readingScreen/$chapterIndex"
    }
}