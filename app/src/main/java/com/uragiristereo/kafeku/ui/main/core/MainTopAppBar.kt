package com.uragiristereo.kafeku.ui.main.core

import androidx.compose.foundation.layout.Column
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.primarySurface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.sp
import com.github.uragiristereo.safer.compose.navigation.core.route
import com.uragiristereo.kafeku.ui.main.MainRoute

@Composable
fun MainTopAppBar(
    currentRoute: String?,
    modifier: Modifier = Modifier,
) {
    TopAppBar(
        backgroundColor = when {
            MaterialTheme.colors.isLight -> MaterialTheme.colors.background
            else -> MaterialTheme.colors.primarySurface
        },
        title = {
            Column {
                Text(text = "Kafeku")

                Text(
                    text = when (currentRoute) {
                        MainRoute.Pesanan.route -> "Pesanan"
                        MainRoute.DaftarMenu.route -> "Daftar Menu"
                        else -> ""
                    },
                    fontSize = 14.sp,
                    color = MaterialTheme.colors.onBackground.copy(alpha = ContentAlpha.medium),
                )
            }
        },
        modifier = modifier,
    )
}
