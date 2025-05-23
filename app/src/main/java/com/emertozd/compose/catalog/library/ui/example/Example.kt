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

package com.emertozd.compose.catalog.library.ui.example

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.consumeWindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawing
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.emertozd.compose.catalog.library.model.Component
import com.emertozd.compose.catalog.library.model.Example
import com.emertozd.compose.catalog.library.model.Theme
import com.emertozd.compose.catalog.library.ui.common.CatalogScaffold

@OptIn(ExperimentalLayoutApi::class)
@Composable
fun Example(
    component: Component,
    example: Example,
    theme: Theme,
    onThemeChange: (theme: Theme) -> Unit,
    onBackClick: () -> Unit,
    favorite: Boolean = false,
    onFavoriteClick: () -> Unit = {},
) {
    CatalogScaffold(
        topBarTitle = example.name,
        showBackNavigationIcon = true,
        theme = theme,
        guidelinesUrl = component.guidelinesUrl,
        docsUrl = component.docsUrl,
        sourceUrl = example.sourceUrl,
        onThemeChange = onThemeChange,
        onBackClick = onBackClick,
        favorite = favorite,
        onFavoriteClick = onFavoriteClick,
    ) { paddingValues ->
        Box(
            modifier =
                Modifier.fillMaxSize()
                    .consumeWindowInsets(WindowInsets.safeDrawing)
                    .padding(paddingValues),
            contentAlignment = Alignment.Center,
        ) {
            example.content()
        }
    }
}
