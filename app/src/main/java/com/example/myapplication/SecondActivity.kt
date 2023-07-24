package com.example.myapplication


import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val bundle : Bundle? = intent.extras
        val message = bundle!!.getString("m")
        val textView : TextView = findViewById(R.id.messageTV)
        textView.text = message



    }


}

