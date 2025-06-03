package com.androidexercises.recipesapp.data

import com.androidexercises.recipesapp.domain.models.Recipe
import com.androidexercises.recipesapp.domain.repository.RecipeRepository

class RecipeRepositoryImpl(
   val dao: RecipeDao
) : RecipeRepository {

    override suspend fun getRecipes(): List<Recipe> {
        return dao.getRecipes()
    }

}