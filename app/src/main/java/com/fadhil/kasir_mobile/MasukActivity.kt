package com.fadhil.kasir_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MasukActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_masuk) // Set layout activity_masuk sebagai tata letak konten

        // Mencari referensi ke view komponen di layout
        val imgBack: ImageView = findViewById(R.id.img_back)
        val btnMasuk: Button = findViewById(R.id.btn_masuk)
        val Daftardisini: TextView = findViewById(R.id.txt_Daftardisini)

        // Memberikan fungsi onClickListener untuk tombol kembali
        imgBack.setOnClickListener {
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent)
        }
        // Memberikan fungsi onClickListener untuk tombol "Daftar disini"
        btnMasuk.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
        }
        // Memberikan fungsi onClickListener untuk teks "Daftar disini"
        Daftardisini.setOnClickListener {
            val intent = Intent(this, BuatAkunActivity::class.java)
            startActivity(intent)
        }
    }
}