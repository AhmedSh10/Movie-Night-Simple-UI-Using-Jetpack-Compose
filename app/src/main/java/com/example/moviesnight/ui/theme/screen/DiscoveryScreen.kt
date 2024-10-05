package com.example.moviesnight.ui.theme.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.moviesnight.ui.theme.components.sections.ComingSoonSection
import com.example.moviesnight.ui.theme.components.sections.FeaturedMovieSection
import com.example.moviesnight.ui.theme.components.sections.HorizontalSection
import com.example.moviesnight.ui.theme.data.DiscoverScreenState


@Composable
fun DiscoveryScreen(
    modifier: Modifier = Modifier,
    screenState: DiscoverScreenState
) {

    val scrollState = rememberScrollState()

    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
        verticalArrangement = Arrangement.spacedBy(24.dp)
    ) {

        FeaturedMovieSection(
            data = screenState.featuredMovieStates
        )
        ComingSoonSection(
            data = screenState.upComingMovies,
            modifier = Modifier.padding(horizontal = 18.dp)
        )

        HorizontalSection(
            data = screenState.recentlyWatchedMovieStates,
            title = "Recently Watched"
        )

        HorizontalSection(
            data = screenState.streamingMovieStates,
            title = "Streaming Now"
        )



    }
}