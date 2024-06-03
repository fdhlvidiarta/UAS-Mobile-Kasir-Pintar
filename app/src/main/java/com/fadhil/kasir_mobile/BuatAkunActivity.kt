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

        // Mencari referensi ke view komponen di layout
        val imgBack: ImageView = findViewById(R.id.btn_back)
        val btnBuatakun: Button = findViewById(R.id.buat_akun_button)

        // Memberikan fungsi onClickListener untuk tombol kembali
        imgBack.setOnClickListener { // Membuat intent untuk kembali ke DftrLogActivity
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent)
        }
        // Memberikan fungsi klik untuk btnBuatakun ke activityMasuk
        btnBuatakun.setOnClickListener {
            val intent = Intent(this, MasukActivity::class.java)
            startActivity(intent)
        }
    }
}