package com.example.menu.android.presentation.recipe_details

import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import com.example.menu.android.presentation.navigation.Screen

@Composable
fun RecipeDetailsScreen(
    recipeId: Int?,
) {
    if (recipeId == null) {
        Text(text = "ERROR")
    }else {
        Text(text = "Recipe Details Screen: $recipeId")
    }
}