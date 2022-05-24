package com.example.constraintactivitity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val image = findViewById<ImageView>(R.id.imageView2)
        image.setOnClickListener {
            val intent = Intent(this,ProfileActivity::class.java)
                startActivity(intent)
        }
    }
}