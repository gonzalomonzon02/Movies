package com.gonzalo.monzon.movies.domain.repositories

import com.gonzalo.monzon.movies.domain.model.Movie
import com.gonzalo.monzon.movies.domain.model.TimeWindow

interface MovieRepository {
    suspend fun getMoviesTrends(page: Int = 1, timeWindow: TimeWindow = TimeWindow.DAY): List<Movie>
}