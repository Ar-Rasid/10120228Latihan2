package com.example.a10120228latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

//Tanggal : 24 April 2023
//NIM     : 10120228
//Nama    : Muhammad Hasbi Ar-Rasid
//Kelas   : IF 6

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnClick = findViewById<Button>(R.id.btnRegister)

        btnClick.setOnClickListener {
            Intent(this, MainActivity3::class.java).also {
                startActivity(it)
            }
        }
    }
}