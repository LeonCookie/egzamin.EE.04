package com.example.pierwszyprogram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.mojPrzycisk).setOnClickListener {
            findViewById<Button>(R.id.mojPrzycisk).text = "dziala"
        }
    }
}