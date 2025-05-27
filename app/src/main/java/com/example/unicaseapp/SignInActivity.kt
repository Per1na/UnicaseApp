package com.example.unicaseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignInActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        val buttonSignIn: Button = findViewById(R.id.buttonSignIn)
        val textViewForgotPassword: TextView = findViewById(R.id.textViewForgotPassword)
        val textViewSignUpLink: TextView = findViewById(R.id.textViewSignUpLink)
        // val editTextEmailSignIn: EditText = findViewById(R.id.editTextEmailSignIn)
        // val editTextPasswordSignIn: EditText = findViewById(R.id.editTextPasswordSignIn)


        buttonSignIn.setOnClickListener {
            // Logika Sign In (validasi input, dll.)
            // Untuk sekarang, langsung ke Home
            Toast.makeText(this, "Sign In Clicked", Toast.LENGTH_SHORT).show()
            startActivity(Intent(this, HomeActivity::class.java))
            finishAffinity() // Tutup semua activity sebelumnya di stack
        }

        textViewForgotPassword.setOnClickListener {
            startActivity(Intent(this, ForgotPasswordActivity::class.java))
        }

        textViewSignUpLink.setOnClickListener {
            startActivity(Intent(this, SignUpActivity::class.java))
        }
    }
}