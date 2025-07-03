package com.androidexercises.recipesapp.data

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

const val URL = "https://www.themealdb.com/api/json/v1/1/meals/"
object RetrofitHelper {
    fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl("https://www.themealdb.com/api/json/v1/1/search.php?s=Arrabiata")
            .addConverterFactory(
            GsonConverterFactory.create())
            .build()
    }
}