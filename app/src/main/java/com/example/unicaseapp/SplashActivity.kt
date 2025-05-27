package com.example.unicaseapp

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val SPLASH_TIME_OUT: Long = 3000 // 3 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        Handler(Looper.getMainLooper()).postDelayed({
            // Intent untuk memulai WelcomeActivity
            startActivity(Intent(this, WelcomeActivity::class.java))
            // Tutup activity ini
            finish()
        }, SPLASH_TIME_OUT)
    }
}