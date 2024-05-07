package com.example.socialmedia.ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.socialmedia.R
import com.example.socialmedia.model.Story
import com.example.socialmedia.ui.theme.Purple40
import com.example.socialmedia.ui.theme.RedColor
import com.example.socialmedia.ui.theme.ShadowColor

@Composable
fun StoriesView(stories: ArrayList<Story>, navController: NavController) {
    LazyRow {
        item {
            MyStoryItem()
        }
        items(stories.size) {
            StoryItem(stories[it], navController = navController)
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun StoryItem(story: Story, navController: NavController) {
    Card(
        shape = RoundedCornerShape(10.dp),
        modifier = Modifier.padding(6.dp),
        border = BorderStroke(2.dp, if (story.isLive) RedColor else Purple40),
        onClick = {
            navController.navigate("showStory/${story.id}")
        }
    ) {
        Box(modifier = Modifier.width(70.dp).height(100.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(story.profile)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.loading),
                contentDescription = story.userName,
                contentScale = ContentScale.Crop
            )
            Box(Modifier.fillMaxSize().background(ShadowColor)) {}
            Text(
                text = story.userName,
                color = Color.White,
                fontSize = 9.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.align(Alignment.Center)
            )
            if (story.isLive) {
                Text(
                    text = "LIVE",
                    color = Color.White,
                    fontSize = 7.sp,
                    modifier = Modifier.background(RedColor)
                        .align(Alignment.BottomCenter)
                        .padding(3.dp, 1.dp)
                )
            }
        }
    }
}


@Composable
fun MyStoryItem() {
    val story = Story(
        0,
        "Dani Kalafe",
        R.drawable.danikalafe,
        false
    )
    Card(
        shape = RoundedCornerShape(15.dp),
        modifier = Modifier.padding(6.dp)
    ) {
        Box(modifier = Modifier.width(70.dp).height(100.dp)) {
            AsyncImage(
                model = ImageRequest.Builder(LocalContext.current)
                    .data(story.profile)
                    .crossfade(true)
                    .build(),
                placeholder = painterResource(R.drawable.loading),
                contentDescription = story.userName,
                contentScale = ContentScale.Crop
            )
            Box(Modifier.fillMaxSize().background(ShadowColor))
            Icon(
                painter = painterResource(R.drawable.baseline_add_circle_24),
                contentDescription = story.userName,
                tint = Color.White,
                modifier = Modifier.align(Alignment.Center).size(28.dp)
            )
        }
    }
}

