package com.example.socialmedia.model

data class Post(
    val user: User,
    val location: String,
    val image: String,
    val caption: String
)
