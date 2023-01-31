package com.uragiristereo.kafeku.ui.main.core

import androidx.annotation.DrawableRes
import com.uragiristereo.kafeku.R
import com.uragiristereo.kafeku.ui.main.MainRoute

enum class MainBottomNavigationItems(
    val route: MainRoute,
    val label: String,
    @DrawableRes val unselectedIcon: Int,
    @DrawableRes val selectedIcon: Int = unselectedIcon,
) {
    Pesanan(
        route = MainRoute.Pesanan,
        label = "Pesanan",
        unselectedIcon = R.drawable.receipt,
        selectedIcon = R.drawable.receipt_fill,
    ),
    DaftarMenu(
        route = MainRoute.DaftarMenu,
        label = "Daftar Menu",
        unselectedIcon = R.drawable.list,
    )
}
