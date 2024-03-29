package com.gonzalo.monzon.movies.domain.model

data class Movie(
    val id: Int,
    val title: String,
    val posterPath: String,
    val voteAverage: Double
)
