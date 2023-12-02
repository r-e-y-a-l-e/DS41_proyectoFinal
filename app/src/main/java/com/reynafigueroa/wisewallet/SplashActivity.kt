package com.reynafigueroa.wisewallet

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class SplashActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val splash = findViewById<ImageView>(R.id.splash)

        splash.setOnClickListener(){

            val i = Intent(this, AuthActivity::class.java)
            startActivity(i)

            finish()
        }


    }
}