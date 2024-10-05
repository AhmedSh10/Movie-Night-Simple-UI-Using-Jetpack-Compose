package com.example.moviesnight.ui.theme.data

data class DiscoverScreenState(
    val featuredMovieStates: List<FeaturedMovieState> =  featuredMoviesDatumStates,
    val upComingMovies: List<MovieThumbnailState> = UpComingMoviesData,
    val recentlyWatchedMovieStates: List<MovieThumbnailState> = RecentlyWatchedMoviesData,
    val streamingMovieStates: List<MovieThumbnailState> = StreamingMoviesData
)
