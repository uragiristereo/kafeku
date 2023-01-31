package com.uragiristereo.kafeku.ui.main

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.uragiristereo.kafeku.data.Menu

class MainViewModel : ViewModel() {
    var selectedMenu by mutableStateOf<Menu?>(null)
        private set

    fun onSelectedMenuChange(value: Menu) {
        selectedMenu = value
    }
}
