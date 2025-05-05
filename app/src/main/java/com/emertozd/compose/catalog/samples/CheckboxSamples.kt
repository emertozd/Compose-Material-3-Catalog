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

package com.emertozd.compose.catalog.samples

import com.emertozd.compose.catalog.library.Sampled
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.selection.toggleable
import androidx.compose.foundation.selection.triStateToggleable
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CheckboxDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TriStateCheckbox
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.state.ToggleableState
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.floor

@Preview
@Sampled
@Composable
fun CheckboxSample() {
    val checkedState = remember { mutableStateOf(true) }
    Checkbox(checked = checkedState.value, onCheckedChange = { checkedState.value = it })
}

@Preview
@Sampled
@Composable
fun CheckboxWithTextSample() {
    val (checkedState, onStateChange) = remember { mutableStateOf(true) }
    Row(
        Modifier.fillMaxWidth()
            .height(56.dp)
            .toggleable(
                value = checkedState,
                onValueChange = { onStateChange(!checkedState) },
                role = Role.Checkbox
            )
            .padding(horizontal = 16.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Checkbox(
            checked = checkedState,
            onCheckedChange = null // null recommended for accessibility with screenreaders
        )
        Text(
            text = "Option selection",
            style = MaterialTheme.typography.bodyLarge,
            modifier = Modifier.padding(start = 16.dp)
        )
    }
}

@Preview
@Sampled
@Composable
fun CheckboxRoundedStrokesSample() {
    val strokeWidthPx = with(LocalDensity.current) { floor(CheckboxDefaults.StrokeWidth.toPx()) }
    val checkmarkStroke =
        remember(strokeWidthPx) {
            Stroke(
                width = strokeWidthPx,
                cap = StrokeCap.Round,
                join = StrokeJoin.Round,
            )
        }
    val outlineStroke = remember(strokeWidthPx) { Stroke(width = strokeWidthPx) }
    val checkedState = remember { mutableStateOf(true) }
    Checkbox(
        checked = checkedState.value,
        onCheckedChange = { checkedState.value = it },
        checkmarkStroke = checkmarkStroke,
        outlineStroke = outlineStroke
    )
}

@Preview
@Sampled
@Composable
fun TriStateCheckboxSample() {
    Column {
        // define dependent checkboxes states
        val (state, onStateChange) = remember { mutableStateOf(true) }
        val (state2, onStateChange2) = remember { mutableStateOf(true) }

        // TriStateCheckbox state reflects state of dependent checkboxes
        val parentState =
            remember(state, state2) {
                if (state && state2) ToggleableState.On
                else if (!state && !state2) ToggleableState.Off else ToggleableState.Indeterminate
            }
        // click on TriStateCheckbox can set state for dependent checkboxes
        val onParentClick = {
            val s = parentState != ToggleableState.On
            onStateChange(s)
            onStateChange2(s)
        }

        // The sample below composes just basic checkboxes which are not fully accessible on their
        // own. See the CheckboxWithTextSample as a way to ensure your checkboxes are fully
        // accessible.
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier =
                Modifier.triStateToggleable(
                    state = parentState,
                    onClick = onParentClick,
                    role = Role.Checkbox
                )
        ) {
            TriStateCheckbox(
                state = parentState,
                onClick = null,
            )
            Text("Receive Emails")
        }
        Spacer(Modifier.size(25.dp))
        Column(Modifier.padding(24.dp, 0.dp, 0.dp, 0.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier =
                    Modifier.toggleable(
                        value = state,
                        onValueChange = onStateChange,
                        role = Role.Checkbox
                    )
            ) {
                Checkbox(state, null)
                Text("Daily")
            }
            Spacer(Modifier.size(25.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier =
                    Modifier.toggleable(
                        value = state2,
                        onValueChange = onStateChange2,
                        role = Role.Checkbox
                    )
            ) {
                Checkbox(state2, null)
                Text("Weekly")
            }
        }
    }
}

@Preview
@Sampled
@Composable
fun TriStateCheckboxRoundedStrokesSample() {
    val strokeWidthPx = with(LocalDensity.current) { floor(CheckboxDefaults.StrokeWidth.toPx()) }
    val checkmarkStroke =
        remember(strokeWidthPx) {
            Stroke(
                width = strokeWidthPx,
                cap = StrokeCap.Round,
                join = StrokeJoin.Round,
            )
        }
    val outlineStroke = remember(strokeWidthPx) { Stroke(width = strokeWidthPx) }
    Column {
        // define dependent checkboxes states
        val (state, onStateChange) = remember { mutableStateOf(true) }
        val (state2, onStateChange2) = remember { mutableStateOf(true) }

        // TriStateCheckbox state reflects state of dependent checkboxes
        val parentState =
            remember(state, state2) {
                if (state && state2) ToggleableState.On
                else if (!state && !state2) ToggleableState.Off else ToggleableState.Indeterminate
            }
        // click on TriStateCheckbox can set state for dependent checkboxes
        val onParentClick = {
            val s = parentState != ToggleableState.On
            onStateChange(s)
            onStateChange2(s)
        }

        // The sample below composes just basic checkboxes which are not fully accessible on their
        // own. See the CheckboxWithTextSample as a way to ensure your checkboxes are fully
        // accessible.
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier =
                Modifier.triStateToggleable(
                    state = parentState,
                    onClick = onParentClick,
                    role = Role.Checkbox
                )
        ) {
            TriStateCheckbox(
                state = parentState,
                onClick = null,
                checkmarkStroke = checkmarkStroke,
                outlineStroke = outlineStroke
            )
            Text("Receive Emails")
        }
        Spacer(Modifier.size(25.dp))
        Column(Modifier.padding(24.dp, 0.dp, 0.dp, 0.dp)) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier =
                    Modifier.toggleable(
                        value = state,
                        onValueChange = onStateChange,
                        role = Role.Checkbox
                    )
            ) {
                Checkbox(
                    checked = state,
                    onCheckedChange = null,
                    checkmarkStroke = checkmarkStroke,
                    outlineStroke = outlineStroke
                )
                Text("Daily")
            }
            Spacer(Modifier.size(25.dp))
            Row(
                verticalAlignment = Alignment.CenterVertically,
                modifier =
                    Modifier.toggleable(
                        value = state2,
                        onValueChange = onStateChange2,
                        role = Role.Checkbox
                    )
            ) {
                Checkbox(
                    checked = state2,
                    onCheckedChange = null,
                    checkmarkStroke = checkmarkStroke,
                    outlineStroke = outlineStroke
                )
                Text("Weekly")
            }
        }
    }
}