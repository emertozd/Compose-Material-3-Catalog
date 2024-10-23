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

import com.emertozd.compose.catalog.library.Sampled
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview

@Preview
@Sampled
@Composable
fun SurfaceSample() {
    Surface { Text("Text on Surface") }
}

@Preview
@Sampled
@Composable
fun ClickableSurfaceSample() {
    var count by remember { mutableStateOf(0) }
    Surface(
        onClick = { count++ },
    ) {
        Text("Clickable Surface. Count: $count")
    }
}

@Preview
@Sampled
@Composable
fun SelectableSurfaceSample() {
    var selected by remember { mutableStateOf(false) }
    Surface(
        selected = selected,
        onClick = { selected = !selected },
    ) {
        Text(text = if (selected) "Selected" else "Not Selected", textAlign = TextAlign.Center)
    }
}

@Preview
@Sampled
@Composable
fun ToggleableSurfaceSample() {
    var checked by remember { mutableStateOf(false) }
    Surface(
        checked = checked,
        onCheckedChange = { checked = !checked },
        color =
        if (checked) {
            MaterialTheme.colorScheme.surfaceVariant
        } else {
            MaterialTheme.colorScheme.surface
        }
    ) {
        Text(text = if (checked) "ON" else "OFF", textAlign = TextAlign.Center)
    }
}
