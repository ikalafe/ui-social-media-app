package com.example.socialmedia.ui.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.socialmedia.data.MockData
import com.example.socialmedia.ui.components.PostsView
import com.example.socialmedia.ui.components.StoriesView
import com.example.socialmedia.ui.theme.LightGray

@Composable
fun HomeScreen(navController: NavController) {
    Column {
        StoriesView(MockData.stories, navController = navController)
        Spacer(modifier = Modifier.height(7.dp))
        Divider(color = LightGray, thickness = 1.dp, modifier = Modifier.padding(15.dp, 0.dp))
        Spacer(modifier = Modifier.height(7.dp))
        PostsView(MockData.posts)
    }
}