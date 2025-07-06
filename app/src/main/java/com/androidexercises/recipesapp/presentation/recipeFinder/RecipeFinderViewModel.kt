package com.androidexercises.recipesapp.presentation.recipeFinder

import androidx.lifecycle.ViewModel
import com.androidexercises.recipesapp.domain.usecases.GetRecipesUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class RecipeFinderViewModel @Inject constructor(
private val getRecipesUseCase: GetRecipesUseCase
) : ViewModel()
{
}