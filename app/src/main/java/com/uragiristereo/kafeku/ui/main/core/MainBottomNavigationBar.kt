package com.uragiristereo.kafeku.ui.main.core

import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.github.uragiristereo.safer.compose.navigation.core.route
import com.uragiristereo.kafeku.ui.main.MainRoute

@Composable
fun MainBottomNavigationBar(
    currentRoute: String?,
    onNavigate: (MainRoute) -> Unit,
    modifier: Modifier = Modifier,
) {
    BottomNavigation(
        modifier = modifier,
    ) {
        MainBottomNavigationItems.values().forEach { item ->
            val selected = currentRoute == item.route.route

            BottomNavigationItem(
                selected = selected,
                selectedContentColor = MaterialTheme.colors.primary,
                unselectedContentColor = MaterialTheme.colors.onBackground.copy(alpha = ContentAlpha.disabled),
                label = {
                    Text(text = item.label)
                },
                icon = {
                    Icon(
                        painter = painterResource(
                            id = when {
                                selected -> item.selectedIcon
                                else -> item.selectedIcon
                            },
                        ),
                        contentDescription = item.label,
                    )
                },
                onClick = {
                    onNavigate(item.route)
                },
            )
        }
    }
}
