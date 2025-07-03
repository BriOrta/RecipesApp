package com.androidexercises.recipesapp.presentation.recipeDetails

import android.content.Intent
import com.androidexercises.recipesapp.domain.usecases.GetRecipesUseCase
import javax.inject.Inject

class RecipeDetailsViewModel @Inject constructor(
    private val getRecipesUseCase: GetRecipesUseCase
)
{

    fun handleIntent(intent: Intent){
        when(intent){


        }
    }
}