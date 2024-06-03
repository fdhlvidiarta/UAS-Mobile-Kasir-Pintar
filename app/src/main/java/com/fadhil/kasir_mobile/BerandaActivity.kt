package com.fadhil.kasir_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import com.fadhil.kasir_mobile.R

class BerandaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_beranda)

        val imgBack: ImageView = findViewById(R.id.img_back)
        val staffImg: ImageView = findViewById(R.id.staffImage)
        val btnProfil: Button = findViewById(R.id.btnProfil)
        val btnProduk: Button = findViewById(R.id.btnProduk)
        val btnTentangKami: Button = findViewById(R.id.btnTentangKami)

        imgBack.setOnClickListener {
            val intent = Intent(this, DftrLogActivity::class.java)
            startActivity(intent)
        }

        staffImg.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.fade_in, android.R.anim.fade_out)
        }

        btnProfil.setOnClickListener {
            val intent = Intent(this, ProfilActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }

        btnProduk.setOnClickListener {
            val intent = Intent(this, ProdukActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }

        btnTentangKami.setOnClickListener {
            val intent = Intent(this, TentangKamiActivity::class.java)
            startActivity(intent)
            overridePendingTransition(android.R.anim.slide_in_left, android.R.anim.slide_out_right)
        }
    }
}