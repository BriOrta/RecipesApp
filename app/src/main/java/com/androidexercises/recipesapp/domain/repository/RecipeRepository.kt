package com.androidexercises.recipesapp.domain.repository

import com.androidexercises.recipesapp.domain.models.Recipe
import retrofit2.http.GET

interface RecipeRepository {
    @GET("/.json")
    suspend fun getRecipes() : List<Recipe>
}