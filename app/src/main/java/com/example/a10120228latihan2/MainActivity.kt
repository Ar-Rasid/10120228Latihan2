package com.example.a10120228latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//Tanggal : 24 April 2023
//NIM     : 10120228
//Nama    : Muhammad Hasbi Ar-Rasid
//Kelas   : IF 6

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<TextView>(R.id.register)

        btnClick.setOnClickListener {
            Intent(this, MainActivity2::class.java).also {
                startActivity(it)
            }
        }

    }
}