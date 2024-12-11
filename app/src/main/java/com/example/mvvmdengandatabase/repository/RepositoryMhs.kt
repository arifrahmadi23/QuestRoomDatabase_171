package com.example.mvvmdengandatabase.repository

import com.example.mvvmdengandatabase.data.entity.Mahasiswa

//Jika di Dao ada insert di repository juga harus ada insert
interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)
}