package com.androiddevs.mvvmnewsapp.dataclass

data class NewsResponse(
    val articles: MutableList<Article>,
    val status: String,
    val totalResults: Int
)