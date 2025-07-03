package com.androidexercises.recipesapp.di

import com.androidexercises.recipesapp.data.RecipeDao
import com.androidexercises.recipesapp.data.RecipeRepositoryImpl
import com.androidexercises.recipesapp.domain.repository.RecipeRepository
import com.androidexercises.recipesapp.domain.usecases.GetRecipesUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.components.SingletonComponent
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DIManager {

    @Provides
    @Singleton
    fun provideRecipeRepository(dao: RecipeDao): RecipeRepository {
        return RecipeRepositoryImpl(dao = dao)
    }

    @Provides
    @Singleton
    fun provideRecipeUseCases(repository: RecipeRepository): GetRecipesUseCase {
        return GetRecipesUseCase(
            repository = repository
        )
    }
}