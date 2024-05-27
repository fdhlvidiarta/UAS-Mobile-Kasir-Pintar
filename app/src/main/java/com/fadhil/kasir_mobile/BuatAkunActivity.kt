package com.fadhil.kasir_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class BuatAkunActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buat_akun)

        val imgBack: ImageView = findViewById(R.id.btn_back)
        val btnBuatakun: Button = findViewById(R.id.buat_akun_button)

        imgBack.setOnClickListener {
            // Buat Intent untuk memulai activity kedua
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent) // Memulai activity kedua
        }

        btnBuatakun.setOnClickListener {
            // Buat Intent untuk memulai activity kedua
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent) // Memulai activity kedua
        }
    }
}