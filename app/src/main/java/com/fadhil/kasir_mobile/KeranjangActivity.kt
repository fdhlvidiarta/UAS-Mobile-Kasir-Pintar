package com.fadhil.kasir_mobile

import android.content.Intent
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class KeranjangActivity : AppCompatActivity() {

    // Deklarasi variabel late-init untuk komponen-komponen tampilan
    private lateinit var kapasitasTxt: TextView
    private lateinit var kapasitasItem: TextView
    private lateinit var totalUang: TextView
    private lateinit var plusButton: ImageView
    private lateinit var beliButton: Button

    // Inisialisasi variabel untuk jumlah item dan harga per item
    private var itemCount: Int = 1
    private var itemPrice: Int = 2430000 // Harga per item dalam rupiah

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_keranjang) // Mengatur tata letak tampilan dengan layout activity_keranjang.xml

        val imgBack: ImageView = findViewById(R.id.img_back)
        val home: ImageView = findViewById(R.id.homeButton)
        val keranjang: ImageView = findViewById(R.id.cartButton)

        // Menambahkan listener untuk tombol-tombol navigasi
        imgBack.setOnClickListener {
            val intent = Intent(this, ProdukActivity::class.java)
            startActivity(intent) // Memulai aktivitas ProdukActivity
        }
        home.setOnClickListener {
            val intent = Intent (this, ProdukActivity::class.java)
            startActivity(intent) // Memulai aktivitas ProdukActivity
        }
        keranjang.setOnClickListener {
            val intent = Intent(this, KeranjangActivity::class.java)
            startActivity(intent) // Memulai kembali aktivitas KeranjangActivity
        }

        // Menginisialisasi komponen-komponen tampilan
        kapasitasTxt = findViewById(R.id.kapasitasTxt)
        kapasitasItem = findViewById(R.id.kapasitasItem)
        totalUang = findViewById(R.id.totalUang)
        plusButton = findViewById(R.id.plusButton)
        beliButton = findViewById(R.id.beliButton)

        // Memperbarui tampilan UI dengan data awal
        updateUI()

        // Tambahkan listener untuk plusButton
        plusButton.setOnClickListener {
            itemCount++ // Menambah jumlah item saat tombol plus diklik
            updateUI()
        }

        // Tambahkan listener untuk beliButton
        beliButton.setOnClickListener {
            Toast.makeText(this, "Pembelian sedang diproses", Toast.LENGTH_SHORT).show()
        }
    }

    //Fungsi untuk memperbarui tampilan UI dengan data terbaru
    private fun updateUI() {
        kapasitasItem.text = "$itemCount Item" // Menetapkan teks jumlah item
        val totalPrice = itemCount * itemPrice // Menghitung total harga
        totalUang.text = "Rp. ${totalPrice.toLocaleString()}" // Menetapkan teks total harga dalam format mata uang Indonesia
    }

    // Fungsi untuk mengubah angka menjadi format mata uang Indonesia
    private fun Int.toLocaleString(): String {
        return String.format("%,d", this).replace(',', '.')
    }
}
