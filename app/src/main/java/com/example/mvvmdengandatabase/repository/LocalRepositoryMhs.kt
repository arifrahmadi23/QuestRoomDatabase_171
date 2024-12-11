package com.example.mvvmdengandatabase.repository

import com.example.mvvmdengandatabase.data.dao.MahasiswaDao
import com.example.mvvmdengandatabase.data.entity.Mahasiswa
//DI repository buat kan satu interface dan class untuk satu entitas
class LocalRepositoryMhs (
    private val mahasiswaDao: MahasiswaDao
) : RepositoryMhs {
    override suspend fun insertMhs(mahasiswa: Mahasiswa) {
        mahasiswaDao.insertMahasiswa(mahasiswa)
    }

}