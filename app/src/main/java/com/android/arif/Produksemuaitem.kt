package com.android.arif

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class Produksemuaitem(val halaman:Produksemua, val namas:List<String>, val fotos:List<Int>) : BaseAdapter() {
    override fun getCount(): Int {
        return namas.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val view = LayoutInflater.from(halaman).inflate(R.layout.produksemua_item, parent, false)
        val img_foto:ImageView = view.findViewById(R.id.img_foto)
        val txt_nama:TextView = view.findViewById(R.id.txt_namaproduk)

        txt_nama.text = namas.get(position)
        img_foto.setImageResource(fotos.get(position))
        return view
    }
}
