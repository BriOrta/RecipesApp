package com.androidexercises.recipesapp.data

import com.androidexercises.recipesapp.domain.models.Recipe
import com.androidexercises.recipesapp.domain.repository.RecipeRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class RecipeDaoImpl(
    val retrofitHelper : RetrofitHelper
) : RecipeDao {

    override suspend fun getRecipes(): List<Recipe> {
        val retrofit = retrofitHelper.getRetrofit()

        return withContext(Dispatchers.IO){
            retrofit.create(RecipeRepository::class.java).getRecipes()
        }
    }


}