package com.fadhil.kasir_mobile.data

import com.fadhil.kasir_mobile.R

class Repo_Produk {

    // Data produk yang disimpan dalam list
    private val products = listOf(
        Product(R.drawable.product_1,
            "Motherboard Asus B150M Pro",
            "Elektronik",
            "Rp. 2.430.000,00",
            "ASUS B150M PRO GAMING: Motherboard M-ATX untuk Performa Gaming Optimal Motherboard ASUS B150M PRO GAMING adalah pilihan tepat bagi Anda yang ingin membangun PC gaming dengan ukuran mini-ATX (mATX) yang ringkas namun bertenaga. Motherboard ini menggunakan chipset Intel B150 dan kompatibel dengan prosesor Intel Core i7, i5, dan i3 generasi ke-6 Socket LGA1151."),
        Product(R.drawable.product_2,
            "Monitor LG 27GR75Q QHD",
            "Elektronik",
            "Rp. 3.675.000,00",
            "LG 27GR75Q-B monitor gaming 27 inci dengan resolusi QHD (2560 x 1440) dan refresh rate 165Hz yang dirancang untuk menghadirkan pengalaman bermain game yang mulus dan responsif. Monitor ini memiliki panel IPS yang memberikan warna yang akurat dan sudut pandang yang lebar, serta teknologi HDR10 untuk meningkatkan kontras dan detail gambar.")
    )

    // Fungsi untuk mengembalikan daftar produk
    fun getProducts(): List<Product> {
        return products
    }

    // Data class untuk merepresentasikan sebuah produk
    data class Product(
        val imageResourceId: Int,
        val name: String,
        val type: String,
        val price: String,
        val description: String
    )
}
