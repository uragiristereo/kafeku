package com.uragiristereo.kafeku.ui.daftar_menu.core

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ContentAlpha
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.uragiristereo.kafeku.data.Menu
import com.uragiristereo.kafeku.theme.AppTheme

@Composable
fun DaftarMenuItem(
    item: Menu,
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
) {
    Card(
        shape = RoundedCornerShape(size = 12.dp),
        elevation = 4.dp,
        modifier = modifier
            .clip(RoundedCornerShape(size = 12.dp))
            .clickable(onClick = onClick),
    ) {
        Column(
            modifier = Modifier.padding(all = 12.dp),
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(
                    text = item.code,
                    style = MaterialTheme.typography.h5,
                    modifier = Modifier.width(48.dp),
                )

                Column(
                    modifier = Modifier
                        .weight(1f)
                        .padding(horizontal = 16.dp),
                ) {
                    Text(
                        text = item.nama,
                        style = MaterialTheme.typography.subtitle1,
                        fontWeight = FontWeight.Medium,
                    )

                    Text(
                        text = item.type.name,
                        fontSize = 14.sp,
                        color = MaterialTheme.colors.onBackground.copy(alpha = ContentAlpha.medium),
                    )
                }

                Text(
                    text = "Rp. %,d".format(item.price),
                    fontSize = 16.sp,
                    color = MaterialTheme.colors.secondaryVariant,
                )
            }

            Divider(modifier = Modifier.padding(vertical = 8.dp))

            Text(
                text = "Deskripsi".uppercase(),
                style = MaterialTheme.typography.overline,
                color = MaterialTheme.colors.primary,
                fontSize = 13.sp,
                fontWeight = FontWeight.Medium,
            )

            Text(
                text = item.description,
                style = MaterialTheme.typography.body2,
            )
        }
    }
}

@Preview
@Composable
private fun DaftarMenuItemPreview() {
    AppTheme {
        Surface {
            DaftarMenuItem(
                item = Menu.Batagor,
                onClick = { },
                modifier = Modifier.padding(all = 16.dp),
            )
        }
    }
}
