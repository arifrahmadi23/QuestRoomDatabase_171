package com.example.mvvmdengandatabase.ui.viewmodel

import com.example.mvvmdengandatabase.data.entity.Mahasiswa

fun Mahasiswa.toUiStateMhs(): MhsUIState = MhsUIState(
    mahasiswaEvent = this.toDetailUiEvent(),
)