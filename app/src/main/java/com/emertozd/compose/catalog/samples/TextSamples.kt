/*
 * Copyright 2024 The Android Open Source Project
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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.LinkAnnotation
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextLinkStyles
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withLink
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Sampled
@Composable
fun TextWithLinks() {
    val url = "https://developer.android.com/jetpack/compose"
    val annotatedString = buildAnnotatedString {
        append("Build better apps faster with ")
        // If the annotation's TextLinkStyles is null,
        // then the link style defaults to Material styling.
        withLink(LinkAnnotation.Url(url = url)) { append("Jetpack Compose") }
    }
    Text(annotatedString)
}