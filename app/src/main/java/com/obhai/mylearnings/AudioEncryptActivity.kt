package com.obhai.mylearnings

import android.content.Context
import android.os.Build
import android.os.Environment
import androidx.security.crypto.EncryptedFile
import androidx.security.crypto.MasterKey
import dagger.hilt.android.qualifiers.ApplicationContext
import java.io.File


class AudioEncryptActivity {
    private val context: Context? = null
    private val applicationContext: ApplicationContext? = null

    private fun test(): File {
        val path = if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            Environment.getStorageDirectory().toString() + "/Pictures"
        } else {
            TODO("VERSION.SDK_INT < R")
        }
        val directory = File(path);
        return directory
//    val files = directory.listFiles();

    }


    private val keyGenParameterSpec =
        MasterKey.Builder(context!!, MasterKey.DEFAULT_MASTER_KEY_ALIAS)

    var masterKey = MasterKey.Builder(context!!, MasterKey.DEFAULT_MASTER_KEY_ALIAS)
        .setKeyScheme(MasterKey.KeyScheme.AES256_GCM)
        .build()


    val fileToRead = "my_sensitive_data.txt"
    val encryptedFile = EncryptedFile.Builder(
        context!!,
        File(test(), fileToRead),
        masterKey,
        EncryptedFile.FileEncryptionScheme.AES256_GCM_HKDF_4KB
    ).build()

}