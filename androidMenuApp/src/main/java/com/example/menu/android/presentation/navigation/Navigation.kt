package com.example.menu.android.presentation.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(){
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = Screen.RecipeList.route ){
        composable(route=Screen.RecipeList.route){ navBackStackEntry ->  
            Column{
                Text("Recelipe list screen")
                Divider()
                Button(onClick = { navController.navigate(Screen.RecipeDetails.route)}) {
                    Text(text = "Go to Recipe Details")
                    
                }
                
            }
        }
        
        composable(route=Screen.RecipeDetails.route){
            Text(text = "Recipe Details Screen")
        }
    }
    
}