package com.uragiristereo.kafeku.ui.pesanan.core

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uragiristereo.kafeku.data.Menu

@Composable
fun PesananItem(
    item: Menu?,
    modifier: Modifier = Modifier,
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(4.dp),
        modifier = modifier,
    ) {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Nama",
                fontSize = 16.sp,
            )

            Text(
                text = item?.nama ?: "-",
                fontSize = 16.sp,
            )
        }

        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            modifier = modifier.fillMaxWidth(),
        ) {
            Text(
                text = "Harga",
                fontSize = 16.sp,
            )

            Text(
                text = when {
                    item != null -> "Rp. %,d".format(item.price)
                    else -> "Rp. -"
                },
                fontSize = 16.sp,
                color = MaterialTheme.colors.secondaryVariant,
            )
        }
    }
}
