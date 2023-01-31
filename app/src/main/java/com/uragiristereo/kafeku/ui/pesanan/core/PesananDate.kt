package com.uragiristereo.kafeku.ui.pesanan.core

import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Button
import androidx.compose.material.ContentAlpha
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.withStyle
import com.google.android.material.datepicker.MaterialDatePicker

@Composable
fun PesananDate(
    date: String,
    onDateChange: (Long) -> Unit,
    modifier: Modifier = Modifier,
) {
    val context = LocalContext.current

    Row(
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier.fillMaxWidth(),
    ) {
        Text(
            text = buildAnnotatedString {
                append(text = "Tanggal:\n")

                withStyle(
                    style = SpanStyle(
                        color = MaterialTheme.colors.onBackground
                            .copy(alpha = ContentAlpha.medium),
                    ),
                ) {
                    append(text = date)
                }
            },
        )

        Button(
            onClick = {
                val picker = MaterialDatePicker.Builder
                    .datePicker()
                    .setTitleText("Pilih tanggal")
                    .build()

                val activity = context as AppCompatActivity

                picker.addOnPositiveButtonClickListener(onDateChange)

                picker.show(activity.supportFragmentManager, null)
            },
            content = {
                Text(text = "Pilih".uppercase())
            },
        )
    }
}
