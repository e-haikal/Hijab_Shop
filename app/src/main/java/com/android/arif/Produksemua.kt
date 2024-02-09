package com.android.arif

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridView
import androidx.activity.ComponentActivity

class Produksemua : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.produksemua)

        val namas:List<String> = listOf("Alesha", "Pasmina", "Bergo", "Zayana")
        val fotos:List<Int> = listOf(R.drawable.produk_alesha, R.drawable.produk_pasmina, R.drawable.produk_bergo, R.drawable.produk_zayana)

        val grid_produk:GridView = findViewById(R.id.grid_produk)

        val perulangan_data = Produksemuaitem(this, namas, fotos)

        grid_produk.adapter = perulangan_data
    }
}