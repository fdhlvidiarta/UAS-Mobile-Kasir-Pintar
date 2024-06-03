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

        // Mencari referensi ke view komponen di layout
        val btnMasuk: Button = findViewById(R.id.btn_masuk)
        val btnBuatAkun: Button = findViewById(R.id.btn_buat_akun)
        val imgBack: ImageView = findViewById(R.id.img_back)

        // Memberikan fungsi klik untuk btnMasuk ke activityMasuk
        btnMasuk.setOnClickListener {
            val intent = Intent(this, MasukActivity::class.java)
            startActivity(intent)
        }
        // Memberikan fungsi klik untuk btnBuatakun ke activityBuatAkun
        btnBuatAkun.setOnClickListener {
            val intent = Intent(this, BuatAkunActivity ::class.java)
            startActivity(intent)
        }

        // Memberikan fungsi onClickListener untuk tombol kembali
        imgBack.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}