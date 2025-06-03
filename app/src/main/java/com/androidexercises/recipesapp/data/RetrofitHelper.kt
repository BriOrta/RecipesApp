package com.androidexercises.recipesapp.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitHelper {

    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/meals")
            .addConverterFactory(
            GsonConverterFactory.create())
            .build()
    }
}