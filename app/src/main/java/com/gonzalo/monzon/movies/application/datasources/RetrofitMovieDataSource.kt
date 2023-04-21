package com.gonzalo.monzon.movies.application.datasources

import com.gonzalo.monzon.movies.application.data.network.services.MovieService
import com.gonzalo.monzon.movies.application.data.toDomainMovie
import com.gonzalo.monzon.movies.domain.datasources.RemoteMovieDataSource
import com.gonzalo.monzon.movies.domain.model.Movie
import com.gonzalo.monzon.movies.domain.model.TimeWindow

class RetrofitMovieDataSource(private val movieService: MovieService) : RemoteMovieDataSource {
    override suspend fun getMoviesTrends(page: Int, timeWindow: TimeWindow): List<Movie> =
        movieService.getMoviesTrends(page = page, timeWindow = timeWindow.value)
            .results
            ?.map { it.toDomainMovie() }
            .orEmpty()
}