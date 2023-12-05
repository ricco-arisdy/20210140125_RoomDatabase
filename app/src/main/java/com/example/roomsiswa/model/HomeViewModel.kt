package com.example.roomsiswa.model

import com.example.roomsiswa.data.Siswa

class HomeViewModel {

    companion object {
        private const val TIMEOUT_MILLIS = 5_000L
    }

    data class HomeUiState(
        val listSiswa: List<Siswa> = listOf()
    )

}