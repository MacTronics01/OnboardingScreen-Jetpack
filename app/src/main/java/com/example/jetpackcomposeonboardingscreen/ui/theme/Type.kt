package com.example.jetpackcomposeonboardingscreen.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.unit.sp
import com.example.jetpackcomposeonboardingscreen.R

// Set of Material typography styles to start with\

val DmFont= FontFamily(
    Font(R.font.bold, Bold),
    Font(R.font.bold_italic, FontWeight.SemiBold),
    Font(R.font.italic, FontWeight.Thin),
    Font(R.font.medium, FontWeight.Medium),
    Font(R.font.medium_italic, FontWeight.ExtraLight),
    Font(R.font.regular, FontWeight.Light)
)

val Typography = Typography(
    body1 = TextStyle(
        fontFamily = DmFont,
        fontWeight = FontWeight.SemiBold,
        fontSize = 26.sp
    )
    /* Other default text styles to override
    button = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.W500,
        fontSize = 14.sp
    ),
    caption = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp
    )
    */
)