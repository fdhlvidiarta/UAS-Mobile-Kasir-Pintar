package com.fadhil.kasir_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MasukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk)

        val imgBack: ImageView = findViewById(R.id.btn_back)
        val btnMasuk: Button = findViewById(R.id.btn_masuk)

        imgBack.setOnClickListener {
            // Buat Intent untuk memulai activity kedua
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent) // Memulai activity kedua
        }

        btnMasuk.setOnClickListener {
            // Buat Intent untuk memulai activity kedua
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent) // Memulai activity kedua
        }
    }
}