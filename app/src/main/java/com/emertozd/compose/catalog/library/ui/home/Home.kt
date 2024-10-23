/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.emertozd.compose.catalog.library.ui.home

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.calculateEndPadding
import androidx.compose.foundation.layout.calculateStartPadding
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalLayoutDirection
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.emertozd.compose.catalog.R
import com.emertozd.compose.catalog.library.model.Component
import com.emertozd.compose.catalog.library.model.Theme
import com.emertozd.compose.catalog.library.ui.common.CatalogScaffold
import com.emertozd.compose.catalog.library.ui.component.ComponentItem

@Composable
fun Home(
    components: List<Component>,
    theme: Theme,
    onThemeChange: (theme: Theme) -> Unit,
    onComponentClick: (component: Component) -> Unit,
    favorite: Boolean = false,
    onFavoriteClick: () -> Unit,
) {
    val ltr = LocalLayoutDirection.current
    CatalogScaffold(
        topBarTitle = stringResource(id = R.string.compose_material_3),
        theme = theme,
        onThemeChange = onThemeChange,
        favorite = favorite,
        onFavoriteClick = onFavoriteClick
    ) { paddingValues ->
        LazyVerticalGrid(
            modifier = Modifier.consumeWindowInsets(paddingValues),
            columns = GridCells.Adaptive(HomeCellMinSize),
            content = {
                items(components) { component ->
                    ComponentItem(component = component, onClick = onComponentClick)
                }
            },
            contentPadding =
            PaddingValues(
                start = paddingValues.calculateStartPadding(ltr) + HomePadding,
                top = paddingValues.calculateTopPadding() + HomePadding,
                end = paddingValues.calculateEndPadding(ltr) + HomePadding,
                bottom = paddingValues.calculateBottomPadding() + HomePadding
            )
        )
    }
}

private val HomeCellMinSize = 180.dp
private val HomePadding = 12.dp
