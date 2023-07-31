package com.example.myapplication

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HobbiesActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobbies)

        val layoutManager = LinearLayoutManager(this)
    layoutManager.orientation = LinearLayoutManager.VERTICAL
    findViewById<RecyclerView>(R.id.hobbiesRecyclerView).layoutManager = layoutManager
    val adapter = HobbiesAdapter(this, Supplier.hobbies)
    findViewById<RecyclerView>(R.id.hobbiesRecyclerView).adapter = adapter

    }
}