package com.gonzalo.monzon.movies.application.repositories

import com.gonzalo.monzon.movies.domain.datasources.RemoteMovieDataSource
import com.gonzalo.monzon.movies.domain.model.Movie
import com.gonzalo.monzon.movies.domain.model.TimeWindow
import com.gonzalo.monzon.movies.domain.repositories.MovieRepository

class MovieRepositoryImpl(private val remoteMovieDataSource: RemoteMovieDataSource) :
    MovieRepository {
    override suspend fun getMoviesTrends(page: Int, timeWindow: TimeWindow): List<Movie> =
        remoteMovieDataSource.getMoviesTrends(page = page, timeWindow = timeWindow)
}