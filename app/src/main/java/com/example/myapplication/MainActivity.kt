package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            //Log.i("MainActivity", "Button was clicked")
            //Toast.makeText(this, "I was  clicked", Toast.LENGTH_SHORT).show()
            val message:String = findViewById<EditText>(R.id.messageET).text.toString()
            Toast.makeText(this, "Message sent!",  Toast.LENGTH_SHORT).show()
            val intent  = Intent(this, SecondActivity::class.java)
            intent.putExtra("m", message)
            startActivity(intent)
        }
        val shareBtn : Button = findViewById(R.id.shareBtn)
        shareBtn.setOnClickListener {
            val message:String = findViewById<EditText>(R.id.messageET).text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "text/plain"
            startActivity(Intent.createChooser(intent, "Share to : "))

        }


    }


}

