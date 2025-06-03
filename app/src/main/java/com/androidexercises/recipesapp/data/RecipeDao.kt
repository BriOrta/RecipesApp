package com.androidexercises.recipesapp.data

import com.androidexercises.recipesapp.domain.models.Recipe

interface RecipeDao {
    suspend fun getRecipes() : List<Recipe>
}