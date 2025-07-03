package com.androidexercises.recipesapp.data

import com.androidexercises.recipesapp.domain.models.Recipe
import com.androidexercises.recipesapp.domain.repository.RecipeRepository
import javax.inject.Inject

class RecipeRepositoryImpl @Inject constructor(
   val dao: RecipeDao
) : RecipeRepository {

    override suspend fun getRecipes(): List<Recipe> {
        return dao.getRecipes()
    }

}