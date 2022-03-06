package com.obhai.mylearnings

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.SharedPreferences
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject


@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var randomString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val sharedpreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE)
val ed = sharedpreferences.edit()
        ed.putFloat("fl",0.0f)
        println("tridiv "+randomString)
    }
}