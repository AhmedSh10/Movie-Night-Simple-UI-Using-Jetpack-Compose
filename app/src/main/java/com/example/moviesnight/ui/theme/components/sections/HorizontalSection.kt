package com.example.moviesnight.ui.theme.components.sections

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.PageSize
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.dp
import com.example.moviesnight.ui.theme.components.MovieThumbnail
import com.example.moviesnight.ui.theme.components.SectionHeader
import com.example.moviesnight.ui.theme.data.MovieThumbnailState

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun HorizontalSection(
    modifier: Modifier = Modifier,
    data: List<MovieThumbnailState>,
    title: String
) {

    val pageState = rememberPagerState(pageCount = { data.size })
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)

    ) {
        SectionHeader(text = title, modifier = Modifier.padding(horizontal = 18.dp))
        HorizontalPager(
            state = pageState,
            pageSize = TwoPagesPerViewport,
            pageSpacing = 18.dp,
            contentPadding = PaddingValues(horizontal = 18.dp)



        ) { pageIndex ->
            MovieThumbnail(
                image = data[pageIndex].imageRes,
                modifier = Modifier.fillMaxWidth()
            )
        }

    }


}

@ExperimentalFoundationApi
private val TwoPagesPerViewport = object : PageSize {
    override fun Density.calculateMainAxisPageSize(availableSpace: Int, pageSpacing: Int): Int =
        (availableSpace - pageSpacing) / 2

}