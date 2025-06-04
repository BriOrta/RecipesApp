package com.androidexercises.recipesapp.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.androidexercises.recipesapp.presentation.destinations.RecipeDetailsDestination
import com.androidexercises.recipesapp.presentation.destinations.RecipeFinderDestination
import com.androidexercises.recipesapp.presentation.destinations.RecipeListDestination
import com.androidexercises.recipesapp.presentation.recipeDetails.RecipeDetailsScreen
import com.androidexercises.recipesapp.presentation.recipeFinder.RecipeFinderScreen
import com.androidexercises.recipesapp.presentation.recipeList.RecipeListScreen
import com.androidexercises.recipesapp.presentation.theme.RecipesAppTheme

class RecipesActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            RecipesAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    RecipesNavHost(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun RecipesNavHost(modifier: Modifier = Modifier) {
    NavHost(
        modifier = modifier,
        navController = rememberNavController(),
        startDestination = RecipeDetailsDestination
    ){
        composable<RecipeDetailsDestination>{
            RecipeDetailsScreen()
        }

        composable<RecipeListDestination>{
            RecipeListScreen()
        }

        // TODO: This could be an icon at the top of the screen to navigate to the recipe finder
        composable<RecipeFinderDestination>{
            RecipeFinderScreen()
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipeNavHostPreview() {
    RecipesAppTheme {
        RecipesNavHost()
    }
}