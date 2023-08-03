package com.example.ourschool

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener {
            val i = Intent(this,DescribeActivity::class.java)
            startActivity(i)
        }
    }
}