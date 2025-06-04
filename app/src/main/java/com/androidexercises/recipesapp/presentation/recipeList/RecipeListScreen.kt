package com.androidexercises.recipesapp.presentation.recipeList

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.hilt.navigation.compose.hiltViewModel

@Composable
internal fun RecipeListScreen(
    modifier: Modifier = Modifier
){
    Scaffold(modifier = modifier.statusBarsPadding()) {
        Column(modifier = Modifier.padding(it)) {
            Text(text = "Recipe List", textAlign = TextAlign.Center)
        }
    }
}
