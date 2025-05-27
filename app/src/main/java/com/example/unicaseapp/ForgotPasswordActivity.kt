package com.example.unicaseapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ForgotPasswordActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_forgot_password)

        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.title = "Forgot Password"

        val buttonSendOTP: Button = findViewById(R.id.buttonSendOTP)

        buttonSendOTP.setOnClickListener {
            // Logika kirim OTP (validasi email)
            Toast.makeText(this, "OTP Sent (Placeholder)", Toast.LENGTH_SHORT).show()
            // Arahkan ke halaman Verifikasi Kode
            val intent = Intent(this, VerifyCodeActivity::class.java)
            // intent.putExtra("USER_EMAIL", editTextEmailForgot.text.toString()) // Kirim email ke activity berikutnya
            startActivity(intent)
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressedDispatcher.onBackPressed()
        return true
    }
}