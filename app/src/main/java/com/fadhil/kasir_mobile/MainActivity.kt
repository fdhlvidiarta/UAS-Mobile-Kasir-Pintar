package com.fadhil.kasir_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnNext: Button = findViewById(R.id.btn_next)
        val imgPanah: ImageView = findViewById(R.id.img_panah)

        imgPanah.setOnClickListener {
            // Buat Intent untuk memulai activity kedua
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent) // Memulai activity kedua
        }

        btnNext.setOnClickListener {
            // Buat Intent untuk memulai activity kedua
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent) // Memulai activity kedua
        }
    }
}