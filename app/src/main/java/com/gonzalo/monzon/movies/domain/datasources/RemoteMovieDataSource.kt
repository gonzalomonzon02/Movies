package com.gonzalo.monzon.movies.domain.datasources

import com.gonzalo.monzon.movies.domain.model.Movie
import com.gonzalo.monzon.movies.domain.model.TimeWindow

interface RemoteMovieDataSource {
    suspend fun getMoviesTrends(page: Int, timeWindow: TimeWindow): List<Movie>
}