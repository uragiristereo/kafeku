package com.uragiristereo.kafeku.ui.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.github.uragiristereo.safer.compose.navigation.compose.NavHost
import com.github.uragiristereo.safer.compose.navigation.compose.composable
import com.github.uragiristereo.safer.compose.navigation.core.navigate
import com.uragiristereo.kafeku.ui.daftar_menu.DaftarMenuScreen
import com.uragiristereo.kafeku.ui.main.core.MainBottomNavigationBar
import com.uragiristereo.kafeku.ui.main.core.MainTopAppBar
import com.uragiristereo.kafeku.ui.pesanan.PesananScreen

@Composable
fun MainScreen(
    modifier: Modifier = Modifier,
    viewModel: MainViewModel = viewModel(),
) {
    val navController = rememberNavController()

    val navBackStackEntry by navController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination?.route

    Scaffold(
        topBar = {
            MainTopAppBar(currentRoute)
        },
        bottomBar = {
            MainBottomNavigationBar(
                currentRoute = currentRoute,
                onNavigate = { route ->
                    navigateBottomNav(navController, route)
                }
            )
        },
        modifier = modifier,
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = MainRoute.Pesanan::class,
            modifier = Modifier.padding(innerPadding),
        ) {
            composable(route = MainRoute.Pesanan) {
                PesananScreen(
                    selectedMenu = viewModel.selectedMenu,
                    onSelectedMenuChange = viewModel::onSelectedMenuChange,
                )
            }

            composable(route = MainRoute.DaftarMenu) {
                DaftarMenuScreen(
                    onItemClick = remember {
                        { menu ->
                            viewModel.onSelectedMenuChange(menu)

                            navigateBottomNav(navController, MainRoute.Pesanan)
                        }
                    },
                )
            }
        }
    }
}


private fun navigateBottomNav(navController: NavHostController, route: MainRoute) {
    navController.navigate(route) {
        popUpTo(id = navController.graph.findStartDestination().id) {
            saveState = true
        }

        restoreState = true
        launchSingleTop = true
    }
}
