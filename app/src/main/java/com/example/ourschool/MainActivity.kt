package com.example.ourschool

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val logo:ImageView=findViewById(R.id.logo)
        val title:TextView=findViewById(R.id.title)
        val progressBar:ProgressBar=findViewById(R.id.progressBar)
        val motto:TextView=findViewById(R.id.motto)

        val top_anim:Animation= AnimationUtils.loadAnimation(this,R.anim.top)
        val bottom_anim:Animation = AnimationUtils.loadAnimation(this,R.anim.bottom)
        logo.startAnimation(top_anim)
        title.startAnimation(bottom_anim)
        progressBar.startAnimation(bottom_anim)
        motto.startAnimation(bottom_anim)

        Handler().postDelayed({
            startActivity(Intent(this,SignupActivity::class.java))
            finish()
        }
        ,3000)

    }
}