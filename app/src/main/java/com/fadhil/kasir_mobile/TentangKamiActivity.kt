package com.fadhil.kasir_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class TentangKamiActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tentang_kami)

        // Mencari referensi ke view komponen di layout
        val imgBack: ImageView = findViewById(R.id.img_back)

        // Memberikan fungsi onClickListener untuk tombol kembali
        imgBack.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
        }
    }
}
