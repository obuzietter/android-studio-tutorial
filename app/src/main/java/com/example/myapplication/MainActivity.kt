package com.example.myapplication

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            //Log.i("MainActivity", "Button was clicked")
            Toast.makeText(this, "I was  clicked", Toast.LENGTH_SHORT).show()
        }


    }


}

