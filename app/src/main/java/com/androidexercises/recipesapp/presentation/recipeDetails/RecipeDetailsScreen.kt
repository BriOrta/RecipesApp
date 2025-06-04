package com.androidexercises.recipesapp.presentation.recipeDetails

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Label
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.androidexercises.recipesapp.R

@Composable
internal fun RecipeDetailsScreen(
    modifier: Modifier = Modifier
) {
    Scaffold(modifier = modifier.fillMaxSize()) { innerPadding ->
        Column(
            modifier = modifier
                .fillMaxWidth()
                .padding(innerPadding)
                .padding(horizontal = 20.dp, vertical = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = "Sushi",
                textAlign = TextAlign.Center,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )

            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "The recipe image",
                modifier = Modifier.padding(top = 15.dp)
            )

            Text(
                text = "Type: Main dish",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 15.dp)
            )

            Text(
                text = "Origin: Japan",
                textAlign = TextAlign.Center
            )

            Text(
                text = "Tags: Japanese",
                textAlign = TextAlign.Center
            )

            Text(
                text = "Ingredients:",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 15.dp),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Instructions:",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 15.dp),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                text = "Video link:",
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 15.dp),
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            val clickableLink = buildAnnotatedString {
                // TODO: Change to the obtained link and change end
                append("http://somelink.com")
                addLink(url = LinkAnnotation.Url("http://somelink.com"), start = 0, end = 20)
            }

            Text(
                text = clickableLink,
                textAlign = TextAlign.Center,
                textDecoration = TextDecoration.Underline
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun RecipeDetailsScreenPreview() {

}