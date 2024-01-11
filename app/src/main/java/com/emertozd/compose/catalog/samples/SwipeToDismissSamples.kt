/*
 * Copyright 2022 The Android Open Source Project
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

package com.emertozd.compose.catalog.samples


import androidx.compose.animation.animateColorAsState
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.ListItem
import androidx.compose.material3.SwipeToDismissBox
import androidx.compose.material3.SwipeToDismissBoxDefaults
import androidx.compose.material3.SwipeToDismissState
import androidx.compose.material3.SwipeToDismissState.Companion.Saver
import androidx.compose.material3.SwipeToDismissValue
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview

@Preview

@Composable
@ExperimentalMaterial3Api
fun SwipeToDismissListItems() {
    val dismissState = rememberSwipeToDismissBoxState()
    SwipeToDismissBox(
        state = dismissState,
        backgroundContent = {
            val color by animateColorAsState(
                when (dismissState.targetValue) {
                    SwipeToDismissValue.Settled -> Color.LightGray
                    SwipeToDismissValue.StartToEnd -> Color.Green
                    SwipeToDismissValue.EndToStart -> Color.Red
                }
            )
            Box(
                Modifier
                    .fillMaxSize()
                    .background(color))
        }
    ) {
        Card {
            ListItem(
                headlineContent = {
                    Text("Cupcake")
                },
                supportingContent = { Text("Swipe me left or right!") }
            )
            HorizontalDivider()
        }
    }
}

@Composable
@ExperimentalMaterial3Api
fun rememberSwipeToDismissBoxState(
    initialValue: SwipeToDismissValue = SwipeToDismissValue.Settled,
    confirmValueChange: (SwipeToDismissValue) -> Boolean = { true },
    positionalThreshold: (totalDistance: Float) -> Float =
        SwipeToDismissBoxDefaults.positionalThreshold,
): SwipeToDismissState {
    val density = LocalDensity.current
    return rememberSaveable(
        saver = Saver(
            confirmValueChange = confirmValueChange,
            density = density,
            positionalThreshold = positionalThreshold
        )
    ) {
        SwipeToDismissState(initialValue, density, confirmValueChange, positionalThreshold)
    }
}