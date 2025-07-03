package com.androidexercises.recipesapp.domain.usecases

import com.androidexercises.recipesapp.domain.models.Recipe
import com.androidexercises.recipesapp.domain.repository.RecipeRepository
import javax.inject.Inject

class GetRecipesUseCase @Inject constructor(
    val repository: RecipeRepository
) {
    suspend operator fun invoke() : List<Recipe>? = repository.getRecipes()
}