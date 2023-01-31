package com.uragiristereo.kafeku.ui.pesanan

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class PesananViewModel : ViewModel() {
    private val formatter = SimpleDateFormat("EEEE, dd MMMM yyyy", Locale.getDefault())

    private var date by mutableStateOf<Date?>(null)

    var dateFormatted by mutableStateOf("-")
        private set

    var time by mutableStateOf("-")
        private set

    var tableNumber by mutableStateOf("")
        private set

    fun setDate(timestamp: Long) {
        date = Date(timestamp)

        date?.let {
            dateFormatted = formatter.format(it)
        }
    }

    fun setTime(hour: Int, minute: Int) {
        val hourFormatted = "%02d".format(hour)
        val minuteFormatted = "%02d".format(minute)

        time = "$hourFormatted:$minuteFormatted"
    }

    fun onTableNumberChange(value: String) {
        tableNumber = value
    }
}
