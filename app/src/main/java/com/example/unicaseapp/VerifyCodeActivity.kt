package com.example.unicaseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class VerifyCodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify_code)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Verify Code"

        val buttonVerify: Button = findViewById(R.id.buttonVerify)
        val textViewResendCode: TextView = findViewById(R.id.textViewResendCode)
        // val editTextOTP: EditText = findViewById(R.id.editTextOTP)
        // val userEmail = intent.getStringExtra("USER_EMAIL")
        // val textViewVerifySubtitle: TextView = findViewById(R.id.textViewVerifySubtitle)
        // textViewVerifySubtitle.text = "Please enter the code we just sent to email\n$userEmail"


        buttonVerify.setOnClickListener {
            // Logika verifikasi OTP
            Toast.makeText(this, "OTP Verified (Placeholder)", Toast.LENGTH_SHORT).show()
            // Arahkan ke halaman New Password
            startActivity(Intent(this, NewPasswordActivity::class.java))
            finish()
        }

        textViewResendCode.setOnClickListener {
            // Logika kirim ulang OTP
            Toast.makeText(this, "Resending OTP (Placeholder)", Toast.LENGTH_SHORT).show()
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}