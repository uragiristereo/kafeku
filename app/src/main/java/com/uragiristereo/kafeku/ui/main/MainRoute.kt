package com.uragiristereo.kafeku.ui.main

import com.github.uragiristereo.safer.compose.navigation.core.NavRoute

sealed interface MainRoute : NavRoute {
    object Pesanan : MainRoute

    object DaftarMenu : MainRoute
}
