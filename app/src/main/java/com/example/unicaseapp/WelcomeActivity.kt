package com.example.unicaseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class WelcomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)

        val buttonGetStarted: Button = findViewById(R.id.buttonGetStarted)
        val textViewSignInLink: TextView = findViewById(R.id.textViewSignInLink)

        buttonGetStarted.setOnClickListener {
            // Arahkan ke halaman Sign Up
            startActivity(Intent(this, SignUpActivity::class.java))
        }

        textViewSignInLink.setOnClickListener {
            // Arahkan ke halaman Sign In
            startActivity(Intent(this, SignInActivity::class.java))
        }
    }
}