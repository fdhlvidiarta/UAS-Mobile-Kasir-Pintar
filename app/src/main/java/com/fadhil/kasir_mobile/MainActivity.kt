package com.fadhil.kasir_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Set layout activity_main sebagai tata letak konten

        // Mencari referensi ke view komponen di layout
        val btnNext: Button = findViewById(R.id.btn_next)
        val imgPanah: ImageView = findViewById(R.id.img_panah)

        // Memberikan fungsi klik untuk tombol navigasi btnNext ke activity_DftrLogin
        btnNext.setOnClickListener {
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent)
        }
        imgPanah.setOnClickListener {
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent)
        }
    }
}