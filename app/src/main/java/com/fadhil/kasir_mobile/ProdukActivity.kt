package com.fadhil.kasir_mobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.fadhil.kasir_mobile.data.Repo_Produk
import com.google.android.material.tabs.TabLayout

class ProdukActivity : AppCompatActivity() {

    // Deklarasi variabel untuk tampilan produk dan data
    private lateinit var productImage: ImageView
    private lateinit var imageTabLayout: TabLayout
    private lateinit var productName: TextView
    private lateinit var productType: TextView
    private lateinit var productPrice: TextView
    private lateinit var productDescription: TextView
    private lateinit var addToCartButton: Button

    // Deklarasi variabel untuk repositori produk
    private lateinit var productRepository: Repo_Produk
    private lateinit var products: List<Repo_Produk.Product>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_produk) // Set layout activity_produk sebagai tata letak konten

        // Inisialisasi tampilan tombol navigasi
        val imgBack: ImageView = findViewById(R.id.img_back)
        val home: ImageView = findViewById(R.id.homeButton)
        val keranjang: ImageView = findViewById(R.id.cartButton)

        // Memberikan fungsi klik untuk tombol navigasi
        imgBack.setOnClickListener {
            val intent = Intent(this, BerandaActivity::class.java)
            startActivity(intent)
        }
        home.setOnClickListener {
            val intent = Intent (this, ProdukActivity::class.java)
            startActivity(intent)
        }
        keranjang.setOnClickListener {
            val intent = Intent(this, KeranjangActivity::class.java)
            startActivity(intent)
        }

        // Inisialisasi repositori produk dan data produk
        productRepository = Repo_Produk()
        products = productRepository.getProducts()

        // Inisialisasi tampilan produk
        productImage = findViewById(R.id.productImage)
        imageTabLayout = findViewById(R.id.imageTabLayout)
        productName = findViewById(R.id.productName)
        productType = findViewById(R.id.productType)
        productPrice = findViewById(R.id.productPrice)
        productDescription = findViewById(R.id.productDescription)
        addToCartButton = findViewById(R.id.addToCartButton)

        // Tambahkan tab untuk setiap produk
        for (i in products.indices) {
            imageTabLayout.addTab(imageTabLayout.newTab().setText("Produk ${i + 1}"))
        }

        // Set data produk awal
        updateProductDetails(0)

        // Set listener untuk tab layout
        imageTabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab?) {
                val tabPosition = tab?.position ?: 0
                updateProductDetails(tabPosition)
            }
            override fun onTabUnselected(tab: TabLayout.Tab?) {

            }
            override fun onTabReselected(tab: TabLayout.Tab?) {

            }
        })

        // Set listener untuk tombol "Tambahkan ke Keranjang"
        addToCartButton.setOnClickListener {
            val intent = Intent(this, KeranjangActivity::class.java)
            startActivity(intent)
        }
    }

    // Fungsi untuk memperbarui detail produk berdasarkan index
    private fun updateProductDetails(index: Int) {
        val product = products[index]
        productImage.setImageResource(product.imageResourceId)
        productName.text = product.name
        productType.text = product.type
        productPrice.text = product.price
        productDescription.text = product.description
    }
}
