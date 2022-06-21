package com.example.menu.android.presentation.navigation

sealed class Screen(val route: String) {
    object RecipeList : Screen("recipeList")
    object RecipeDetails : Screen("recipeDetails")
}
