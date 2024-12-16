package com.example.mvvmdengandatabase.repository

import com.example.mvvmdengandatabase.data.entity.Mahasiswa
import kotlinx.coroutines.flow.Flow

//Jika di Dao ada insert di repository juga harus ada insert
interface RepositoryMhs {
    suspend fun insertMhs(mahasiswa: Mahasiswa)

    fun getAllMhs(): Flow<List<Mahasiswa>>

    fun getMhs(nim :String): Flow<Mahasiswa>
}