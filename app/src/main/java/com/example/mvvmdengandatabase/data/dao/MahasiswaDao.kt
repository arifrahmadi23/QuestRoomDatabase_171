package com.example.mvvmdengandatabase.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.example.mvvmdengandatabase.data.entity.Mahasiswa

@Dao
interface MahasiswaDao {

    @Insert
    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)
}