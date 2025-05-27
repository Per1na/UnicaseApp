package com.example.unicaseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class SignUpActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        val buttonSignUp: Button = findViewById(R.id.buttonSignUp)
        val textViewTermsLink: TextView = findViewById(R.id.textViewTermsLink)
        val textViewSignInLink: TextView = findViewById(R.id.textViewSignInLinkFromSignUp)
        val checkBoxTerms: CheckBox = findViewById(R.id.checkBoxTerms)
        // val editTextNameSignUp: EditText = findViewById(R.id.editTextNameSignUp)
        // ... (other EditTexts)

        buttonSignUp.setOnClickListener {
            if (checkBoxTerms.isChecked) {
                // Logika Sign Up
                Toast.makeText(this, "Sign Up Successful (Placeholder)", Toast.LENGTH_SHORT).show()
                // Arahkan ke Sign In atau Home setelah Sign Up
                startActivity(Intent(this, SignInActivity::class.java))
                finish()
            } else {
                Toast.makeText(this, "Please agree to the terms and conditions.", Toast.LENGTH_SHORT).show()
            }
        }

        textViewTermsLink.setOnClickListener {
            startActivity(Intent(this, TermsConditionsActivity::class.java))
        }

        textViewSignInLink.setOnClickListener {
            startActivity(Intent(this, SignInActivity::class.java))
            finish() // Tutup SignUpActivity agar tidak kembali ke sini dari SignIn
        }
    }
}