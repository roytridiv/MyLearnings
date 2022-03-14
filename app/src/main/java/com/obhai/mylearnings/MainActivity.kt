package com.obhai.mylearnings

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.SharedPreferences
import androidx.activity.ComponentActivity
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.ComposeView
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
import javax.inject.Named


@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    @Named("test_string2")
    lateinit var randomString: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        findViewById<ComposeView>(R.id.compose_view).setContent {
//            MaterialTheme {
//                myApp()
//            }
//        }


//        setContentView(R.layout.activity_main)
        val sharedpreferences = getSharedPreferences("MyPREFERENCES", Context.MODE_PRIVATE)
        val ed = sharedpreferences.edit()
        ed.putFloat("fl", 0.0f)
        println("tridiv " + randomString)
    }
}

@Composable
fun myApp() {
    Text("Hello Compose")
}