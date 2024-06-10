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

package com.emertozd.compose.catalog.library.ui.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.LocalContentColor
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.emertozd.compose.catalog.R
import com.emertozd.compose.catalog.library.model.Component

@Composable
fun ComponentItem(component: Component, onClick: (component: Component) -> Unit) {
    OutlinedCard(
        onClick = { onClick(component) },
        modifier = Modifier.height(ComponentItemHeight).padding(ComponentItemOuterPadding)
    ) {
        Box(modifier = Modifier.fillMaxSize().padding(ComponentItemInnerPadding)) {
            Image(
                painter = painterResource(id = component.icon),
                contentDescription = null,
                modifier = Modifier.size(ComponentItemIconSize).align(Alignment.Center),
                colorFilter =
                    if (component.tintIcon) {
                        ColorFilter.tint(LocalContentColor.current)
                    } else {
                        null
                    },
                contentScale = ContentScale.Inside
            )
            Text(
                text = component.name,
                modifier = Modifier.align(Alignment.BottomStart),
                style = MaterialTheme.typography.bodySmall
            )
            if (component.hasError) {
                Text(
                    modifier =
                        Modifier.background(
                                MaterialTheme.colorScheme.error,
                                MaterialTheme.shapes.medium
                            )
                            .align(Alignment.TopEnd)
                            .padding(4.dp),
                    text = "Not Working",
                    style = MaterialTheme.typography.labelSmall,
                    color = MaterialTheme.colorScheme.surface
                )
            }
        }
    }
}

@Preview
@Composable
fun ComponentItemPreview() {
    ComponentItem(
        component =
            Component(
                id = 9513,
                name = "Cory Cole",
                description = "inani",
                tintIcon = true,
                icon = R.drawable.ic_launcher_foreground,
                guidelinesUrl = "https://www.google.com/#q=consul",
                docsUrl = "https://search.yahoo.com/search?p=accommodare",
                sourceUrl = "https://www.google.com/#q=reque",
                examples = listOf(),
                hasError = true
            ),
        {}
    )
}

private val ComponentItemHeight = 180.dp
private val ComponentItemOuterPadding = 4.dp
private val ComponentItemInnerPadding = 16.dp
private val ComponentItemIconSize = 80.dp
