package com.androidexercises.recipesapp.presentation.recipeFinder

import com.androidexercises.recipesapp.domain.usecases.GetRecipesUseCase
import javax.inject.Inject

class RecipeFinderViewModel @Inject constructor(
private val getRecipesUseCase: GetRecipesUseCase
)
{
}