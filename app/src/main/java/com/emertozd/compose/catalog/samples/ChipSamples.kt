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
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ExperimentalLayoutApi
import androidx.compose.foundation.layout.FlowRow
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowRight
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Done
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.filled.Tune
import androidx.compose.material3.AssistChip
import androidx.compose.material3.AssistChipDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ElevatedAssistChip
import androidx.compose.material3.ElevatedFilterChip
import androidx.compose.material3.ElevatedSuggestionChip
import androidx.compose.material3.FilterChip
import androidx.compose.material3.FilterChipDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.InputChip
import androidx.compose.material3.InputChipDefaults
import androidx.compose.material3.SuggestionChip
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.util.fastForEachIndexed

@Preview
@Sampled
@Composable
fun AssistChipSample() {
    AssistChip(
        onClick = { /* Do something! */ },
        label = { Text("Assist Chip") },
        leadingIcon = {
            Icon(
                Icons.Filled.Settings,
                contentDescription = "Localized description",
                Modifier.size(AssistChipDefaults.IconSize),
            )
        },
    )
}

@Preview
@Sampled
@Composable
fun ElevatedAssistChipSample() {
    ElevatedAssistChip(
        onClick = { /* Do something! */ },
        label = { Text("Assist Chip") },
        leadingIcon = {
            Icon(
                Icons.Filled.Settings,
                contentDescription = "Localized description",
                Modifier.size(AssistChipDefaults.IconSize),
            )
        },
    )
}

@Preview
@Sampled
@Composable
fun FilterChipSample() {
    var selected by remember { mutableStateOf(false) }
    FilterChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Filter chip") },
        leadingIcon =
            if (selected) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Localized Description",
                        modifier = Modifier.size(FilterChipDefaults.IconSize),
                    )
                }
            } else {
                null
            },
    )
}

@Preview
@Sampled
@Composable
fun ElevatedFilterChipSample() {
    var selected by remember { mutableStateOf(false) }
    ElevatedFilterChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Filter chip") },
        leadingIcon =
            if (selected) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Localized Description",
                        modifier = Modifier.size(FilterChipDefaults.IconSize),
                    )
                }
            } else {
                null
            },
    )
}

@Preview
@Sampled
@Composable
fun FilterChipWithLeadingIconSample() {
    var selected by remember { mutableStateOf(false) }
    FilterChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Filter chip") },
        leadingIcon =
            if (selected) {
                {
                    Icon(
                        imageVector = Icons.Filled.Done,
                        contentDescription = "Localized Description",
                        modifier = Modifier.size(FilterChipDefaults.IconSize),
                    )
                }
            } else {
                {
                    Icon(
                        imageVector = Icons.Filled.Home,
                        contentDescription = "Localized description",
                        modifier = Modifier.size(FilterChipDefaults.IconSize),
                    )
                }
            },
    )
}

@Preview
@Sampled
@Composable
fun InputChipSample() {
    var selected by remember { mutableStateOf(false) }
    InputChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Input Chip") },
    )
}

@Preview
@Sampled
@Composable
fun InputChipWithAvatarSample() {
    var selected by remember { mutableStateOf(false) }
    InputChip(
        selected = selected,
        onClick = { selected = !selected },
        label = { Text("Input Chip") },
        avatar = {
            Icon(
                Icons.Filled.Person,
                contentDescription = "Localized description",
                Modifier.size(InputChipDefaults.AvatarSize),
            )
        },
    )
}

@Preview
@Sampled
@Composable
fun SuggestionChipSample() {
    SuggestionChip(onClick = { /* Do something! */ }, label = { Text("Suggestion Chip") })
}

@Preview
@Sampled
@Composable
fun ElevatedSuggestionChipSample() {
    ElevatedSuggestionChip(onClick = { /* Do something! */ }, label = { Text("Suggestion Chip") })
}

@Preview
@Sampled
@Composable
fun ChipGroupSingleLineSample() {
    var expanded by remember { mutableStateOf(false) }
    val listSize = 9
    val chipData = List(listSize) { index -> "Chip $index" }
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(modifier = Modifier.horizontalScroll(rememberScrollState())) {
            AssistChip(
                onClick = { expanded = !expanded },
                label = { Text("Show All") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Tune,
                        contentDescription = "Localized Description",
                        modifier = Modifier.size(FilterChipDefaults.IconSize),
                    )
                },
            )
            /*
             * When chip lists exceed the available horizontal screen space, one option is to
             * provide a chip button that opens a menu displaying all chip options. This ensures
             * all options are accessible while maintaining the position of the content below the
             * chip list.
             */
            DropdownMenu(expanded = expanded, onDismissRequest = { expanded = false }) {
                repeat(listSize) { index ->
                    DropdownMenuItem(
                        text = { Text(chipData[index]) },
                        onClick = {},
                        trailingIcon = {
                            Icon(Icons.AutoMirrored.Filled.ArrowRight, contentDescription = null)
                        },
                    )
                }
            }
            repeat(listSize) { index ->
                AssistChip(
                    modifier = Modifier.padding(horizontal = 4.dp),
                    onClick = { /* do something*/ },
                    label = { Text(chipData[index]) },
                    trailingIcon = { Icon(Icons.Filled.ArrowDropDown, contentDescription = null) },
                )
            }
        }
    }
}

@OptIn(ExperimentalLayoutApi::class)
@Preview
@Sampled
@Composable
fun ChipGroupReflowSample() {
    var selected by remember { mutableStateOf(false) }
    val colorNames =
        listOf(
            "Blue",
            "Yellow",
            "Red",
            "Orange",
            "Black",
            "Green",
            "White",
            "Magenta",
            "Gray",
            "Transparent",
        )
    Column {
        FlowRow(
            modifier =
                Modifier.fillMaxWidth(1f)
                    .wrapContentHeight(align = Alignment.Top)
                    .then(
                        if (selected) {
                            Modifier.verticalScroll(rememberScrollState())
                        } else {
                            Modifier.horizontalScroll(rememberScrollState())
                        }
                    ),
            horizontalArrangement = Arrangement.Start,
            maxLines = if (!selected) 1 else Int.MAX_VALUE,
        ) {
            /*
             * When chip lists exceed the available horizontal screen space, one option is to
             * provide a leading chip that expands the list into a vertical scrolling list. This
             * ensures all options are accessible while maintaining the position of the content
             * below the chip list.
             */
            FilterChip(
                selected = selected,
                modifier =
                    Modifier.padding(horizontal = 4.dp)
                        .align(alignment = Alignment.CenterVertically),
                onClick = { selected = !selected },
                label = { Text("Show All") },
                leadingIcon = {
                    Icon(
                        imageVector = Icons.Filled.Tune,
                        contentDescription = "Localized Description",
                        modifier = Modifier.size(FilterChipDefaults.IconSize),
                    )
                },
            )
            Box(
                Modifier.height(FilterChipDefaults.Height)
                    .align(alignment = Alignment.CenterVertically)
            ) {
                VerticalDivider()
            }
            colorNames.fastForEachIndexed { index, element ->
                AssistChip(
                    modifier =
                        Modifier.padding(horizontal = 4.dp)
                            .align(alignment = Alignment.CenterVertically),
                    onClick = { /* do something*/ },
                    label = { Text("$element $index") },
                )
            }
        }
    }
}