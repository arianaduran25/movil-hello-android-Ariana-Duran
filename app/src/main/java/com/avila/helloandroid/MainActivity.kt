package com.avila.helloandroid

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.avila.helloandroid.viewmodel.UserViewModel

class MainActivity : AppCompatActivity() {

    // ViewModel a nivel de Activity (compartido con fragments)
    private val viewModel: UserViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // El Fragment se carga automáticamente desde el XML
        // El ViewModel está disponible para todos los fragments
    }
}