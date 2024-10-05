package com.example.moviesnight.ui.theme.components.sections

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.moviesnight.ui.theme.components.MovieThumbnail
import com.example.moviesnight.ui.theme.components.SectionHeader
import com.example.moviesnight.ui.theme.data.MovieThumbnailState


@OptIn(ExperimentalLayoutApi::class)
@Composable
fun ComingSoonSection(
    modifier: Modifier = Modifier,
    data: List<MovieThumbnailState>
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        SectionHeader(text = "Coming Soon")
        FlowRow(
            modifier = Modifier.fillMaxWidth(),
            maxItemsInEachRow = 2,
            verticalArrangement = Arrangement.spacedBy(18.dp)
        ) {
            data.forEach { item ->
                MovieThumbnail(
                    image = item.imageRes,
                    modifier = Modifier.weight(1f)
                )
            }
        }
    }
}