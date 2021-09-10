package com.az.cryptocurrencyencyclopedia.presentation.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorPalette = darkColors(
    primary = ColorPrimary,
    onPrimary = DarkGray,
    background = DarkGray,
    onBackground = TextWhite,

)

private val LightColorPalette = lightColors(
    primary = ColorPrimary,
    onPrimary = DarkGray,
    background = Color.White,
    onBackground = MediumGray,
)

@Composable
fun CryptocurrencyEncyclopediaTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable() () -> Unit
) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}