package com.fadhil.kasir_mobile

import android.content.Intent
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class ProfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profil) // Set layout activity_profil sebagai tata letak konten

        // Mencari referensi ke view komponen di layout
        val imgBack: ImageView = findViewById(R.id.img_back)

        // Memberikan fungsi onClickListener untuk tombol kembali
        imgBack.setOnClickListener { // Membuat intent untuk kembali ke BerandaActivity
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent) // Memulai aktivitas BerandaActivity
        }
    }

}