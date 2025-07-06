package com.androidexercises.recipesapp.presentation.recipeList

import androidx.lifecycle.ViewModel
import com.androidexercises.recipesapp.domain.usecases.GetRecipesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeListViewModel @Inject constructor(
    private val getRecipesUseCase: GetRecipesUseCase
) : ViewModel() {

}