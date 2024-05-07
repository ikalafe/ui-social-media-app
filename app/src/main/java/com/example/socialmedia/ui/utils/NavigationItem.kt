package com.example.socialmedia.ui.utils

import com.example.socialmedia.R

open class NavigationItem(var route: String, var icon: Int, var title: String) {
    object Home:NavigationItem("home", R.drawable.baseline_home_filled_24,"Home")
    object Search:NavigationItem("search", R.drawable.baseline_search_24,"Search")
    object Add:NavigationItem("add", R.drawable.baseline_add_circle_outline_24,"Add")
    object Activities:NavigationItem("activities", R.drawable.baseline_favorite_border_24,"Activities")
    object Profile:NavigationItem("profile", R.drawable.baseline_person_2_24,"Profile")
}