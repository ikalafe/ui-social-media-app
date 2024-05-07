package com.example.socialmedia.ui.components

import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.socialmedia.ui.utils.NavigationItem

@Composable
fun BottomBarView(navController: NavHostController) {
    val menu = listOf(
        NavigationItem.Home,
        NavigationItem.Search,
        NavigationItem.Add,
        NavigationItem.Activities,
        NavigationItem.Profile
    )
    var selectedRoute by remember { mutableStateOf("home") }
    BottomAppBar {
        menu.forEach {
            NavigationBarItem(
                selected = selectedRoute == it.route,
                onClick = {
                    navController.navigate(it.route) {
                        selectedRoute = it.route
                        navController.graph.startDestinationRoute?.let { route ->
                            popUpTo(route) {
                                saveState = true
                            }
                        }
                        launchSingleTop = true
                        restoreState = true
                    }
                },
                icon = {
                    Icon(painter = painterResource(id = it.icon), contentDescription = it.title)
                }
            )
        }
    }
}