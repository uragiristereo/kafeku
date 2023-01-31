package com.uragiristereo.kafeku.ui.pesanan

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.uragiristereo.kafeku.data.Menu
import com.uragiristereo.kafeku.ui.pesanan.core.PesananDate
import com.uragiristereo.kafeku.ui.pesanan.core.PesananItem
import com.uragiristereo.kafeku.ui.pesanan.core.PesananMenuCode
import com.uragiristereo.kafeku.ui.pesanan.core.PesananTableNumber
import com.uragiristereo.kafeku.ui.pesanan.core.PesananTime

@Composable
fun PesananScreen(
    selectedMenu: Menu?,
    onSelectedMenuChange: (Menu) -> Unit,
    modifier: Modifier = Modifier,
    viewModel: PesananViewModel = viewModel(),
) {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(16.dp),
        modifier = modifier.padding(all = 16.dp),
    ) {
        item {
            PesananDate(
                date = viewModel.dateFormatted,
                onDateChange = viewModel::setDate,
            )
        }

        item {
            Divider()
        }

        item {
            PesananTime(
                time = viewModel.time,
                onTimeChange = viewModel::setTime,
            )
        }

        item {
            Divider()
        }

        item {
            PesananTableNumber(
                text = viewModel.tableNumber,
                onTextChange = viewModel::onTableNumberChange,
            )
        }

        item {
            Divider()
        }

        item {
            PesananMenuCode(
                selectedItem = selectedMenu,
                onSelectedItemChange = onSelectedMenuChange,
            )
        }

        item {
            Divider()
        }

        item {
            PesananItem(item = selectedMenu)
        }

        item {
            Divider()
        }
    }
}
