package com.example.menu.android.presentation.navigation

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navArgument
import androidx.navigation.compose.rememberNavController
import com.example.menu.android.presentation.recipe_details.RecipeDetailsScreen
import com.example.menu.android.presentation.recipe_list.RecipeListScreen

@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.RecipeList.route) {
        composable(route = Screen.RecipeList.route) { navBackStackEntry ->
            RecipeListScreen(
                onSelectRecipe = { recipeId ->
                    navController.navigate(Screen.RecipeDetails.route + "/$recipeId")
                }
            )
        }

        composable(
            route = Screen.RecipeDetails.route + "/{recipeId}",
            arguments = listOf(navArgument("recipeId"){
                type = NavType.IntType
            })

        ) {navBackStackEntry ->
            RecipeDetailsScreen(recipeId = navBackStackEntry.arguments?.getInt("recipeId"))
        }
    }

}