package com.angelika.android5lesson_5.models

import androidx.compose.ui.graphics.vector.ImageVector

data class DogModel(
    val image: String,
    val name: String,
    val gender: ImageVector,
)