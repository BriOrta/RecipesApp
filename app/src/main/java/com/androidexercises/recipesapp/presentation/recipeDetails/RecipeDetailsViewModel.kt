package com.androidexercises.recipesapp.presentation.recipeDetails

import android.content.Intent
import androidx.lifecycle.ViewModel
import com.androidexercises.recipesapp.domain.usecases.GetRecipesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeDetailsViewModel @Inject constructor(
    private val getRecipesUseCase: GetRecipesUseCase
) : ViewModel()
{

    fun handleIntent(intent: Intent){
        when(intent){


        }
    }
}