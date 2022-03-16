package com.obhai.mylearnings

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Environment
import java.io.*
import android.os.Build
import androidx.security.crypto.EncryptedFile
//import androidx.security.crypto.MasterKey


class MainActivity2 : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
//        val masterKey = MasterKey.Builder(this, MasterKey.DEFAULT_MASTER_KEY_ALIAS)
//            .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
//            .build()

//        val fileToRead = "testrrr.mp3"
//        val encryptedFile = EncryptedFile.Builder(
//            this,
//            File(test(), fileToRead),
//            masterKey,
//            EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB
//        ).build()
//
//        println("tridiv "+encryptedFile.openFileInput())
        val t = test()
    }

    @SuppressLint("NewApi")
    private fun test(): File {

        val path = Environment.getDownloadCacheDirectory().path

//        val path =
//            Environment.getDataDirectory().toString() + "/Pictures"

        println("tridiv Files"+ "Path: $path")
        val directory = File(path)
        val files = directory.listFiles()
        println("tridiv Files"+ "Size: " + files.size)
        for (i in files.indices) {
            println("tridiv  Files"+ "FileName:" + files[i].name)
        }
        return File(path)
    }





}

