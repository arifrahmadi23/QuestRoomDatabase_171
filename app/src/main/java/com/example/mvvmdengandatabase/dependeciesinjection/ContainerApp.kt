package com.example.mvvmdengandatabase.dependeciesinjection

import android.content.Context
import com.example.mvvmdengandatabase.data.database.KrsDatabase
import com.example.mvvmdengandatabase.repository.LocalRepositoryMhs
import com.example.mvvmdengandatabase.repository.RepositoryMhs

interface InterfaceContainerApp {
    //Semua repository masukan ke inteface ini
    val RepositoryMhs: RepositoryMhs
}

class ContainerApp(private val context: Context) : InterfaceContainerApp {
    override val RepositoryMhs: RepositoryMhs by lazy {
        //repository berhubungan dengan room database dan berhubungan dengan Dao, bekerja dalam satu container
        LocalRepositoryMhs(KrsDatabase.getDatabase(context).mahasiswaDao())
    }
}

