package com.example.listviewicon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.listviewicon.adapter.ListBahasaAdapter
import com.example.listviewicon.model.Bahasa
import com.example.listviewicon.model.BahasaPemrogramanData

class MainActivity : AppCompatActivity() {
    private lateinit var rvBPemrograman: RecyclerView
    private var list: ArrayList<Bahasa> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvBPemrograman = findViewById(R.id.RV_BAHASA)
        rvBPemrograman.setHasFixedSize(true)
        list.addAll(BahasaPemrogramanData.listBahasa)
        showBahasaList()
    }

    private fun showBahasaList() {
        rvBPemrograman.layoutManager = LinearLayoutManager(this)
        val listBahasaAdapter = ListBahasaAdapter(list)
        rvBPemrograman.adapter = listBahasaAdapter
    }
}
