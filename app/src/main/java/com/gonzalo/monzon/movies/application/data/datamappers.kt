package com.gonzalo.monzon.movies.application.data

import com.gonzalo.monzon.movies.domain.model.Movie
import com.gonzalo.monzon.movies.application.data.network.model.Movie as ServerMovie

fun ServerMovie.toDomainMovie(): Movie =
    Movie(
        id = id ?: 0,
        title = title.orEmpty(),
        posterPath = posterPath.orEmpty(),
        voteAverage = voteAverage ?: 0.0
    )