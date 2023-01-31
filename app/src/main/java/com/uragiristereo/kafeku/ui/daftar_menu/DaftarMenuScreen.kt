package com.uragiristereo.kafeku.ui.daftar_menu

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.uragiristereo.kafeku.data.Menu
import com.uragiristereo.kafeku.ui.daftar_menu.core.DaftarMenuItem

@Composable
fun DaftarMenuScreen(
    onItemClick: (Menu) -> Unit,
    modifier: Modifier = Modifier,
) {
    LazyColumn(
        contentPadding = PaddingValues(all = 16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.fillMaxSize()
    ) {
        items(items = Menu.values()) { item ->
            DaftarMenuItem(
                item = item,
                onClick = {
                    onItemClick(item)
                },
            )
        }
    }
}
