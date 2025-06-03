package com.androidexercises.recipesapp.domain.models

import com.google.gson.annotations.SerializedName

data class Recipe(
    @SerializedName("idMeal") val id: Int,
    @SerializedName("strMeal") val name: String,
    @SerializedName("strCategory") val category: String,
    @SerializedName("strArea") val area: String,
    @SerializedName("strInstructions") val instructions: String,
    @SerializedName("strMealThumb") val image: String,
    @SerializedName("strTags") val tags: List<String>, //TODO: Divide the incoming string with the , char and make the list
    @SerializedName("strYoutube") val youtubeUrl: String,
    @SerializedName("strSource") val source: String, //TODO: Check for null
    val ingredients: List<Pair<String, String>> //TODO: 1st string is ingredient name, 2nd string is quantity // Check for empty strings and null (1-20)
)
