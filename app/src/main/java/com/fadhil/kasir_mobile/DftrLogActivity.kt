package com.fadhil.kasir_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class DftrLogActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dftr_log)

        val btnMasuk: Button = findViewById(R.id.btn_masuk)
        val btnBuatAkun: Button = findViewById(R.id.btn_buat_akun)
        val imgBack: ImageView = findViewById(R.id.img_back)

        btnMasuk.setOnClickListener {
            // Buat Intent untuk memulai activity baru di sini
            val intent = Intent(this, BuatAkunActivity::class.java)
            startActivity(intent)
        }

        btnBuatAkun.setOnClickListener {
            // Buat Intent untuk memulai activity baru di sini
            val intent = Intent(this, MasukActivity::class.java)
            startActivity(intent)
        }

        imgBack.setOnClickListener {
            // Kembali ke MainActivity
            finish()
        }
    }
}