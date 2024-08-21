package com.example.diary.UserInteraction

import androidx.compose.ui.graphics.Color
import com.example.diary.ui.theme.Bluish
import com.example.diary.ui.theme.Greenish
import com.example.diary.ui.theme.Peach
import com.example.diary.ui.theme.Pinkish
import com.example.diary.ui.theme.Redish
import com.example.diary.ui.theme.Yellowish
import kotlin.random.Random

val Randomcolors = listOf(
    Redish,
    Bluish,
    Pinkish,
    Yellowish,
    Greenish,
    Peach
)

fun getRandomColorFromList(): Color {
    val randomIndex = Random.nextInt(Randomcolors.size)
    return Randomcolors[randomIndex]
}